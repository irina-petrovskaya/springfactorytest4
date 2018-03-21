package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 3/21/2018.
 * Project: springfactorytest4
 * *******************************
 */
@ConditionalOnProperty(prefix = "myprops.custom1.", name = "flag1",havingValue = "true")
public class Config2 {
    @Bean
    public Bean2 bean2() {
        return new Bean2("b2");
    }
}
