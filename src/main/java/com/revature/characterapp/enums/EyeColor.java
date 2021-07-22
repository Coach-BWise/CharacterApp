package com.revature.characterapp.enums;

import java.util.Random;

import lombok.*;

@Getter
public enum EyeColor {
    BLACK("BLACK"),
    BLUE("BLUE"),
    GREEN("GREEN"),
    RED("RED"),
    WHITE("WHITE"),
    TURQUOISE("TURQUOISE"),
    GRAY("GRAY"),
    PURPLE("PURPLE"),
    GOLD("GOLD");

    private String color;

    
    public static EyeColor random(){
        EyeColor[] values = EyeColor.values();
        return values[new Random().nextInt(values.length)];
    }

    EyeColor(String color){
        this.color = color;
    }
}
