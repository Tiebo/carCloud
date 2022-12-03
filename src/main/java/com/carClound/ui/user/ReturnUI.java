package com.carClound.ui.user;

import com.carClound.dao.pojo.User;
import com.carClound.service.ReturnService;
import com.carClound.service.impl.ReturnImpl;
import com.carClound.utils.Constant;
import com.carClound.utils.UIUtils;
import com.carClound.vo.Result;
import com.carClound.vo.SystemException;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ReturnUI {
	private JFrame jFrame;
	private JComboBox<String> comboBox;
	private User user;
	private String vehicleId;

	public ReturnUI(User user) {
		this.user = user;
		initUI();
	}

	public void initUI() {
		jFrame = new JFrame();
		UIUtils.init(jFrame, new int[]{1100, 500, 500, 350});
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// 添加一个下拉列表框
		JLabel comboBoxLabel = new JLabel("请选择要归还的车辆：");
		comboBoxLabel.setFont(Constant.KAI_TI);
		this.user = Constant.userMapper.getUserInfoById(user.getId());
		String[] listData = user.getRentCar().split(",");
		if (listData[0].equals("0")) {
			listData[0] = "无可用车辆";
		}
		comboBox = new JComboBox<>(listData);
		comboBox.setFont(Constant.KAI_TI);
		comboBoxLabel.setBounds(100, 50, 300, 50);
		comboBox.setBounds(150, 120, 200, 50);
		// 设置默认选中条目
		comboBox.setSelectedIndex(0);
		this.vehicleId = comboBox.getItemAt(0);
		// 确认 按钮
		JButton confirm = new JButton("确认");
		confirm.setFont(Constant.KAI_TI);
		confirm.setBounds(350, 220, 100, 45);

		comboBox.addItemListener(e -> {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				this.vehicleId = Objects.requireNonNull(comboBox.getSelectedItem()).toString();
			}
		});
		Map<String, String> data = new HashMap<>();
		confirm.addActionListener(e -> {
			if (vehicleId.equals("无可用车辆")) {
				this.jFrame.dispose();
				throw new SystemException("无可用车辆");
			}
			data.put("vehicleId", this.vehicleId);
			data.put("userId", this.user.getId().toString());

			ReturnService returnService = new ReturnImpl();
			String resp = returnService.returnCar(data);
			if ("success".equals(resp)) {
				Result.success(vehicleId + "车辆归还成功");
				this.jFrame.dispose();
			}
		});

		jFrame.setContentPane(panel);
		panel.add(comboBoxLabel);
		panel.add(comboBox);
		panel.add(confirm);
	}
}
