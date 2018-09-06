package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean3;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig2 {
    @Bean(name = "bean11")
    public Bean1 bean1() {
        return new Bean1("bean1 from MainConfig2");
    }

    @Configuration
     class MainConfig2_Inner1{
        @Bean(name = "bean21")
        public Bean2 bean2() {
            return new Bean2("bean2 from MainConfig2_Inner1");
        }
        @Configuration
         class MainConfig2_Inner2{
            @Bean(name = "bean31")
            public Bean3 bean3() {
                return new Bean3("bean3 from MainConfig2_Inner2");
            }
            @Configuration
             class MainConfig2_Inner3{
                @Bean(name = "bean41")
                public Bean4 bean4() {
                    return new Bean4("bean4 from MainConfig2_Inner3");
                }
            }

        }
    }

}
