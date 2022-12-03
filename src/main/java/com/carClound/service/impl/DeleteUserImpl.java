package com.carClound.service.impl;

import com.carClound.dao.pojo.User;
import com.carClound.service.DeleteUserService;
import com.carClound.utils.Constant;
import com.carClound.vo.SystemException;

import java.util.Objects;

public class DeleteUserImpl implements DeleteUserService {
    @Override
    public int deleteUser(Integer id) {
        User user = Constant.userMapper.getUserInfoById(id);
        if (user.getRentCar() != null || !Objects.equals(user.getRentCar(), "0")) {
            throw new SystemException("请租用车辆到期后再注销账户");
        }
        if (user.getBalance() != null || user.getBalance() != 0) {
            throw new SystemException("请清空余额后再注销账户");
        }
        Constant.userMapper.deleteUserById(id);
        return 0;
    }
}
