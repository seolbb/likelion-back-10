package org.example.aopexam;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
    @Pointcut("execution(* org.example.aopexam.SimpleService.*(..))")
    public void pc(){}

    @Pointcut("execution(* hello())")
    public void pc2(){}

    @Before("pc()")
    public void before(JoinPoint joinPoint){
        System.out.println("Before :::::::::: "+ joinPoint.getSignature().getName());
    }

    @After("pc2()")
    public void after(){
        System.out.println("After :::::::::::::::::");
    }

    @AfterReturning(pointcut = "execution(String org.example.aopexam.*.*(..))", returning = "result")
    public void afterReturningServiceMethod(JoinPoint joinPoint, Object result) {
        System.out.println("After method: " + joinPoint.getSignature().getName() + ", return value: " + result);
    }

    @Before("execution(* setName(..))")
    public void beforeName(JoinPoint joinPoint){
        System.out.println("beforeName:::::::::::::::::  ");
        System.out.println("method name ::::  "+joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object obj : args){
            System.out.println(":::::::::::::인자 --->" + obj);
        }
    }

    @AfterThrowing(value = "pc2()", throwing = "ex")
    public void afterThrowing(Throwable ex){
        System.out.println("AfterThrowing ##############");
        System.out.println("exception value ::  "+ ex);
    }

    @Around("pc()")
    public String around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("Around run :::::::::::::::::::::::::  실제 호출된 메서드가 실행되기 전에 할일 구현");

        String value = (String) pjp.proceed(); // 실제 target 메소드를 호출

        System.out.println("Around run :::::::::::::::::::::::::  실제 호출된 메서드가 실행된 후 할일 구현");
        value += "carami aop run!!";

        return value;
    }

}
