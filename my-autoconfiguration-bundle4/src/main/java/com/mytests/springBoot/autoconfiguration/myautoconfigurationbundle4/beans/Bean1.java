package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class Bean1 {
    
    private BeanService1 beanService1;

    public Bean1(BeanService1 beanService1) {
        this.beanService1 = beanService1;
    }

    public BeanService1 getBeanService1() {
        return beanService1;
    }
}
