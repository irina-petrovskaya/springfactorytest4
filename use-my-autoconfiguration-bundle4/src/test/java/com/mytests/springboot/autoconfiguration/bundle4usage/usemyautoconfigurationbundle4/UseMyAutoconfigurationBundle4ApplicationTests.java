package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans.*;
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

    // check autowired for management port conditions:
    @Autowired(required = false)
    private Bean3 bean4_for_same_port;
    @Autowired(required = false)
    private Bean4 bean4_for_diff_port;
    @Autowired(required = false)
    private Bean5 bean4_for_disabled_port;


    @Test
    public void test() {

    }

}
