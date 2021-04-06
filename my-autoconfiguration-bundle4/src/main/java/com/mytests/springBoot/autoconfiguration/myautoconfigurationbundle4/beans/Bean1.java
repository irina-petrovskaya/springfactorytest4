package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class Bean1 {

    private final String id;

    public Bean1(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
