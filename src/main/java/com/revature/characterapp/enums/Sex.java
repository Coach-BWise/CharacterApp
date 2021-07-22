package com.revature.characterapp.enums;

import java.util.Random;

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
    public static Sex random(){
        Sex[] values = Sex.values();
        return values[new Random().nextInt(values.length)];
    }
}
