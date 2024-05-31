package com.exam.jdbc;

import java.sql.*;

public class DBUtil {
    //DB 접속
    public static Connection getConnection() throws Exception{
        Connection conn = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost/exampledb";
        String user = "carami";
        String password = "kang1234";
        conn = DriverManager.getConnection(dbUrl,user,password);
        return conn;
    }

    public static Connection getConnection(String dbUrl, String user, String password){
        Connection conn = null;

        return conn;
    }


    // DB close
    public static void close(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void close(Connection conn, PreparedStatement ps){
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        close(conn);
    }
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        close(conn,ps);
    }
}
