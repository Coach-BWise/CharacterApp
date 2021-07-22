package com.revature.characterapp.enums;

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

    EyeColor(String color){
        this.color = color;
    }
}
