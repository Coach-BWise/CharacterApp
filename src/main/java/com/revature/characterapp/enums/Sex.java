package com.revature.characterapp.enums;

public enum Sex {

    MALE("MALE"),
    FEMALE("FEMALE");

    private final String sex;

    Sex(String sex){
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
