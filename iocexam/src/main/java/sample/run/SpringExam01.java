package sample.run;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.bean.MyBean;
import sample.config.MyBeanConfig;

public class SpringExam01 {
    public static void main(String[] args) {
        //직접 사용하는 경우!!
//        MyBean bean = new MyBean();
//        bean.setName("kang");
//
//        System.out.println(bean);

        //스프링  ioc container를 이용해서 사용하는 경우
        //스프링 컨테이너에게 알려줘야하지 않을까요??
        //1. 애노테이션으로 알려줌.   --  컴포넌트 스캔 하도록!!
        //2. 자바파일을 통해서 알려줌

//        BeanFactory  -- 빈을 생성하는데 간단한 기능만 포함하고있어요.   aop 기술은 사용할 수 없어요!!
        System.out.println("ApplicationContext 생성전!!");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class); //공장이 생성될때 어떤 빈을 생성해야할지 알아야함.
        System.out.println("ApplicationContext 생성후!");
        MyBean bean1 = (MyBean)context.getBean("myBean");  //lookup  방식..   id를 알려줌.

        bean1.setName("carami");

        System.out.println(bean1);

//        MyBean bean2 = context.getBean(MyBean.class);  // 타입만 알려줌.  -- 해당 타입의 객체가 하나만 존재할 때는 오류가 없다.
        //그러나 2 개 이상일 때는...  ㅠㅠ

        MyBean bean2 = context.getBean("myBean2",MyBean.class);

        bean2.setName("kim");
        System.out.println(bean2);
        System.out.println(bean1);

        if(bean2 == bean1)
            System.out.println("같아요.");
        else System.out.println("bean1과 bean2는 다른 인스턴스입니다.");


        MyBean bean3 = context.getBean("myBean", MyBean.class);

        if(bean3 == bean1)
            System.out.println("bean3과 bean1은 같은 인스턴스입니다.");


        MyBean bean4 = context.getBean("myBean3", MyBean.class);
        bean4.setName("hong");

        MyBean bean5 = context.getBean("myBean3", MyBean.class);
        bean5.setName("lee");


        System.out.println(bean4);
        System.out.println(bean5);

        MyBean bean6 = context.getBean("myBean4",MyBean.class);
        System.out.println(bean6);

        //3. xml을 통해서 알려줌.   -- 현재는 많이 사용하지 않기 때문에..
        /*
        <?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns:c="http://www.springframework.org/schema/c"
  xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">


	<bean id="myBean" class="sample.bean.MyBean"/>
	<bean id="myBean2" class="sample.bean.MyBean" scope="prototype"/>



</beans>
         */


    }




}
