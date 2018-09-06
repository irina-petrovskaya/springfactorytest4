package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/6/2018.
 * Project: springfactorytest4
 * *******************************
 */
public class Bean4 {
    private final String id;

    public Bean4(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
