package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

/**
 * *
 * <p>Created by irina on 16.03.2021.</p>
 * <p>Project: springfactorytest4</p>
 * *
 */
public class Bean3 {
    private final String id;

    public Bean3(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
