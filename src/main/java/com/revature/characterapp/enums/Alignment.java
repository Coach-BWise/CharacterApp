package com.revature.characterapp.enums;

import java.util.Random;

import lombok.*;

@Getter
public enum Alignment {
    LAWFUL_GOOD("LAWFUL GOOD"),
    NEUTRAL_GOOD("NEUTRAL GOOD"),
    CHAOTIC_GOOD("CHAOTIC GOOD"),
    LAWFUL_NEUTRAL("LAWFUL NEUTRAL"),
    TRUE_NEUTRAL("TRUE NEUTRAL"),
    CHAOTIC_NEUTRAL("CHAOTIC NEUTRAL"),
    LAWFUL_EVIL("LAWFUL EVIL"),
    NEUTRAL_EVIL("NEUTRAL EVIL"),
    CHAOTIC_EVIL("CHAOTIC EVIL");

    private String alignment;

    public static Alignment random(){
        Alignment[] values = Alignment.values();
        return values[new Random().nextInt(values.length)];
    }
    Alignment(String alignment){
        this.alignment = alignment;
    }
}
