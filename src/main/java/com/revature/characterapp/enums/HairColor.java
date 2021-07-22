package com.revature.characterapp.enums;

import java.util.Random;

public enum HairColor {
    WHITE("WHITE"),
    BLACK("BLACK"),
    BROWN("BROWN"),
    BLONDE("BLONDE"),
    RED("RED"),
    GINGER("GINGER"),
    BLUE("BLUE"),
    PURPLE("PURPLE"),
    GREEN("GREEN"),
    GRAY("GRAY");

    private String color;
    HairColor(String color){
        this.color = color;
    }

    
    public static HairColor random(){
        HairColor[] values = HairColor.values();
        return values[new Random().nextInt(values.length)];
    }

    public String getColor() {
        return color;
    }
}
