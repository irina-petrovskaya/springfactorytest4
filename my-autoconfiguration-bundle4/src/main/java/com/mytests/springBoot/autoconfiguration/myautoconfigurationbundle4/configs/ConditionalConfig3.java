package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean3;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration("myconfig_enabled_by_prop5")
@ConditionalOnProperty(name="myprops.prop5", matchIfMissing = true)
public class ConditionalConfig3 {
    @Bean
    public Bean3 bean3() {
        return new Bean3("bean3");
    }
}
