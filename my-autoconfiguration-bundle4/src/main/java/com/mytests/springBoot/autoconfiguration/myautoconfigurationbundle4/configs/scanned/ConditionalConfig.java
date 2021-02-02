package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.scanned;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean3;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration("myconfig_enabled_by_prop4")
@ConditionalOnProperty(name="myprops.prop4", havingValue = "prop4")
public class ConditionalConfig {
    @Bean
    public Bean3 Bean3() {
        return new Bean3();
    }
}
