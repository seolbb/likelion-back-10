package org.example.springjdbc06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class SqlConfig {
//    @Bean
//    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource){
//        return new NamedParameterJdbcTemplate(dataSource);
//    }

    @Bean
    public Properties sqlQueries() throws IOException{
        Resource resource = new ClassPathResource("sql/queries.sql");
        Properties properties = new Properties();
        properties.load(resource.getInputStream());
        return properties;
    }
}
