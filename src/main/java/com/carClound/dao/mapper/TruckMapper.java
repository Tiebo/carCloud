package com.carClound.dao.mapper;

import com.carClound.annotation.SQL;
import com.carClound.dao.pojo.Truck;
import com.carClound.dao.utils.BaseMapper;

import java.util.List;

public class TruckMapper extends BaseMapper<Truck> {
    public TruckMapper() {
        super(Truck.class);
    }
    @SQL("select * from truck")
    public List<Truck> getTruckList() {
        Object[] data = {"getTruckList"};
        return selectList(data);
    }

    @SQL("select * from truck where user_id = #{arg1}")
    public List<Truck> getTruckByUserId(Integer UserId) {
        Object[] data = {"getTruckByUserId", UserId};
        return selectList(data);
    }

    @SQL("insert into truck values(#{arg1}, #{arg2}," +
            " #{arg3}, #{arg4}, #{arg5}, #{arg6})")
    public int insertTruck(Truck truck) {
        Object[] data = {
                "insertTruck",
                truck.getVehicleId(),
                truck.getUserId(),
                truck.getBrand(),
                truck.getTonnage(),
                truck.getPrice(),
                truck.getDate()
        };
        return execute(data);
    }
    @SQL("update truck set user_id = #{arg1}, vehicle_id = #{arg2}," +
            " brand = #{arg3}, tonnage = #{arg4}, " +
            "price = #{arg5}, date = #{arg6} " +
            "where vehicle_id = #{arg7}")
    public int updateTruck(Truck truck) {
        Object[] data = {
                "updateTruck",
                truck.getUserId(),
                truck.getVehicleId(),
                truck.getBrand(),
                truck.getTonnage(),
                truck.getPrice(),
                truck.getDate(),
                truck.getVehicleId()
        };
        return execute(data);
    }

    @SQL("select * from Truck where vehicle_id = #{arg1}")
    public Truck getTruckByVehicleId(String id) {
        Object[] data = {"getTruckByVehicleId", id};
        return selectOne(data);
    }

    @SQL("delete from truck where vehicle_id = #{arg1}")
    public int removeTruck(String vehicleId) {
        Object[] data = new Object[]{"removeTruck", vehicleId};
        return execute(data);
    }
}
