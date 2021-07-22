package com.revature.characterapp.controllers;

import com.revature.characterapp.models.*;
import com.revature.characterapp.services.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/character")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CharacterController {

    CharacterService characterService;

    //When they generate a new character
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/new", produces = MediaType.APPLICATION_JSON_VALUE)
    public CharacterEntity generateCharacter(){
        return characterService.generate();
    }

    //When they want to see all the characters saved
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CharacterEntity> retrieveAllCharacters(){
        return characterService.getAll();
    }

    //Get character by ID
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CharacterEntity retrieveCharacterById(@PathVariable int id){
        return characterService.getByID(id);
    }

    //Edit new character
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/edit", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CharacterEntity editCharacterById(@RequestBody CharacterEntity characterEntity){
        return characterService.edit(characterEntity);
    }

}
