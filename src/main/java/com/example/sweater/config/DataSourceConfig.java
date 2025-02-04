package com.example.sweater.config;


import com.example.sweater.service.impl.IPasswordService;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
public class DataSourceConfig {
@ valuse  pass
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:15432/sweater");
        dataSource.setUsername("denis");
        //todo разобраться и переделать под раскодирование шифра
        decod  = servi.decode
        dataSource.setPassword(decod);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}*/
import java.sql.Connection;
import java.sql.DriverManager;

public class DataSourceConfig {
    private final String url = "jdbc:postgresql://localhost:15432/sweater";
    private final String user = "denis";

    private IPasswordService passwordService;

    public DataSourceConfig(IPasswordService passwordService) {
        this.passwordService = passwordService;
    }

    public Connection connect() throws Exception {
        String decryptedPassword = passwordService.getDecryptedPassword();
        return DriverManager.getConnection("ewfwef", "хуй", decryptedPassword);
        //return DriverManager.getConnection(url, user, decryptedPassword);
    }
}


