package com.carClound.ui.admin;

import com.carClound.dao.pojo.User;
import com.carClound.utils.UIUtils;

import javax.swing.*;
import java.awt.*;

public class AdminUI{
	private JFrame jFrame;
	private final User user;

	public AdminUI(User user) {
		this.user = user;
		initUI();
	}

	public void initUI() {
		jFrame = new JFrame();
		UIUtils.init(jFrame, new int[]{1100, 500, 650, 441});
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panel = new JPanel(null);
		jFrame.setContentPane(panel);

		JButton addCar = new JButton("添加车辆");
		addCar.setBounds(67, 45, 172, 112);
		JButton updateCar = new JButton("修改车辆信息");
		updateCar.setBounds(367, 45, 172, 112);
		JButton deleteCar = new JButton("删除车辆");
		deleteCar.setBounds(67, 220, 172, 112);
		JButton income = new JButton("营业情况");
		income.setBounds(367, 220, 172, 112);

		addCar.addActionListener(e -> {
			new EditUI(EditUI.EDIT_ADD);
		});

		income.addActionListener(e -> {
			new IncomeUI(user);
		});

		deleteCar.addActionListener(e -> {
			new RemoveUI(user);
		});

		updateCar.addActionListener(e -> {
			new EditUI(EditUI.EDIT_UPDATE);
		});

		panel.add(new Label());
		panel.add(new Label());
		panel.add(addCar);
		panel.add(updateCar);
		panel.add(deleteCar);
		panel.add(income);
	}
}
