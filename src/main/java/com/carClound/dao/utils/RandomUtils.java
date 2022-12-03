package com.carClound.dao.utils;

import com.carClound.dao.pojo.Bus;
import com.carClound.dao.pojo.Car;
import com.carClound.dao.pojo.Truck;
import com.carClound.utils.Constant;

import java.util.HashSet;
import java.util.Set;

public class RandomUtils {
	public static final char[] abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static final String[] province = {"川", "豫", "京", "睆", "津", "渝"};

	// 每次插入100条随机Car数据
	public static void InsertCar() {
		Set<Car> carSet = new HashSet<>();

		for (int i = 0; i < 100; i ++) {
			Car car = RandomUtils.RandomCar();
			carSet.add(car);
		}

		for (Car car : carSet) {
			Constant.carMapper.insertCar(car);
		}
	}
	public static Car RandomCar() {
		String vehicleId = getPro() + getABC() + "-" + getABC() + getNum() + getABC() + getNum() + getNum();

		String[] brand = new String[]{"宝马", "奔驰", "奥迪", "法拉利", "大众", "红旗"};

		String type = getABC() + getNum();

		Integer price = 300 + (int) (Math.random() * 1000);

		Car car = new Car(
				vehicleId,
				0,
				brand[getNum() % 4],
				type,
				price,
				"0"
		);
		return car;
	}
	public static Bus RandomBus() {
		String vehicleId = getPro() + getABC() + "-" + getABC() + getNum() + getABC() + getNum() + getNum();

		String[] brand = new String[]{"东风", "金杯", "金龙", "宇通", "沃尔沃", "红旗"};

		String type = getABC() + getNum();
		Integer[] seats = new Integer[]{16, 24, 32, 48, 64};
		Integer price = 300 + (int) (Math.random() * 1000);

		Bus bus = new Bus(
				vehicleId,
				0,
				brand[getNum() % 4],
				seats[getNum() % 5],
				price,
				"0"
		);
		return bus;
	}
	public static Truck RandomTruck() {
		String vehicleId = getPro() + getABC() + "-" + getABC() + getNum() + getABC() + getNum() + getNum();

		String[] brand = new String[]{"东风", "解放", "宇通", "沃尔沃", "红旗"};

		Integer[] t = new Integer[]{10, 20, 25, 30, 35};
		Integer price = 300 + (int) (Math.random() * 1000);

		return new Truck(
				vehicleId,
				0,
				brand[getNum() % 4],
				t[getNum() % 5],
				price,
				"0"
		);
	}

	private static String getPro() {
		return province[getNum() % 4];
	}
	public static String getABC() {
		return  String.valueOf(abc[(int) (Math.random() * 25)]);
	}

	public static int getNum() {
		return (int) (Math.random() * 9);
	}
}
