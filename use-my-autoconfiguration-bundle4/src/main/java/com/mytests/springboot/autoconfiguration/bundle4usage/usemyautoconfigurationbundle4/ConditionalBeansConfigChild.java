package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.ConditionalBean3;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.ConditionalBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 11.01.2021.</p>
 * <p>Project: springfactorytest4</p>
 * *
 */
@Configuration
public class ConditionalBeansConfigChild  {

    @Bean
    public ConditionalBean4 condition4() {
        return new ConditionalBean4("condition4");
    }
    @Bean
    public ConditionalBean4 condition41() {
        return new ConditionalBean4("condition41");
    }
}
