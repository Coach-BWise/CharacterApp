package com.revature.characterapp.enums;

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

    public String getColor() {
        return color;
    }
}
