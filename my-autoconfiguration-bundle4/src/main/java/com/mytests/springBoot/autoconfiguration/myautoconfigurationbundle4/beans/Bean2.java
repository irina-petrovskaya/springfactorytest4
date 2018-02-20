package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class Bean2 {
    private final String id;

    public Bean2(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
