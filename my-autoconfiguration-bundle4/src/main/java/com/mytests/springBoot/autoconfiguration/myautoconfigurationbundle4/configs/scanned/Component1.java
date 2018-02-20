package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.scanned;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component("Component1")
@ConditionalOnProperty(name="myprops.prop1", havingValue = "prop1")
public class Component1 {


    @Bean
    public Bean1 bean1_from_component1() {
        return new Bean1("bean1_from_component1");
    }
}
