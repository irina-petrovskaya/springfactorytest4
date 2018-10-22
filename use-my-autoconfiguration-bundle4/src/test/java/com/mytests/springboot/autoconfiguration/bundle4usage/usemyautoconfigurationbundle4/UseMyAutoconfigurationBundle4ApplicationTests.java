package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.Bean2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UseMyAutoconfigurationBundle4ApplicationTests {


    @Autowired
    private Environment environment;

    @Autowired(required = false)
    Bean1 bean1;

    @Autowired(required = false)
    Bean2 bean2;
    @Autowired
    private MyProperties myProperties;


    @Test
    public void test() {
        if (myProperties.getProp1() != null) {
            System.out.println("myprops.prop1 = "+myProperties.getProp1());
        } else {
            System.out.println("property myprops.prop1 is not set");
        }
        Assert.assertNotNull("property should be defined and have value 'prop1'",bean1);
        Assert.assertNotNull("property should be defined and have value 'prop1'",bean2);
    }

}
