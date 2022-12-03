package com.carClound.service.impl;

import com.carClound.dao.pojo.User;
import com.carClound.service.UpdateUserInfoService;
import com.carClound.utils.Constant;
import com.carClound.vo.SystemException;

import java.util.List;
import java.util.Map;

public class UpdateUserInfoImpl implements UpdateUserInfoService {
	@Override
	public String updateUserInfo(Map<String, String> data) {
		String account = data.get("account");
		String name = data.get("name");
		String gender = data.get("gender");
		Integer id = Integer.valueOf(data.get("id"));

		if (gender.equals("") || name.equals("") || account.equals("")) {
			throw new SystemException("数据不能为空");
		}

		User user = Constant.userMapper.getUserInfoById(id);
		List<User> users = Constant.userMapper.getUserList();
		for (User u: users) {
			if (u.getAccount().equals(user.getAccount()) && !account.equals(u.getAccount())) {
				throw new SystemException("账户已存在");
			}
		}
		user.setName(name);
		user.setGender(gender);
		user.setAccount(account);
		Constant.userMapper.updateUserById(user);

		return "success";
	}
}
