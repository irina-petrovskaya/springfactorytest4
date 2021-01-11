package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;


import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.util.Assert;


@SpringBootTest
public class UseMyAutoconfigurationBundle4ApplicationTests {


    @Autowired(required = false)
    BeanService1Impl1 beanService1_first;
    @Autowired(required = false)
    BeanService1Impl2 beanService1_second;
    
    @Autowired(required = false)
    BeanService1 beanService1;  // here both beans are suggested always despite the conditions, but error is shown if multiple ones match
    
    @Autowired(required = false)
    Bean1 bean1;

    @Autowired(required = false)
    BeanService2 beanService2;   // here both beans are suggested always despite the conditions, but error is shown if multiple ones match
    @Autowired(required = false)
    Bean2 bean2;

    @Test
    public void testBeanService1() {
        if (beanService1_first != null & beanService1_second == null) {
            Assertions.assertEquals(bean1.getBeanService1().getDescription(),"beanService1_firstImpl");
            System.out.println("first is not null; "+bean1.getBeanService1().getDescription());
        }
        if (beanService1_first == null & beanService1_second != null) {
            Assertions.assertEquals(bean1.getBeanService1().getDescription(),"beanService1_secondImpl");
            System.out.println("second is not null; "+bean1.getBeanService1().getDescription());
        }
        if (beanService1_first != null & beanService1_second != null) {
            Assertions.assertEquals(bean1.getBeanService1().getDescription(),"beanService1_firstImpl");
            System.out.println("both are not null; "+bean1.getBeanService1().getDescription());
        }
        if (beanService1_first == null & beanService1_second == null) {
            Assertions.assertNull(bean1);
            System.out.println("both are null, no bean1 present ");
        }
    }

}
