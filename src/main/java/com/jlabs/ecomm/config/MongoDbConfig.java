//package com.jlabs.ecomm.config;
//
//import com.mongodb.Mongo;
//import com.mongodb.MongoClient;
//import com.mongodb.MongoURI;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
//
///**
// * Created by sapan on 11/6/2016.
// */
//
//@Profile("default")
//@Configuration
//public class MongoDbConfig extends AbstractMongoConfiguration{
//
//    MongoClient mongoClient;
//
//    @Value("${mongo.url}")
//    private String url;
//
//    @Value("${mongo.db}")
//    private String databaseName;
//
//
//
//    @Override
//    protected String getDatabaseName() {
//        return databaseName;
//    }
//
//    @Override
//    public Mongo mongo() throws Exception {
//        return new Mongo(new MongoURI(url));
//    }
//}
