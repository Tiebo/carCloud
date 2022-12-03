package com.carClound.service.impl;

import com.carClound.dao.pojo.User;
import com.carClound.service.RegisterService;
import com.carClound.ui.user.RegisterUI;
import com.carClound.utils.Constant;
import com.carClound.vo.Result;
import com.carClound.vo.SystemException;

import java.util.List;
import java.util.Map;

public class RegisterImpl implements RegisterService {
    @Override
    public void register(Map<String, String> data) {
        String account;
        String name;
        String passwd;
        String confirmPasswd;
        // 防止null 空指针错误
        try {
            name = data.get("name");
            account = data.get("account");
            passwd = data.get("password");
            confirmPasswd = data.get("confirmPassword");
        } catch (Exception e) {
            throw new SystemException("请填写完整数据");
        }

        if ("".equals(account) || "".equals(name) || "".equals(passwd) || "".equals(confirmPasswd)) {
            throw new SystemException("数据不能为空");
        }
        if (!passwd.equals(confirmPasswd)) {
            throw new SystemException("俩次密码不相同");
        }
        if (passwd.length() < 10) {
            throw new SystemException("密码长度不能小于10");
        }
        if (account.length() < 5) {
            throw new SystemException("账号长度不能小于5");
        }
        List<User> userList = Constant.userMapper.getUserList();
        for (User user : userList) {
            if (user.getAccount().equals(name)) {
                throw new SystemException("该账户已存在");
            }
        }
        User user = new User(null, "无名人士", account, passwd, "0", 500, "未知", 0);
        int i = Constant.userMapper.insertUser(user);
        if (i == 0) {
            throw new SystemException("注册失败");
        } else {
            Result.success("注册成功");
            RegisterUI.closeUI();
        }
    }
}
