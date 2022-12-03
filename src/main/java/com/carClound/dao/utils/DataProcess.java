package com.carClound.dao.utils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DataProcess {
    /**
     *
     * @param tClass 获取类的全部 set 方法
     * @return 返回所有set方法
     * @author HYH
     */
    public static List<Method> getSetMethods(Class<?> tClass) {
        try {
            // 获取set方法
            Field[] declaredFields = tClass.getDeclaredFields();
            List<Method> methods = new ArrayList<>();
            for (Field f : declaredFields) {
                PropertyDescriptor pd = new PropertyDescriptor(f.getName(), tClass);
                Method setMethod = pd.getWriteMethod();
                methods.add(setMethod);
            }
            return methods;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     *
     * @param tClass 获取类的全部 get 方法
     * @return 返回所有get方法
     * @author HYH
     */
    public static List<Method> getGetMethods(Class<?> tClass) {
        try {
            // 获取set方法
            Field[] declaredFields = tClass.getDeclaredFields();
            List<Method> methods = new ArrayList<>();
            for (Field f : declaredFields) {
                PropertyDescriptor pd = new PropertyDescriptor(f.getName(), tClass);
                Method getMethod = pd.getReadMethod();
                methods.add(getMethod);
            }
            return methods;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
