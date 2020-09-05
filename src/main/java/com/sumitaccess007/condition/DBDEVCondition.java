package com.sumitaccess007.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DBDEVCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata){
        String value = System.getProperty("dbEnv");
        if(value != null){
            return value.equalsIgnoreCase("DEV");
        } else {
            Environment environment = conditionContext.getEnvironment();
            value = environment.getProperty("dbEnv");
            if(value == null) {
                return false;
            }else{
                return value.equalsIgnoreCase("DEV");
            }
        }
    }

}
