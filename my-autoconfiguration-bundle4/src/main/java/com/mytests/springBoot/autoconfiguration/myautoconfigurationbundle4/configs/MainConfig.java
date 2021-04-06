package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("__main_config")
@ComponentScan
@EnableConfigurationProperties(MyProperties.class)
public class MainConfig {

    @Bean("__bean1")
    @ConditionalOnProperty(prefix = "myprops", name = "b1", havingValue = "true", matchIfMissing = false)
    public Bean1 bean1() {
        return new Bean1("bean1 conditional on myprops.b1==true");
    }

    @Override
    public String toString() {
        return "__main_config: bean of MainConfig type";
    }
}
