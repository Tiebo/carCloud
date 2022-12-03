package com.carClound.service.impl;

import com.carClound.dao.pojo.Bus;
import com.carClound.dao.pojo.Car;
import com.carClound.dao.pojo.Truck;
import com.carClound.service.AddCarService;
import com.carClound.utils.Constant;
import com.carClound.vo.SystemException;

import java.util.Date;
import java.util.Map;

public class AddCarImpl implements AddCarService {
	@Override
	public String addCarService(Map<String, String> data) {
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
				Constant.carMapper.insertCar(new Car(
						vehicleId,
						0,
						brand,
						feature,
						rent,
						String.valueOf(new Date().getTime())
				));
				break;
			case "1":
				// 卡车
				Constant.busMapper.insertBus(new Bus(
						vehicleId,
						0,
						brand,
						Integer.valueOf(feature),
						rent,
						String.valueOf(new Date().getTime())
				));
				break;
			case "2":
				// 货车
				Constant.truckMapper.insertTruck(new Truck(
						vehicleId,
						0,
						brand,
						Integer.valueOf(feature),
						rent,
						String.valueOf(new Date().getTime())
				));
				break;
		}

		return "success";
	}
}
