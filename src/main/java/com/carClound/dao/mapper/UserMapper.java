package com.carClound.dao.mapper;

import com.carClound.annotation.SQL;
import com.carClound.dao.pojo.User;
import com.carClound.dao.utils.BaseMapper;

import java.util.List;

public class UserMapper extends BaseMapper<User> {
    public UserMapper() {
        super(User.class);
    }
    @SQL("select * from user where id = #{arg1}")
    public User getUserInfoById(Integer id) {
        Object[] data = {"getUserInfoById", id};
        return selectOne(data);
    }

    @SQL("select * from user where account = #{arg1}")
    public User getUserInfoByAc(String account) {
        Object[] data = {"getUserInfoByAc", account};
        return selectOne(data);
    }

    @SQL("select * from user")
    public List<User> getUserList() {
        Object[] data = {"getUserList"};
        return selectList(data);
    }

    @SQL("insert into user values(null, #{arg1}, #{arg2}," +
            " #{arg3}, #{arg4}, #{arg5}, #{arg6}, #{arg7})")
    public int insertUser(User user) {
        Object[] data = {
                "insertUser",
                user.getName(),
                user.getAccount(),
                user.getPassword(),
                user.getRentCar(),
                user.getBalance(),
                user.getGender(),
                user.getIsAdmin()
        };
        return execute(data);
    }

    @SQL("delete from user where id = #{arg1}")
    public int deleteUserById(Integer id) {
        Object[] data = {"deleteUserById", id};
        return execute(data);
    }

    @SQL("update user set name = #{arg1}, account = #{arg2}," +
            " rent_car = #{arg3}, balance = #{arg4}, " +
            "gender = #{arg5}, is_admin = #{arg6} " +
            "where id = #{arg7}")
    public int updateUserById(User user) {
        Object[] data = {
                "updateUserById",
                user.getName(),
                user.getAccount(),
                user.getRentCar(),
                user.getBalance(),
                user.getGender(),
                user.getIsAdmin(),
                user.getId()
        };
        return execute(data);
    }
}
