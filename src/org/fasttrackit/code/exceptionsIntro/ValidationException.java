package org.fasttrackit.code.exceptionsIntro;

public class ValidationException extends RuntimeException{
    private final String message;
    public ValidationException(String message){
        System.out.println("It is a custom Exception");
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
