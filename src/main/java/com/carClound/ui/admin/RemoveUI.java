package com.carClound.ui.admin;

import com.carClound.dao.pojo.Bus;
import com.carClound.dao.pojo.Car;
import com.carClound.dao.pojo.Truck;
import com.carClound.dao.pojo.User;
import com.carClound.service.RemoveCarService;
import com.carClound.service.impl.RemoveCarImpl;
import com.carClound.ui.SystemUI;
import com.carClound.utils.Constant;
import com.carClound.utils.UIUtils;
import com.carClound.vo.Result;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveUI {
	private JFrame jFrame;
	private JPanel jPanel;
	private final User user;

	public RemoveUI(User user) {
		this.user = user;
		getUI();
	}

	public void getUI() {
		jFrame = new JFrame();
		UIUtils.init(jFrame, new int[]{1100, 400, 500, 300});
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// 创建主界面
		jPanel = new JPanel();
		jPanel.setLayout(null);
		jFrame.setContentPane(jPanel);
		placeComponents();
	}

	private void placeComponents() {
		JLabel selectLabel = new JLabel("请输入车牌号进行查询：");
		selectLabel.setFont(Constant.KAI_TI);
		JTextArea selectText = new JTextArea();
		selectLabel.setBounds(125, 40, 400, 40);
		selectText.setBounds(150, 100, 200, 40);

		JButton select = new JButton("查询");
		select.setBounds(350, 180, 100, 50);

		select.addActionListener(e -> {
			Map<String, String> data = new HashMap<>();

			String brand = selectText.getText();
			List<Car> cars = Constant.carMapper.getCarList();
			List<Bus> buses = Constant.busMapper.getBusList();
			List<Truck> trucks = Constant.truckMapper.getTruckList();
			int res = -1;
			for (int i = 0; i < cars.size() || i < buses.size() || i < trucks.size(); i++) {
				if (i < cars.size() && cars.get(i).getVehicleId().equals(brand)) {
					res = Result.confirmDialog(
							"该车辆为品牌为轿车" + cars.get(i).getBrand()
									+ "，类型为" + cars.get(i).getType()
									+ "，总租金为" + cars.get(i).getPrice() + "每天\n"
									+ "\t\t您确定要删除么？");
					data.put("vehicleId", cars.get(i).getVehicleId());
					break;
				}
				if (i < buses.size() && buses.get(i).getVehicleId().equals(brand)) {
					res = Result.confirmDialog(
							"该车辆为品牌为卡车" + buses.get(i).getBrand()
									+ "，座位数为" + buses.get(i).getSeat()
									+ "，租金为" + buses.get(i).getPrice() + "每天\n"
									+ "\t\t您确定要删除么？");
					data.put("vehicleId", buses.get(i).getVehicleId());
					break;
				}
				if (i < trucks.size() && trucks.get(i).getVehicleId().equals(brand)) {
					res = Result.confirmDialog(
							"该车辆为品牌为货车" + trucks.get(i).getBrand()
									+ "，吨位为" + trucks.get(i).getTonnage()
									+ "，租金为" + trucks.get(i).getPrice() + "元每天\n"
									+ "\t\t您确定要删除么？");
					data.put("vehicleId", trucks.get(i).getVehicleId());
					break;
				}
			}
			if (res == 0) {
				data.put("userId", user.getId().toString());
				RemoveCarService rentCarService = new RemoveCarImpl();
				String resp = rentCarService.removeCar(data);
				if (resp.equals("success")) {
					SystemUI.refreshUser();
					Result.success("删除成功！");
					this.jFrame.dispose();
				}
			} else {
				this.jFrame.dispose();
			}
		});

		jPanel.add(selectLabel);
		jPanel.add(selectText);
		jPanel.add(select);
	}

}
