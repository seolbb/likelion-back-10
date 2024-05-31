package com.exam;
//static import
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class CalculatorTest {
    Calculator cal = null;
    @Test
    void plus(){
        System.out.println("plus test 실행");
        assertEquals(5,cal.plus(2,3));
        assertEquals(10, cal.plus(3,7));
    }

    @Test
    void  minus(){
        System.out.println("minus test 실행");
        assertEquals(2, cal.minus(3,1));
    }

    @BeforeAll
    static void beforeAll(){

        System.out.println("====beforeAll    테스트 클래스가 실행될 때 한 번 실행됨. ");
    }

    @BeforeEach
    void beforeEach(){
        cal = new Calculator();
        System.out.println("=====beforeEach 각 테스트 메서드가 실행되기 전에 실행.  모든 테스트 메스드마다 실행!!");
    }

    @AfterEach
    void afterEach(){
        cal = null;
        System.out.println("======afterEach 각 테스트 메소드가 실행 된 후 실행!!");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("====== afterAll 모든 테스트가 종료된 후 실행!!");
    }
}
