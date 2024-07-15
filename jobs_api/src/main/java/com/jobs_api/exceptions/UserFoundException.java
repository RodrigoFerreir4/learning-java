package com.jobs_api.exceptions;

public class UserFoundException extends RuntimeException{
    public UserFoundException(){
        super("Usuário já existe");
    }
}
