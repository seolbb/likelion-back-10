package com.exam.jdbc;

import java.util.List;

public class DeptDAORun {
    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAO();
        DeptDTO deptDTO = new DeptDTO();
        deptDTO.setDeptno(110);
        deptDTO.setDname("like33");
        deptDTO.setLoc("일산");

//        boolean resultFlag = deptDAO.addDept(deptDTO);
//        if(resultFlag)
//            System.out.println("입력성공!!");
//        else
//            System.out.println("입력실패 ㅠㅠ");

//        int resultCount = deptDAO.updateDept(deptDTO);
//        System.out.println(resultCount);


        //삭제테스트
//        deptDAO.deleteDept(110);

        //한 건 조회
//        DeptDTO resultDetpDto =   deptDAO.getDept(200);
//        System.out.println(resultDetpDto);

        List<DeptDTO> deptList = deptDAO.getAllDept();

        for(DeptDTO dto : deptList){
            System.out.println(dto);
        }
    }
}
