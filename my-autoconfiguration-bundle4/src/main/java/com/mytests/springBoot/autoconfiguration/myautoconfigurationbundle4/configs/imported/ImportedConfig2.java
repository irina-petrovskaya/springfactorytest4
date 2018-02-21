package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.imported;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnBean(name="importedconfig2_condition")
public class ImportedConfig2 {



    @Configuration
    @ConditionalOnBean(name="importedconfig2inner_condition")
    public static class ImportedConfig2Inner{
        @Bean
        public Bean2  bean2_from_importedconfig2inner() {
            return new Bean2("bean2_from_importedconfig2inner");
        }
    }
}
