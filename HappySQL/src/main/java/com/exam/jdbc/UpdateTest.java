package com.exam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost/exampledb";
        String user = "carami";
        String password = "kang1234";

        String dname = "인사부";
        int deptno = 50;

        //드라이버로딩

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String sql = "update dept set dname = ? where deptno=?";
        try(Connection conn = DriverManager.getConnection(dbUrl,user,password);
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            //?에 대한 값을 바인딩한다.
            ps.setString(1, dname);
            ps.setInt(2,deptno);

            int count = ps.executeUpdate();
            System.out.println(count+"건 수정했습니다.");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
