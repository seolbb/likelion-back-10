package com.exam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteTest {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost/exampledb";
        String user = "carami";
        String password = "kang1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String sql = "delete from dept where deptno=60";
        try(Connection conn = DriverManager.getConnection(dbUrl,user,password);
            PreparedStatement ps = conn.prepareStatement(sql);
                ){
            int count = ps.executeUpdate();
            System.out.println(count+"건 삭제했습니다.");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
