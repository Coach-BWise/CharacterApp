package com.revature.exceptions;

public class CharacterNotFoundException extends RuntimeException{
    public CharacterNotFoundException(String message){
        super(message);
    }
}