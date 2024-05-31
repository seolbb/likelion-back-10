package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import sample.bean.Book;

@ComponentScan(basePackages = "sample.bean")
public class BookConfig {
//    @Bean
//    public Book book(){
//        return new Book();
//    }
}
