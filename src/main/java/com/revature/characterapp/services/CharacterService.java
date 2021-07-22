package com.revature.characterapp.services;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.revature.characterapp.enums.*;
import com.revature.characterapp.models.*;
import com.revature.characterapp.repositories.*;
import com.revature.characterapp.exceptions.CharacterNotFoundException;

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
        Race race = Race.random();
        int height = 0;
        switch(race){
            case DARK_ELF:
                height = new Random().nextInt(10) + 55;
                break;
            case DEMON:
                height = new Random().nextInt(24) + 48;
                break;
            case DIVINE:
            case HUMAN:
                height = new Random().nextInt(18) + 58;
                break;
            case DRAGON_BORN:
                height = new Random().nextInt(14) + 68;
                break;
            case DWARF:
                height = new Random().nextInt(10) + 46;
                break;
            case ELF:
                height = new Random().nextInt(18) + 56;
                break;
            case HALFLING:
                height = new Random().nextInt(6) + 33;
                break;
            case HALF_ELF:
                height = new Random().nextInt(14) + 59;
                break;
            case HALF_ORC:
                height = new Random().nextInt(18) + 60;
                break;
            case ORC:
                height = new Random().nextInt(12) + 72;
                break;
            default:
                break;
        }
        return saveCharacter(new CharacterEntity(0, "John Doe", Sex.random().getSex(), HairColor.random().getColor(), EyeColor.random().getColor(), race.getRace(), Alignment.random().getAlignment(), Profession.random().getProfession(), Nationality.random().getNationality(), height , new Random().nextInt(100)));
    }

    public CharacterEntity saveCharacter(CharacterEntity characterEntity){
        return characterRepository.save(characterEntity);
    }

    public List<CharacterEntity> getAll(){
        return characterRepository.findAll();
    }
    public CharacterEntity getByID(int i){
        Optional<CharacterEntity> character = characterRepository.findById(i);
        if(character.isPresent()){
            return character.get();
        }
        else{
            throw new CharacterNotFoundException("Character does not exist...yet.");
        }
    }

    public CharacterEntity edit(CharacterEntity character) {


        Optional<CharacterEntity> old = characterRepository.findById(character.getId());
        if (old.isPresent()) {
            old.get().setAge(character.getAge());
            old.get().setName(character.getName());
            old.get().setAlignment(character.getAlignment());
            old.get().setEyeColor(character.getEyeColor());
            old.get().setHairColor(character.getHairColor());
            old.get().setHeight(character.getHeight());
            old.get().setNationality(character.getNationality());
            old.get().setProfession(character.getProfession());
            old.get().setRace(character.getRace());
            old.get().setSex(character.getSex());
            return characterRepository.save(old.get());
        }
        else {
            return characterRepository.save(character);
        }
    }
}
