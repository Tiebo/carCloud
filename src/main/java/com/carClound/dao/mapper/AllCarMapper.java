package com.carClound.dao.mapper;

import com.carClound.annotation.SQL;
import com.carClound.dao.pojo.AllCar;
import com.carClound.dao.utils.BaseMapper;

import java.util.List;

public class AllCarMapper extends BaseMapper<AllCar> {
	public AllCarMapper() {
		super(AllCar.class);
	}

	@SQL("select * from all_car")
	public List<AllCar> getAllCar() {
		String[] data = {"getAllCar"};
		return selectList(data);
	}

	@SQL("select * from all_car where vehicle_id = #{arg1}")
	public List<AllCar> getAllCarById(String vehicleId) {
		Object[] data = {"getAllCarById", vehicleId};
		return selectList(data);
	}
}
