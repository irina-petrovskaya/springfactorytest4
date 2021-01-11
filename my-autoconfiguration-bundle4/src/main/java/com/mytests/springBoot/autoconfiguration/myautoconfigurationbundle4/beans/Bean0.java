package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

/**
 * *
 * <p>Created by irina on 11.01.2021.</p>
 * <p>Project: springfactorytest4</p>
 * *
 */
public class Bean0 {
    public String getDescr() {
        return descr;
    }

    private final String descr;

    public Bean0(String s) {
        this.descr = s;
    }
}
