package com.carClound.annotation;

import java.lang.reflect.Method;

public class AnnotationUtils {
    /**
     * 通过方法名作为标志 获取Sql注解中的value值
     * @param methodName 方法名
     * @return 返回完整Sql
     * @author HYH
     */
    public static String getSql(String methodName, Class<?> tClass) {
        Class<?> aClass = null;
        try {
            aClass = Class.forName("com.carClound.dao.mapper." + tClass.getSimpleName() + "Mapper");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Method[] declaredFields = aClass.getMethods();
        String sql = null;
        for (Method m : declaredFields) {
            if (m.isAnnotationPresent(SQL.class) && m.getName().equals(methodName)) {
                SQL annotation = m.getAnnotation(SQL.class);
                sql = annotation.value();
                int k = 1;
                while (sql.contains("#")) {
                    int i = sql.indexOf("#");
                    int j = sql.indexOf("}");
                    String sb = sql.substring(i, j + 1);
                    sql = sql.replace(sb, "?");
                    k++;
                }
            }
        }
        return sql;
    }
}
