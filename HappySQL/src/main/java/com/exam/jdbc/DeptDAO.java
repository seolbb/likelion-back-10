package com.exam.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
    //입력
    public boolean addDept(DeptDTO deptDTO){
        //매개변수로 받아올 값이 너무 많아요..  그럴때..  어떻게???   -- 가방처럼 값을 담을 객체를 만들어서 사용함.
        //VO ,  DTO (DeptDTO)  ,  Model (Dept) ,  Entity (Dept)

        //1.필요한 객체를 선언한다.
        Connection conn = null;
        PreparedStatement ps = null;
        boolean resultFlag = false;

        try {
            //3. 접속
            conn = DBUtil.getConnection();

            //4. 쿼리작성
            String sql = "insert into dept(deptno,dname,loc) values (?,?,?)";

            ps = conn.prepareStatement(sql);

            ps.setInt(1,deptDTO.getDeptno());
            ps.setString(2,deptDTO.getDname());
            ps.setString(3, deptDTO.getLoc());

            //5. 실행.
            int count = ps.executeUpdate();
            System.out.println(count+"건 입력했습니다!!");

            if(count > 0)
                resultFlag = true;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //2. 닫아준다.
            DBUtil.close(conn,ps);
        }
        return resultFlag;
    }
    //수정
    public int updateDept(DeptDTO deptDTO){
        //1.필요한 객체를 선언한다.
        Connection conn = null;
        PreparedStatement ps = null;
       int resultCount = 0;
        try {
            //3. 접속
            conn = DBUtil.getConnection();
            //4. 쿼리작성
            String sql = "update dept set dname=?, loc=? where deptno = ?";

            ps = conn.prepareStatement(sql);

            ps.setInt(3,deptDTO.getDeptno());
            ps.setString(1,deptDTO.getDname());
            ps.setString(2, deptDTO.getLoc());

            //5. 실행.
            resultCount = ps.executeUpdate();
            System.out.println(resultCount+"건 수정!!");



        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //2. 닫아준다.
           DBUtil.close(conn,ps);
        }
        return resultCount;
    }
    //삭제
    public void deleteDept(int deptno){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement("delete from dept where deptno=?");
            ps.setInt(1,deptno);

            ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps);
        }


    }

    //한 건 조회
    public DeptDTO getDept(int deptno){
        //1. 필요한객체 선언
       Connection conn = null;
       PreparedStatement ps = null;
        ResultSet rs = null;

        DeptDTO deptDTO = null;
        try {
            // 3. 접속
            conn = DBUtil.getConnection();
            // 4. 쿼리작성
            String sql = "select deptno,dname,loc from dept where deptno = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,deptno);
            // 5. 실행
            rs = ps.executeQuery();
            // 6. 결과값처리
            if(rs.next()){
                deptDTO = new DeptDTO();
                deptDTO.setDeptno(rs.getInt("deptno"));
                deptDTO.setDname(rs.getString(2));
                deptDTO.setLoc(rs.getString(3));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //2. 닫는다.
            DBUtil.close(conn,ps,rs);
        }
        return deptDTO;
    }

    //모두 조회
    public List<DeptDTO> getAllDept(){
        //1. 필요한객체 선언
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<DeptDTO> deptList = new ArrayList<>();
        try {
            // 3. 접속
            conn = DBUtil.getConnection();
            // 4. 쿼리작성
            String sql = "select deptno,dname,loc from dept";
            ps = conn.prepareStatement(sql);
            // 5. 실행
            rs = ps.executeQuery();
            // 6. 결과값처리
            while(rs.next()){
                DeptDTO  deptDTO = new DeptDTO();
                deptDTO.setDeptno(rs.getInt("deptno"));
                deptDTO.setDname(rs.getString(2));
                deptDTO.setLoc(rs.getString(3));

                deptList.add(deptDTO);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //2. 닫는다.
            DBUtil.close(conn,ps,rs);
        }
        return deptList;
    }


    //조건에 맞는 조회...
}
