package com.opencodez.config;

import com.mongodb.MongoCredential;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.service.document.MongoDbFactoryConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.cloud.service.PooledServiceConnectorConfig;
import org.springframework.cloud.service.relational.DataSourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;

//@Configuration
//@Profile("cloud")
public class DbCloudConfig extends AbstractCloudConfig{
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }

    /**
     * Configure DataSource created by User Provided Service
     * cf cups oracle-db -p ‘{"jdbcUrl":"jdbc:oracle:thin:@192.168.1.167:1521/orcl”}'
     * Username and Password are supplied from
     * spring.datasources.username and spring.datasource.password - this is useful when need to inject credentials from vault
     * @param minPoolSize
     * @param maxPoolSize
     * @param maxWaitTime
     * @return
     */

//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public DataSource dataSource(@Value("${ds.min.pool.size:5}") int minPoolSize
//            , @Value("${ds.max.pool.size:15}") int maxPoolSize
//            , @Value("${ds.max.wait.time:5000}") int maxWaitTime) {
//
//
//        DataSourceConfig.ConnectionConfig connConfig = new DataSourceConfig.ConnectionConfig("");
//
//        PooledServiceConnectorConfig.PoolConfig poolConfig
//                = new PooledServiceConnectorConfig.PoolConfig(minPoolSize, maxPoolSize, maxWaitTime);
//
//        Map<String, Object> properties = new HashMap<>();
//        properties.put("validationQuery", "test validation query");
//        properties.put("testOnBorrow", false);
//
//        DataSourceConfig dataSourceConfig = new DataSourceConfig(poolConfig, connConfig, properties);
//
//        DataSource dataSource = connectionFactory().dataSource("service-id", dataSourceConfig);
//        return dataSource;
//    }
//
//    @Bean
//    public MongoDbFactory documentMongoDbFactory() {
//        String mongoUser;
//        MongoCredential credential = MongoCredential.createCredential(mongoUser, databaseName, mongoPass.toCharArray());
//
//        MongoDbFactory mongoDbFactory = connectionFactory().mongoDbFactory();
//        return mongoDbFactory;
//    }
}
