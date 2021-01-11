package com.mytests.springBoot.autoconfiguration.myautoconfigurationbundle4.beans;

public class ConditionalBean5 {
    private final String id;

    public ConditionalBean5(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
