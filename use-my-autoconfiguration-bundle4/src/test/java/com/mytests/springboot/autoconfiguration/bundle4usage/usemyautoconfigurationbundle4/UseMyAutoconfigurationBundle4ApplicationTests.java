package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.configs.MainConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UseMyAutoconfigurationBundle4ApplicationTests {


    @Resource(name = "mainConfig.FooConfig")  // correct name!
    private MainConfig.FooConfig foo;

    //@Resource(name = "fooConfig") // incorrect name!
    private MainConfig.FooConfig foo2;

    //@Resource(name = "org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration") // correct name!
    private Object whitelabelErrorViewConfiguration;

    //@Resource(name = "whitelabelErrorViewConfiguration") // incorrect name!
    private Object whitelabelErrorViewConfiguration1;

    //@Resource(name = "error")
    private Object error;

    //@Resource(name = "beanNameViewResolver")
    private Object beanNameViewResolver;

    @Autowired
    private WebApplicationContext applicationContext;


    @Test
    public void testBeanNameViewResolver() {
        System.out.println(applicationContext.getBean("beanNameViewResolver").getClass());
    }

    @Test
    public void testwhitelabelErrorViewConfiguration() {
        System.out.println(applicationContext.getBean("org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration").getClass());
    }

    @Test
    public void testError() {
        System.out.println(applicationContext.getBean("error").getClass());
    }
}
