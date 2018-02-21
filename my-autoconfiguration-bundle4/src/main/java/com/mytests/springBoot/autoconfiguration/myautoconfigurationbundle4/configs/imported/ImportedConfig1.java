package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.imported;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnBean(name = "importedconfig1_condition")

public class ImportedConfig1 {

    @Bean
    public Bean1 bean1_from_importedconfig1() {
        return new Bean1("bean1_from_importedconfig1");
    }
}
