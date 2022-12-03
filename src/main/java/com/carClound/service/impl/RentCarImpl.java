package com.carClound.service.impl;

import com.carClound.dao.pojo.*;
import com.carClound.service.RentCarService;
import com.carClound.utils.Constant;
import com.carClound.vo.SystemException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class RentCarImpl implements RentCarService {
	@Override
	public String rentCar(Map<String, Object> data) {
		Integer type = null;
		Integer day = null;
		Car car;
		User user;
		try {
			user = (User) data.get("user");
			type = (Integer) data.get("type");
			day = (Integer) data.get("day");
			car = (Car) data.get("car");
		} catch (Exception e) {
			throw new SystemException("数据错误！");
		}
		user = Constant.userMapper.getUserInfoById(user.getId());
		long date = new Date().getTime() + day * Constant.ONE_DAY;

		String vehicleId;
		Integer price;
		Integer userId;
		vehicleId = car.getVehicleId();
		price = car.getPrice();
		userId = car.getUserId();

		car.setDate(String.valueOf(new Date(date).getTime()));
		car.setUserId(user.getId());

		switch (type) {
			case 0:
				Constant.carMapper.updateCar(car);
				break;
			case 1:
				Constant.busMapper.updateBus((Bus) car);
				break;
			case 2:
				Constant.truckMapper.updateTruck((Truck) car);
				break;
		}

		if (Objects.equals(userId, user.getId())) {
			throw new SystemException("您已经租用该车");
		} else if (userId != 0) {
			throw new SystemException("该车已被他人租用");
		} else if (user.getBalance() - price * day <= 0) {
			throw new SystemException("余额不足");
		}
		StringBuilder res = new StringBuilder();
		if (!user.getRentCar().equals("0")) {
			res.append(user.getRentCar()).append(",").append(vehicleId);
		} else {
			res.append(vehicleId);
		}
		user.setRentCar(res.toString());
		user.setBalance(user.getBalance() - price);
		Constant.userMapper.updateUserById(user);

		Date now = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String format = sf.format(now);

		Constant.incomeMapper.insertIncome(new Income(
				null,
				vehicleId,
				user.getId(),
				day,
				day * price,
				format
		));

		return "success";
	}
}
