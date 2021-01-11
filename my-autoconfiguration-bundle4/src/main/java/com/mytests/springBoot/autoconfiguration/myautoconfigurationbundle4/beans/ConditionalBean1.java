package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class ConditionalBean1 {
    private final String id;

    public ConditionalBean1(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
