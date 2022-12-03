package com.carClound.ui.admin;

import com.carClound.service.AddCarService;
import com.carClound.service.UpdateCarInfoService;
import com.carClound.service.impl.AddCarImpl;
import com.carClound.service.impl.UpdateCarInfoImpl;
import com.carClound.utils.Constant;
import com.carClound.utils.UIUtils;
import com.carClound.vo.Result;
import com.carClound.vo.SystemException;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;

public class EditUI {
	public static final Integer EDIT_ADD = 0;
	public static final Integer EDIT_UPDATE = 1;
	private JFrame jFrame;
	private JPanel jPanel;
	private JComboBox<String> comboBox;
	private Integer CarType = 0;

	private final Integer type;
	public EditUI(Integer type) {
		this.type = type;
		typeUI();
	}

	public void typeUI() {
		JDialog typeUI = new JDialog();
		typeUI.setTitle("云柚汽车租赁系统");
		typeUI.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		typeUI.setVisible(true);
		typeUI.pack();
		typeUI.setBounds(1100, 500, 500, 350);
		typeUI.setResizable(false);

		JPanel panel = new JPanel();
		panel.setLayout(null);


		// 添加一个下拉列表框
		JLabel comboBoxLabel = null;
		if (this.type == 0)
			comboBoxLabel = new JLabel("请要添加的选择车辆类型：");
		else
			comboBoxLabel = new JLabel("请要更新的选择车辆类型：");
		comboBoxLabel.setFont(Constant.KAI_TI);
		String[] listData = new String[]{"轿车", "卡车", "货车"};
		comboBox = new JComboBox<>(listData);
		comboBox.setFont(Constant.KAI_TI);
		comboBoxLabel.setBounds(100, 50, 300, 50);
		comboBox.setBounds(150, 120, 200, 50);
		// 设置默认选中条目
		comboBox.setSelectedIndex(0);

		// 确认 按钮
		JButton confirm = new JButton("确认");
		confirm.setFont(Constant.KAI_TI);
		confirm.setBounds(350, 220, 100, 45);

		comboBox.addItemListener(e -> {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				this.CarType = comboBox.getSelectedIndex();
			}
		});

		confirm.addActionListener(e -> {
			if (CarType != -1) {
				jFrame = new JFrame();
				UIUtils.init(jFrame, new int[]{1100, 400, 500, 450});
				jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				// 创建主界面
				jPanel = new JPanel();
				jPanel.setLayout(null);
				jFrame.setContentPane(jPanel);
				placeComponents();
				typeUI.dispose();
			} else {
				throw new SystemException("请选择类型");
			}
		});

		typeUI.setContentPane(panel);
		panel.add(comboBoxLabel);
		panel.add(comboBox);
		panel.add(confirm);
	}
	private void placeComponents() {
		JLabel vehicleIdLabel = new JLabel("车牌号：");
		JTextArea vehicleIdText = new JTextArea();
		vehicleIdLabel.setBounds(100, 40, 100, 40);
		vehicleIdText.setBounds(200, 40, 200, 40);

		JLabel brandLabel = new JLabel("品牌：");
		JTextArea brandText = new JTextArea();
		brandLabel.setBounds(100, 100, 100, 40);
		brandText.setBounds(200, 100, 200, 40);

		String str = null;
		if (this.CarType == 0) str = "类型：";
		else if (this.CarType == 1) str = "座位数：";
		else if (this.CarType == 2) str = "吨位：";
		JLabel featureLabel = new JLabel(str);
		JTextArea featureText = new JTextArea();
		featureLabel.setBounds(100, 160, 100, 40);
		featureText.setBounds(200, 160, 200, 40);

		JLabel priceLabel = new JLabel("租金：");
		JTextArea priceText = new JTextArea();
		priceLabel.setBounds(100, 220, 100, 40);
		priceText.setBounds(200, 220, 200, 40);

		JButton confirm = new JButton("提交");
		confirm.setBounds(300, 300, 100, 50);

		confirm.addActionListener(e -> {
			// 获取数据
			Map<String, String> data = new HashMap<>();
			data.put("vehicleId", vehicleIdText.getText());
			data.put("brand", brandText.getText());
			data.put("price", priceText.getText());
			data.put("feature", featureText.getText());
			data.put("type", this.CarType.toString());
			// 调用实现类
			String res = null;
			if (this.type == 0) {
				AddCarService addCarService = new AddCarImpl();
				res = addCarService.addCarService(data);
			} else {
				UpdateCarInfoService updateCarInfoService = new UpdateCarInfoImpl();
				res = updateCarInfoService.updateCarInfo(data);
			}

			if ("success".equals(res)) {
				Result.success("操作成功！");
				this.jFrame.dispose();
			}
		});

		jPanel.add(vehicleIdLabel);
		jPanel.add(vehicleIdText);
		jPanel.add(brandLabel);
		jPanel.add(brandText);
		jPanel.add(featureLabel);
		jPanel.add(featureText);
		jPanel.add(priceLabel);
		jPanel.add(priceText);
		jPanel.add(confirm);
	}

}
