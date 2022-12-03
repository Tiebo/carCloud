package com.carClound.service.impl;

import com.carClound.dao.pojo.Bus;
import com.carClound.dao.pojo.Car;
import com.carClound.dao.pojo.Truck;
import com.carClound.service.UpdateCarInfoService;
import com.carClound.utils.Constant;
import com.carClound.vo.SystemException;

import java.util.Map;

public class UpdateCarInfoImpl implements UpdateCarInfoService {
	@Override
	public String updateCarInfo(Map<String, String> data) {
		String vehicleId = data.get("vehicleId");
		String type = data.get("type");
		String brand = data.get("brand");
		String price = data.get("price");
		String feature = data.get("feature");

		if (vehicleId == null || "".equals(vehicleId)) {
			throw new SystemException("车牌号不能为空！");
		}
		if (type == null || "".equals(type)) {
			throw new SystemException("请选择正确的车型");
		}
		if (brand == null || "".equals(brand)) {
			throw new SystemException("品牌不能为空！");
		}
		if (price == null || "".equals(price)) {
			throw new SystemException("价格不能为空");
		}
		Integer rent = Integer.valueOf(price);
		if (feature == null || "".equals(feature)) {
			throw new SystemException("类型不能为空！");
		}
		// 轿车
		switch (type) {
			case "0":
				Car car = Constant.carMapper.getCarByVehicleId(vehicleId);
				car.setVehicleId(vehicleId);
				car.setBrand(brand);
				car.setType(feature);
				car.setPrice(rent);
				Constant.carMapper.updateCar(car);
				break;
			case "1":
				Bus bus = Constant.busMapper.getBusByVehicleId(vehicleId);
				bus.setVehicleId(vehicleId);
				bus.setBrand(brand);
				bus.setSeat(Integer.valueOf(feature));
				bus.setPrice(rent);
				// 卡车
				Constant.busMapper.updateBus(bus);
				break;
			case "2":
				// 货车
				Truck truck = Constant.truckMapper.getTruckByVehicleId(vehicleId);
				truck.setVehicleId(vehicleId);
				truck.setBrand(brand);
				truck.setTonnage(Integer.valueOf(feature));
				truck.setPrice(rent);
				// 卡车
				Constant.truckMapper.updateTruck(truck);
				break;
		}

		return "success";
	}
}
