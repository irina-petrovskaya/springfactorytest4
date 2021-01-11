package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class ConditionalBean3 {
    private final String id;

    public ConditionalBean3(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
