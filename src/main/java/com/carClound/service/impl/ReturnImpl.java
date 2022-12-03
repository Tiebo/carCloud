package com.carClound.service.impl;

import com.carClound.dao.pojo.*;
import com.carClound.service.ReturnService;
import com.carClound.utils.Constant;
import com.carClound.vo.Result;

import java.text.SimpleDateFormat;
import java.util.*;

public class ReturnImpl implements ReturnService {
	/**
	 *
	 * @param data vehicleId userId
	 * @return "success"
	 */
	@Override
	public String returnCar(Map<String, String> data) {
		String vehicleId = data.get("vehicleId");
		Integer userId = Integer.valueOf(data.get("userId"));

		User user;
		Car car;
		user = Constant.userMapper.getUserInfoById(userId);
		car = Constant.carMapper.getCarByVehicleId(vehicleId);
		if (car.getVehicleId() == null)
			car = Constant.busMapper.getBusByVehicleId(vehicleId);
		if (car.getVehicleId() == null)
			car = Constant.truckMapper.getTruckByVehicleId(vehicleId);

		if (car.getVehicleId() != null) {
			car.setUserId(0);
			long now = new Date().getTime();
			long dd = now - Long.parseLong(car.getDate());
			if (dd >= 3600 && Long.parseLong(car.getDate()) != 0) {
				int i = Result.confirmDialog("汽车还有剩余时间, 确定要归还么");
				if (i != 0) {
					return "error";
				}
			}
			car.setDate("0");
			String rentCar = user.getRentCar();

			List<String> strings = new ArrayList<>();
			String[] split = rentCar.split(",");
			StringBuilder res = new StringBuilder();

			for (String i : split) {
				if (!i.equals(car.getVehicleId())) {
					strings.add(i);
				}
			}

			if (strings.isEmpty()) {
				res.append("0");
			} else {
				res.append(strings.get(0));
				for(int i = 1; i < strings.size(); i ++ ) {
					res.append(",").append(strings.get(i));
				}
			}
			user.setRentCar(res.toString());
			Constant.userMapper.updateUserById(user);

			String name = car.getClass().getSimpleName();
			switch (name) {
				case "Bus":
					Constant.busMapper.updateBus((Bus) car);
					break;
				case "Car":
					Constant.carMapper.updateCar(car);
					break;
				case "Truck":
					Constant.truckMapper.updateTruck((Truck) car);
					break;
			}
		}

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		Constant.incomeMapper.insertIncome(new Income(
				null,
				vehicleId,
				userId,
				0,
				0,
				sf.format(new Date())
		));

		return "success";
	}
}
