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
    private Bean1 mybean_ConditionalOnPropertyWithInnerConfig1_bean1;

    @Autowired(required = false)
    private Bean2 mybean_ConditionalOnPropertyWithInnerConfig1_inner_bean2;


    @Test
    public void testConditionalOnPropertyInner() {
        String prop1 = environment.getProperty("myprops.prop1");
        String prop2 = environment.getProperty("myprops.prop2");
        System.out.println("prop1="+prop1+", prop2="+prop2);
        if(prop1==null){prop1 = "";}
        if(prop2==null){prop2 = "";}
        if((prop1.equals("prop1"))&&(prop2.equals("prop2"))){
            System.out.println("both beans should be available");
            Assert.assertNotNull(mybean_ConditionalOnPropertyWithInnerConfig1_bean1);
            Assert.assertNotNull(mybean_ConditionalOnPropertyWithInnerConfig1_inner_bean2);
        } else {
            if(prop1.equals("prop1")){
                System.out.println("only bean1 should be available");
                Assert.assertNotNull(mybean_ConditionalOnPropertyWithInnerConfig1_bean1);
                Assert.assertNull(mybean_ConditionalOnPropertyWithInnerConfig1_inner_bean2);
            } else {
                System.out.println("both beans should be not available");
                Assert.assertNull(mybean_ConditionalOnPropertyWithInnerConfig1_bean1);
                Assert.assertNull(mybean_ConditionalOnPropertyWithInnerConfig1_inner_bean2);
            }
        }
    }

}
