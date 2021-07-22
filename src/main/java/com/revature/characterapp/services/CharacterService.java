package com.revature.characterapp.services;

import com.revature.characterapp.enums.*;
import com.revature.characterapp.models.*;
import com.revature.characterapp.repositories.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CharacterService {

    CharacterRepository characterRepository;

    @Transactional
    public CharacterEntity generate(){
        CharacterEntity newCharacter = new CharacterEntity();

        String male = Sex.MALE.getSex();
        return saveCharacter(newCharacter);
    }

    public CharacterEntity saveCharacter(CharacterEntity characterEntity){
        return characterRepository.save(characterEntity);
    }
}
