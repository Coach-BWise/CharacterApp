package com.revature.characterapp.enums;

import java.util.Random;

import lombok.*;

@Getter
public enum Profession {
    RANGER("RANGER"),
    ASSASSIN("ASSASSIN"),
    ROGUE("ROGUE"),
    KNIGHT("KNIGHT"),
    PALADIN("PALADIN"),
    BARBARIAN("BARBARIAN"),
    DRUID("DRUID"),
    MAGE("MAGE"),
    SORCERER("SORCERER"),
    CLERIC("CLERIC"),
    INNKEEPER("INNKEEPER"),
    GUARDIAN("GUARDIAN"),
    FARMER("FARMER"),
    BLACKSMITH("BLACKSMITH"),
    PRIEST("PRIEST"),
    ELDER("ELDER"),
    BEAST_TAMER("BEAST TAMER"),
    DRAGON_SLAYER("DRAGON SLAYER");

    private String profession;

    Profession(String profession){
        this.profession = profession;
    }
    public static Profession random(){
        Profession[] values = Profession.values();
        return values[new Random().nextInt(values.length)];
    }
}
