package com.rbt.utils;
import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;


@Configuration
public class AppConfig {
    @Bean
    public SimpleMongoClientDatabaseFactory mongoDbFactory() throws UnknownHostException{
        return new SimpleMongoClientDatabaseFactory("mongodb://18.188.95.74:27017/gotham");
//        return new SimpleMongoClientDatabaseFactory(new MongoClient("localhost", 27017), "test");
    }

    @Bean
    public MongoOperations mongoOperations() throws UnknownHostException{
        return new MongoTemplate(mongoDbFactory());
    }
}