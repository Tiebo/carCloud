package com.carClound.service.impl;

import com.carClound.dao.pojo.User;
import com.carClound.service.LoginService;
import com.carClound.ui.SystemUI;
import com.carClound.utils.Constant;
import com.carClound.vo.SystemException;

public class LoginImpl implements LoginService {
    @Override
    public String login(String account, String password) {
        User user;
        try {
            user = Constant.userMapper.getUserInfoByAc(account);
        } catch (Exception e) {
            throw new SystemException("登录失败");
        }
        if (user.getId() == 0) {
            throw new SystemException("账号或密码错误");
        }
        if (password.equals(user.getPassword())) {
            user.setPassword("");
            // 打开租赁系统
            new SystemUI(user);
        } else {
            // 自定义异常
            throw new SystemException("账号或密码错误");
        }
        return "success";
    }
}
