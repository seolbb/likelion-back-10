package com.example.day11;

import java.util.HashSet;
import java.util.Set;

public class EmployeeManager {
    private Set<Employee> employees = new HashSet<>();

    public void addEmployee(Employee employee) {
        if (employees.add(employee)) {
            System.out.println("사원 추가 성공: " + employee);
        } else {
            System.out.println("이미 존재하는 사원입니다: " + employee);
        }
    }

    public void removeEmployee(Employee employee) {
        if (employees.remove(employee)) {
            System.out.println("사원 삭제 성공: " + employee);
        } else {
            System.out.println("존재하지 않는 사원입니다.");
        }
    }

    public void findEmployee(String id) {
        for (Employee emp : employees) {
            if (emp.getId().equals(id)) {
                System.out.println("사원 검색: " + emp);
                return;
            }
        }
        System.out.println("해당 사원을 찾을 수 없습니다.");
    }
}
