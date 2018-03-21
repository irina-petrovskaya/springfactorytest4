package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 3/19/2018.
 * Project: springfactorytest4
 * *******************************
 */
@Configuration
@ConditionalOnProperty(prefix = "myprops", name = {"custom1.my-enum1", "custom2.str2"})
public class Config1 {

    @Bean
    public Bean1 bean1() {
        return new Bean1("b1");
    }
}
