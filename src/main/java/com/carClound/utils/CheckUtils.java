package com.carClound.utils;

import com.carClound.dao.pojo.Bus;
import com.carClound.dao.pojo.Car;
import com.carClound.dao.pojo.Truck;
import com.carClound.dao.pojo.User;
import com.carClound.service.ReturnService;
import com.carClound.service.impl.ReturnImpl;
import com.carClound.vo.Result;

import java.util.*;

public class CheckUtils extends Thread{

	private User user;

	public CheckUtils(User user) {
		this.user = user;
	}

	@Override
	public void run() {
		checkCarDate(user);
	}

	public void checkCarDate(User user) {
		List<Car> cars = Constant.carMapper.getCarList();
		List<Bus> buses = Constant.busMapper.getBusList();
		List<Truck> trucks = Constant.truckMapper.getTruckList();

		cars.removeIf((car) -> !Objects.equals(user.getId(), car.getUserId()));
		buses.removeIf((bus) -> !Objects.equals(user.getId(), bus.getUserId()));
		trucks.removeIf((truck) -> !Objects.equals(user.getId(), truck.getUserId()));

		List<Car> res = new ArrayList<>();
		long now = new Date().getTime();
		long old = 0;
		for (Car car : cars) {
			old = Long.parseLong(car.getDate());
			if (old - now <= 10000)
				res.add(car);
		}
		for (Bus bus : buses) {
			old = Long.parseLong(bus.getDate());
			if (old - now <= 10000)
				res.add(bus);
		}
		for (Truck truck : trucks) {
			old = Long.parseLong(truck.getDate());
			if (old - now <= 10000)
				res.add(truck);
		}

		Map<String, String> map = new HashMap<>();
		for (Car car: res) {
			map.put("vehicleId", car.getVehicleId());
			map.put("userId", car.getUserId().toString());
			ReturnService returnService = new ReturnImpl();
			returnService.returnCar(map);
			map.clear();
		}

		if (res.size() > 0)
			Result.success("您有汽车到期，已经自动归还");
	}
}
