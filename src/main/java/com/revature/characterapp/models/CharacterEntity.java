package com.revature.characterapp.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@Table(name = "characters")
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String sex;
    String hairColor;
    String eyeColor;
    String race;
    String alignment;
    String profession;
    String nationality;
    int height;
    int age;



}
