package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.SearchStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainConfig {

    @Bean  @ConditionalOnMissingBean
    public ConditionalBean0 conditionalBean0() {
        return new ConditionalBean0("conditionalBean0");
    }
    
    @Bean @ConditionalOnMissingBean(type = "com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.ConditionalBean1")
    public Bean0 bean0() {
        return new Bean0("bean0 from bundle; should not be available if bean of ConditionalBean1 type exists");
    }

    @Bean @ConditionalOnMissingBean(value = ConditionalBean2.class)
    public Bean1 bean1() {
        return new Bean1("bean1 from bundle; should not be available if bean of ConditionalBean2 type exists");
    }

    @Bean @ConditionalOnMissingBean(name = "condition3")
    public Bean2 bean2 () {
        return new Bean2("bean2 from bundle; should not be available if 'condition3' bean exists");
    }

    @Bean @ConditionalOnMissingBean(annotation = ConditionalAnno1.class)
    public Bean3 bean3() {
        return new Bean3("bean3 from bundle; should not be available if bean annotated with ConditionalAnno1 exists");
    }

    @Bean @ConditionalOnMissingBean(name = {"condition4","condition41"}, search = SearchStrategy.CURRENT)
    public Bean4 bean4() {
        return new Bean4("bean4 from bundle; should not be available if 'condition4' and 'condition41' beans exist");
    }
}
