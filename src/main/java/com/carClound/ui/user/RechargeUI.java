package com.carClound.ui.user;

import com.carClound.dao.pojo.User;
import com.carClound.ui.SystemUI;
import com.carClound.utils.Constant;
import com.carClound.utils.UIUtils;
import com.carClound.vo.Result;

import javax.swing.*;

public class RechargeUI {
	private JFrame jFrame;
	private final User user;

	public RechargeUI(User user) {
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
		JLabel label = new JLabel("请输入要充值的金额：");
		label.setFont(Constant.KAI_TI);

		JTextArea jTextArea = new JTextArea();
		label.setBounds(125, 50, 300, 50);
		jTextArea.setBounds(150, 120, 200, 40);

		// 确认 按钮
		JButton confirm = new JButton("确认");
		confirm.setFont(Constant.KAI_TI);
		confirm.setBounds(350, 220, 100, 45);

		confirm.addActionListener(e -> {
			Integer number = Integer.valueOf(jTextArea.getText());
			user.setBalance(user.getBalance() + number);

			int i = Constant.userMapper.updateUserById(user);

			if (i == 1) {
				Result.success("充值成功!");
				SystemUI.refreshUser();
			}
		});

		jFrame.setContentPane(panel);
		panel.add(label);
		panel.add(jTextArea);
		panel.add(confirm);
	}
}
