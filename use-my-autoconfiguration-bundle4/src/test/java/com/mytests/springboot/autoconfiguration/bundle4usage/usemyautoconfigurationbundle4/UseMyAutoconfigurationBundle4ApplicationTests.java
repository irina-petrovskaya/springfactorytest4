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
    private Bean1 bean1;

    @Autowired(required = false)
    private Bean2 bean2;
    @Test
    public void testBean1() {
       Assert.assertNotNull(bean1);
    }
    @Test
    public void testBean2() {
        Assert.assertNotNull(bean2);
    }
}
