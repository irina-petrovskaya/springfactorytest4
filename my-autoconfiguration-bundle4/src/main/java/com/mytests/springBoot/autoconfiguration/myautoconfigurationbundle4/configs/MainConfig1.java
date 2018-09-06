package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean3;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig1 {
    @Bean(name = "bean10")
    public Bean1 bean1() {
        return new Bean1("bean1 from MainConfig1");
    }

    @Configuration
     static class MainConfig1_Inner1{
        @Bean(name = "bean20")
        public Bean2 bean2() {
            return new Bean2("bean2 from MainConfig1_Inner1");
        }
        @Configuration
         static class MainConfig1_Inner2{
            @Bean(name = "bean30")
            public Bean3 bean3() {
                return new Bean3("bean3 from MainConfig1_Inner2");
            }
            @Configuration
             static class MainConfig1_Inner3{
                @Bean(name = "bean40")
                public Bean4 bean4() {
                    return new Bean4("bean4 from MainConfig1_Inner3");
                }
            }

        }
    }

}
