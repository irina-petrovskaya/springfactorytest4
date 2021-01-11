package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;


import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;


@SpringBootTest
public class UseMyAutoconfigurationBundle4ApplicationTests {


    @Autowired
    private Environment environment;
    @Autowired(required = false)
    private Bean0 bean0;
    @Autowired(required = false)
    private Bean1 bean1;
    @Autowired(required = false)
    private Bean2 bean2;
    @Autowired(required = false)
    private Bean3 bean3;
    @Autowired(required = false)
    private Bean4 bean4;


    @Test
    public void test() {
        Assert.isNull(bean0, "bean0 should not be available");
        Assert.isNull(bean1, "bean1 should not be available");
        Assert.isNull(bean2, "bean2 should not be available");
        Assert.isNull(bean3, "bean3 should not be available");
        Assert.isNull(bean4, "bean4 should not be available");
    }

}
