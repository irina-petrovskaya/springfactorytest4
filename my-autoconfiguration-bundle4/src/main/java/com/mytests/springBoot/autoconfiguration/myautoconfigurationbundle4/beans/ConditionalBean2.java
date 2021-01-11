package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class ConditionalBean2 {
    private final String id;

    public ConditionalBean2(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
