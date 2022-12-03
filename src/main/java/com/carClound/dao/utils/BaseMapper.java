package com.carClound.dao.utils;

import com.carClound.annotation.AnnotationUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用注解与反射封装 JDBC 的一些常用方法
 * @param <T> 需要操作的实体类的泛型
 * @author HYH
 */
public class BaseMapper<T> extends DBUtils{
    private Class<T> tClass;

    public BaseMapper() {
    }
    public BaseMapper(Class<T> tClass) {
        this.tClass = tClass;
    }

    /**
     * 增删改封装
     * @param params 参数数据
     * @return 修改的行数
     * @author HYH
     */
    protected int execute(Object[] params) {
        int res = 0;
        try {
            setPrepareStatement(params, tClass);
            res = ps.executeUpdate();
            return res;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 查询单行信息 封装
     * @param params 参数
     * @return 返回实体类查询数据
     * @author HYH
     */
    protected T selectOne(Object[] params) {
        try {
            setPrepareStatement(params, tClass);
            ResultSet rs = ps.executeQuery();
            // 获取泛型类 set 方法
            List<Method> setMethods = DataProcess.getSetMethods(tClass);
            // 获取构造器
            Constructor<T> con = tClass.getConstructor();
            T res = con.newInstance();
            // 获取表信息
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            // 获取数据
            while (rs.next()) {
                String[] name = new String[columnCount + 1];
                for (int i = 1; i <= columnCount; i++) {
                    // 得到对应列名
                    name[i] = metaData.getColumnName(i);
                    Object object = rs.getObject(name[i]);
                    setMethods.get(i - 1).invoke(res, object);
                }
            }
            return res;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 查询多行信息 封装
     * @param params 参数
     * @return 返回实体类查询数据
     * @author HYH
     */
    protected List<T> selectList(Object[] params) {
        try {
            setPrepareStatement(params, tClass);

            ResultSet rs = ps.executeQuery();
            // 获取实体类 set 方法
            List<Method> setMethods = DataProcess.getSetMethods(tClass);
            // 获取构造器
            Constructor<T> con = tClass.getConstructor();
            // 获取表信息
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            // 获取数据
            List<T> list = new ArrayList<>();
            String[] name = new String[columnCount + 1];
            while (rs.next()) {
                T res = con.newInstance();
                for (int i = 1; i <= columnCount; i++) {
                    // 得到对应列名
                    name[i] = metaData.getColumnName(i);
                    try {
                        setMethods.get(i - 1).invoke(res, rs.getObject(name[i]));
                    }catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                }
                list.add(res);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void setPrepareStatement(Object[] params, Class<T> tClass) throws SQLException {
        if (params != null && params.length > 0) {
            // 获取注解中的sql
            String sql = AnnotationUtils.getSql(params[0].toString(), tClass);
            ps = conn.prepareStatement(sql);
            // 获取参数(?)的个数
            int count = ps.getParameterMetaData().getParameterCount();
            // 利用参数params给ps进行赋值 得到完整sql语句
            for (int i = 1; i <= count; i++) {
                ps.setObject(i, params[i]);
            }
        }
    }
}
