package com.carClound.ui.user;

import com.carClound.dao.pojo.User;
import com.carClound.service.UpdateUserInfoService;
import com.carClound.service.impl.UpdateUserInfoImpl;
import com.carClound.ui.SystemUI;
import com.carClound.utils.Constant;
import com.carClound.utils.UIUtils;
import com.carClound.vo.Result;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class UpdateUserUI {
	private JFrame jFrame;
	private JPanel jPanel;
	private User user;

	public UpdateUserUI(User user) {
		this.user = Constant.userMapper.getUserInfoById(user.getId());
		typeUI();
	}

	public void typeUI() {
		jFrame = new JFrame();
		UIUtils.init(jFrame, new int[]{1100, 400, 500, 400});
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// 创建主界面
		jPanel = new JPanel();
		jPanel.setLayout(null);
		jFrame.setContentPane(jPanel);
		placeComponents();

	}
	private void placeComponents() {
		JLabel accountLabel = new JLabel("账户：");
		JTextArea accountText = new JTextArea();
		accountText.setText(user.getAccount());
		accountLabel.setBounds(100, 40, 100, 40);
		accountText.setBounds(200, 40, 200, 40);

		JLabel nameLabel = new JLabel("名称：");
		JTextArea nameText = new JTextArea();
		nameText.setText(user.getName());
		nameLabel.setBounds(100, 100, 100, 40);
		nameText.setBounds(200, 100, 200, 40);

		JLabel genderLabel = new JLabel("性别：");
		JTextArea genderText = new JTextArea();
		genderText.setText(user.getGender());
		genderLabel.setBounds(100, 160, 100, 40);
		genderText.setBounds(200, 160, 200, 40);

		JButton confirm = new JButton("提交");
		confirm.setBounds(300, 240, 100, 50);

		confirm.addActionListener(e -> {
			// 获取数据
			Map<String, String> data = new HashMap<>();
			data.put("id", user.getId().toString());
			data.put("account", accountText.getText());
			data.put("name", nameText.getText());
			data.put("gender", genderText.getText());
			// 调用实现类
			UpdateUserInfoService updateUserInfoService = new UpdateUserInfoImpl();
			String resp = updateUserInfoService.updateUserInfo(data);
			if ("success".equals(resp)) {
				Result.success("更新成功");
				SystemUI.refreshUser();
			}
		});

		jPanel.add(accountLabel);
		jPanel.add(accountText);
		jPanel.add(nameLabel);
		jPanel.add(nameText);
		jPanel.add(genderLabel);
		jPanel.add(genderText);
		jPanel.add(confirm);
	}

}
