package com.bookstore.dsconfig;

import com.zaxxer.hikari.HikariDataSource;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureDataSource {

    @Bean(name = "dataSource")
    public HikariDataSource dataSource() {

        HikariDataSource hds = new HikariDataSource();

        hds.setJdbcUrl("jdbc:mysql://localhost:3306/bookstoredb?createDatabaseIfNotExist=true");
        hds.setUsername("root");
        hds.setPassword("root");
        hds.setConnectionTimeout(50000);
        hds.setIdleTimeout(300000);
        hds.setMaxLifetime(900000);
        hds.setMaximumPoolSize(8);
        hds.setMinimumIdle(8);
        hds.setPoolName("MyPool");
        hds.setConnectionTestQuery("select 1 from dual");
        hds.setAutoCommit(false);        

        return hds;
    }

    @FlywayDataSource
    @Bean(initMethod = "migrate")
    public Flyway flyway(@Qualifier("dataSource") HikariDataSource dataSource) {

        return Flyway.configure()
                .dataSource(dataSource)                
                .locations("classpath:db/migration") // this path is default
                .load();
    }
}
