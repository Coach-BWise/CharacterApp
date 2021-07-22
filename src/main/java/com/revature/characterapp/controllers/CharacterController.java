package com.revature.characterapp.controllers;

import com.revature.characterapp.models.*;
import com.revature.characterapp.services.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/character")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CharacterController {

    CharacterService characterService;

    //When they generate a new character
    @GetMapping("/new")
    public CharacterEntity generateCharacter(){
        return null;
    }

    //When they want to see all the characters saved
    @GetMapping("/all")
    public List<CharacterEntity> retrieveAllCharacters(){
        return null;
    }

    //Get character by ID
    @GetMapping("/{id}")
    public CharacterEntity retrieveCharacterById(@PathVariable int id){
        return null;
    }

    //Edit new character
    @PostMapping("/edit/{id}")
    public CharacterEntity editCharacterById(@PathVariable int id){
        return null;
    }

}
