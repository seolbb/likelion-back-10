package com.exam.jdbc;

import java.sql.*;

public class SelectTest {
    public static void main(String[] args) {
        //1.선언
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:mysql://localhost/exampledb";
        String user = "carami";
        String password = "kang1234";

        try{
            //3.접속
            conn = DriverManager.getConnection(dbUrl,user,password);
            //4.쿼리작성
            ps = conn.prepareStatement("select deptno, dname, loc from dept");
            //5. 쿼리실행
            rs = ps.executeQuery();

            //6. 결과얻어냄.
            while (rs.next()){
                System.out.print(rs.getInt("deptno")+"  ");
                System.out.print(rs.getString(2)+"  ");
                System.out.println(rs.getString(3));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(rs != null){
                //2. 닫는다.
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
