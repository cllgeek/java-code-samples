package org.geekjc.jdbcmulti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author ll
 * @date 2019年09月27日 1:09 PM
 */
@Configuration
public class JdbcTemplateConfig {
    @Resource(name = "dsOne")
    DataSource dsOne;
    @Autowired
    @Qualifier("dsTwo")
    DataSource dsTwo;

    @Bean
    JdbcTemplate jdbcTemplateOne() {
        return new JdbcTemplate(dsOne);
    }

    @Bean
    JdbcTemplate jdbcTemplateTwo() {
        return new JdbcTemplate(dsTwo);
    }

}
