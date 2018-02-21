package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConditionalBeansConfig {

   // @Bean(name="newconfig_condition")
    public String s0() {
        return "newconfig_condition";
    }

   //@Bean(name="importedconfig2inner_condition")
    public String s1() {
        return "importedconfig2inner_condition";
    }
    //@Bean(name="importedconfig2_condition")
    public String s2() {
        return "importedconfig2_condition";
    }
   //@Bean(name="importedconfig1_condition")
    public String s3() {
        return "importedconfig1_condition";
    }
}
