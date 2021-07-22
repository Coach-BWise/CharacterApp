package com.revature.characterapp.repositories;

import com.revature.characterapp.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {

}
