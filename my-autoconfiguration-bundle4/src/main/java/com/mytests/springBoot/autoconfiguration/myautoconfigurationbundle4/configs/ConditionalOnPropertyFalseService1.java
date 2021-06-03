package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean3;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 06.04.2021.</p>
 * <p>Project: springfactorytest4</p>
 * *
 */
@Service("__conditionalService1")
@ConditionalOnProperty(name = "myprops.serv1", havingValue = "false")
public class ConditionalOnPropertyFalseService1 implements Service1 {

    @Value("ConditionalService1 enabled if myprops.serv1 == false")
    String id;

    @Override
    public String getId() {
        return id;
    }

    @Bean
    public Bean3 b3 () {
        return new Bean3("bean3 enabled if myprops.serv1 == false");
    }
}
