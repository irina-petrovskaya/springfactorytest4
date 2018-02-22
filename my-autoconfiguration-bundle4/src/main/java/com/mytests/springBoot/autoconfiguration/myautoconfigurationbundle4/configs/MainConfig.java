package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public Bean1 bean1_from_mainconfig() {
        return new Bean1("bean1_from_mainconfig");
    }

    /**
     * inner configuration is registered using $ (MainConfig$InnerConfig1):
     * no gutter icon, bean2 is not resolved
     */
    public static class InnerConfig1{
        @Bean
        public Bean2 bean2_from_innerconfig1() {
            return new Bean2("bean2_from_innerconfig1");
        }


    }

    /**
     * inner configuration is registered: since it has private visibility,
     * no gutter icon is shown. Bean3 is resolved however (ok)
     */
    private static class InnerConfig2{

        @Bean
        public Bean3 bean3_from_innerconfig2() {
            return new Bean3("bean3_from_innerconfig2");
        }
    }

    public static class InnerContainer{

        /**
         * inner configuration is registered using $ (MainConfig$InnerContainer$InnerConfig3):
         * no gutter icon, bean2 is not resolved
         */
        public static class InnerConfig3{

            @Bean
            public Bean4 bean4_from_innerconfig3() {
                return new Bean4("bean4_from_innerconfig3");
            }
        }

    }

    /**
     * registered with trailing /: no gutter icon,
     * bean is not resolved
     */
    public static class InnerConfig4{
        @Bean
        public Bean5 bean5_from_innerconfig4() {
            return new Bean5("bean5_from_innerconfig4");
        }

    }
}
