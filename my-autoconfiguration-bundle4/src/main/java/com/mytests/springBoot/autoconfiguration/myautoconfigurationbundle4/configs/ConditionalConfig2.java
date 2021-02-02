package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration("myconfig_enabled_by_prop2")
@ConditionalOnProperty(name="myprops.prop2")
public class ConditionalConfig2 {
    @Bean
    public Bean2 bean2() {
        return new Bean2("bean2");
    }
}
