package com.carClound.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtils {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/rentcar?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String user = "root";
    private static final String passwd = "admin";
    protected static Connection conn = null;
    protected static PreparedStatement ps = null;

    public DBUtils() {
        if (conn == null)
            connectDB();
    }

    private void connectDB() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, user, passwd);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("数据库已连接~");
    }

    public static Connection getConn() {
        return conn;
    }

    public static void closeDB() {
        try {
            if (conn != null)
                conn.close();
            if (ps != null)
                ps.close();
            System.out.println("-----------------");
            System.out.println("数据库已关闭~");
            System.out.println("-----------------");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
