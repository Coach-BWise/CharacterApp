package com.revature.characterapp.enums;

import java.util.Random;

import lombok.*;

@Getter
public enum Nationality {
    GLASGOW("GLASGOW"),
    EDINBURGH("EDINBURGH"),
    ABERDEEN("ABERDEEN"),
    DUNDEE("DUNDEE"),
    PAISLEY("PAISLEY"),
    LIVINGSTON("LIVINGSTON"),
    DUNFIRMLINE("DUNFIRMLINE"),
    KIRKCALDY("KIRKCALDY"),
    FALKIRK("FALKIRK"),
    AYR("AYR"),
    PENICUIK("PENICUIK"),
    ERSKINE("ERSKINE"),
    GOTHAM("GOTHAM");

    private String nationality;
    Nationality(String nationality){
        this.nationality = nationality;
    }

    
    public static Nationality random(){
        Nationality[] values = Nationality.values();
        return values[new Random().nextInt(values.length)];
    }



}
