package com.carClound.service.impl;

import com.carClound.dao.pojo.Car;
import com.carClound.service.RemoveCarService;
import com.carClound.service.ReturnService;
import com.carClound.utils.Constant;

import java.util.Map;

public class RemoveCarImpl implements RemoveCarService {
	@Override
	public String removeCar(Map<String, String> data) {
		String vehicleId = data.get("vehicleId");

		ReturnService returnService = new ReturnImpl();
		returnService.returnCar(data);

		Car car = Constant.carMapper.getCarByVehicleId(vehicleId);
		if (car.getVehicleId() == null)
			car = Constant.busMapper.getBusByVehicleId(vehicleId);
		if (car.getVehicleId() == null)
			car = Constant.truckMapper.getTruckByVehicleId(vehicleId);

		if (car.getVehicleId() != null) {
			String name = car.getClass().getSimpleName();
			switch (name) {
				case "Bus":
					Constant.busMapper.removeBus(car.getVehicleId());
					break;
				case "Car":
					Constant.carMapper.removeCar(car.getVehicleId());
					break;
				case "Truck":
					Constant.truckMapper.removeTruck(car.getVehicleId());
					break;
			}
		}

		return "success";
	}
}
