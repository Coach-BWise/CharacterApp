package com.revature.characterapp.aspects;

import com.revature.characterapp.exceptions.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ExceptionHandlerAspect {

    @ExceptionHandler(CharacterNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleCharacterNotFoundException(){ }

}
