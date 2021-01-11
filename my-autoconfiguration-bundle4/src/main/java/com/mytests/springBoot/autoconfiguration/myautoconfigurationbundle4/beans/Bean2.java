package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class Bean2 {
    private BeanService2 beanService2;

    public BeanService2 getBeanService2() {
        return beanService2;
    }

    public Bean2(BeanService2 beanService2) {
        this.beanService2 = beanService2;
    }
}
