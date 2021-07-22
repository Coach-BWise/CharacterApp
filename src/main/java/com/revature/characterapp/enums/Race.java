package com.revature.characterapp.enums;

import lombok.*;

@Getter
public enum Race {
    HUMAN("HUMAN"),
    ELF("ELF"),
    ORC("ORC"),
    HALF_ELF("HALF ELF"),
    HALF_ORC("HALF ORC"),
    DRAGON_BORN("DRAGON BORN"),
    HALFLING("HALFLING"),
    DWARF("DWARF"),
    DARK_ELF("DARK ELF"),
    DEMON("DEMON"),
    DIVINE("DIVINE");

    private String race;

    Race(String race){
        this.race = race;
    }

}
