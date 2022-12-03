package com.carClound.dao.mapper;

import com.carClound.annotation.SQL;
import com.carClound.dao.pojo.Bus;
import com.carClound.dao.utils.BaseMapper;

import java.util.List;

public class BusMapper extends BaseMapper<Bus> {
    public BusMapper() {
        super(Bus.class);
    }

    @SQL("select * from bus")
    public List<Bus> getBusList() {
        Object[] data = {"getBusList"};
        return selectList(data);
    }

    @SQL("select * from bus where user_id = #{arg1}")
    public List<Bus> getBusByUserId(Integer Userid) {
        Object[] data = {"getBusByUserId", Userid};
        return selectList(data);
    }

    @SQL("insert into bus values(#{arg1}, #{arg2}," +
            " #{arg3}, #{arg4}, #{arg5}, #{arg6})")
    public int insertBus(Bus bus) {
        Object[] data = {
                "insertBus",
                bus.getVehicleId(),
                bus.getUserId(),
                bus.getBrand(),
                bus.getSeat(),
                bus.getPrice(),
                bus.getDate()
        };
        return execute(data);
    }
    @SQL("update bus set user_id = #{arg1}, vehicle_id = #{arg2}," +
            " brand = #{arg3}, seat = #{arg4}, " +
            "price = #{arg5}, date = #{arg6} " +
            "where vehicle_id = #{arg7}")
    public int updateBus(Bus bus) {
        Object[] data = {
                "updateBus",
                bus.getUserId(),
                bus.getVehicleId(),
                bus.getBrand(),
                bus.getSeat(),
                bus.getPrice(),
                bus.getDate(),
                bus.getVehicleId()
        };
        return execute(data);
    }

    @SQL("select * from bus where vehicle_id = #{arg1}")
    public Bus getBusByVehicleId(String id) {
        Object[] data = {"getBusByVehicleId", id};
        return selectOne(data);
    }

    @SQL("delete from bus where vehicle_id = #{arg1}")
    public int removeBus(String vehicleId) {
        Object[] data = new Object[]{"removeBus", vehicleId};
        return execute(data);
    }
}
