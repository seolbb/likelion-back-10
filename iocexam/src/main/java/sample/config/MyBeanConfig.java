package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import sample.bean.MyBean;

@ComponentScan(basePackages = "sample")
public class MyBeanConfig {
//    <bean id="myBean" class="sample.bean.MyBean"/>
//    @Bean
//    public MyBean myBean(){
//        return new MyBean();
//    }

    @Bean
    public MyBean myBean2(){
        return new MyBean();
    }

    @Bean
    @Scope("prototype")
    public MyBean myBean3(){
        return new MyBean();
    }

    @Bean
    public MyBean myBean4(){
        return new MyBean("haha",10);
    }
}
