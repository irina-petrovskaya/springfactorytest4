package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class Bean5 {
    private final String id;

    public Bean5(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
