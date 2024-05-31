package com.exam.jdbc;
//0. 라이브러리 추가!!

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public static void main(String[] args) throws Exception{
        //0-1 드라이버로딩
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost/exampledb";
        String user = "carami";
        String password = "kang1234";

        //1.접속객체 얻어오기.
        Connection conn = DriverManager.getConnection(dbUrl,user,password);

        if(conn != null)
            System.out.println("^^");
        else
            System.out.println("-___-;;");

        String dname = "개발부";
        //statement를 사용할 때.
     //   String sql = "insert into dept(deptno,dname) values(3, '"+dname+"')";
//      DBMS는 쿼리가 들어오면 번역한다.  이때 같은 쿼리가 들어오면 이미 번역된 것을 이용한다.
        //값이 바뀌어도 다른 쿼리로 인식한다.  매번 번역한다.

        //PreparedStatement를 사용할 때
     //   String sql2 = "insert into dept(deptno,dname) values(3, ?)";
        //여기까지를 번역.
        //값이 나중에 바뀌므로 매번 번역하지 않아요.  문자열도 간결해지고, 성능도 좋으므로..


    }
}
