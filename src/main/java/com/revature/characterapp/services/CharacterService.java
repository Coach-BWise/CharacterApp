package com.revature.characterapp.services;

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
        return null;
    }
}
