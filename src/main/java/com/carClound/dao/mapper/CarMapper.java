package com.carClound.dao.mapper;

import com.carClound.annotation.SQL;
import com.carClound.dao.pojo.Car;
import com.carClound.dao.utils.BaseMapper;

import java.util.List;
public class CarMapper extends BaseMapper<Car> {
    public CarMapper() {
        super(Car.class);
    }
    @SQL("select * from car where user_id = #{arg1}")
    public List<Car> getCarByUserId(Integer id) {
        Object[] data = {"getCarByUserId", id};
        return selectList(data);
    }
    @SQL("select * from car")
    public List<Car> getCarList() {
        Object[] data = {"getCarList"};
        return selectList(data);
    }

    @SQL("select * from car where vehicle_id = #{arg1}")
    public Car getCarByVehicleId(String id) {
        Object[] data = {"getCarByVehicleId", id};
        return selectOne(data);
    }

    @SQL("insert into car values(#{arg1}, #{arg2}," +
            " #{arg3}, #{arg4}, #{arg5}, #{arg6})")
    public void insertCar(Car car) {
        Object[] data = {
                "insertCar",
                car.getVehicleId(),
                car.getUserId(),
                car.getBrand(),
                car.getType(),
                car.getPrice(),
                car.getDate()
        };
        execute(data);
    }

    @SQL("update car set user_id = #{arg1}, vehicle_id = #{arg2}," +
            " brand = #{arg3}, type = #{arg4}, " +
            "price = #{arg5}, date = #{arg6} " +
            "where vehicle_id = #{arg7}")
    public int updateCar(Car car) {
        Object[] data = {
                "updateCar",
                car.getUserId(),
                car.getVehicleId(),
                car.getBrand(),
                car.getType(),
                car.getPrice(),
                car.getDate(),
                car.getVehicleId()
        };
        return execute(data);
    }

    @SQL("delete from car where vehicle_id = #{arg1}")
    public int removeCar(String vehicleId) {
        Object[] data = new Object[]{"removeCar", vehicleId};
        return execute(data);
    }
}
