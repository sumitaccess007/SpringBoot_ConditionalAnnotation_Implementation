package com.sumitaccess007.config;

import com.sumitaccess007.condition.DBDEVCondition;
import com.sumitaccess007.condition.DBPRODCondition;
import com.sumitaccess007.condition.DBQACondition;
import com.sumitaccess007.condition.DBUATCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfiguration {

    @Bean
    @Conditional(DBDEVCondition.class)
    public void connectDEVDB(){
        System.out.println("In connectDEVDB() method");
    }

    @Bean
    @Conditional(DBQACondition.class)
    public void connectQADB(){
        System.out.println("In connectQADB() method");
    }

    @Bean
    @Conditional(DBUATCondition.class)
    public void connectUATDB(){
        System.out.println("In connectUATDB() method");
    }

    @Bean
    @Conditional(DBPRODCondition.class)
    public void connectPRODDB(){
        System.out.println("In connectPRODDB() method");
    }
}
