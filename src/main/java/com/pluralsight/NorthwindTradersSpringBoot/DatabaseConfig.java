package com.pluralsight.NorthwindTradersSpringBoot;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    private BasicDataSource basicDataSource;

    public DatabaseConfig(@Value("${connectionUrl}") String url,
                          @Value("${username}") String username,
                          @Value("${password}") String password) {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        this.basicDataSource = basicDataSource;
    }

    @Bean
    public DataSource dataSource() {
        return this.basicDataSource;
    }
}
