package com.softserve.museum.web.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.softserve.museum.dao.impl.Impl;
import com.softserve.museum.domain.Entities;
import com.softserve.museum.service.Service;

/**
 * Persistence configuration. 
 * 
 * @author Kostyantyn Panchenko
 * @version 1.0
 * @since 23.10.2016
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
@ComponentScan(
        basePackageClasses = {PersistenceConfig.class, 
                                Entities.class, 
                                Impl.class,
                                Service.class})
public class PersistenceConfig {

    @Autowired
    private Environment env;
    
    private String[] packages = {"com.softserve.museum.domain"};
    
    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        ds.setUrl(env.getProperty("jdbc.url"));
        ds.setUsername(env.getProperty("jdbc.username"));
        ds.setPassword(env.getProperty("jdbc.password"));
        return ds;
    }
    
    @Bean(name = "sessionFactory")
    public LocalSessionFactoryBean sessionFactory(DataSource ds) {
        LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
        sf.setDataSource(ds);
        sf.setPackagesToScan(packages);
        sf.setHibernateProperties(getHibernateProperties());
        return sf;
    }
    
    private Properties getHibernateProperties() {
        Properties props = new Properties();
        props.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
        props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
        props.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        return props;
    }
    
    @Bean
    public HibernateTransactionManager txManager(SessionFactory sf) {
        return new HibernateTransactionManager(sf);
    }
    
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslator() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
}
