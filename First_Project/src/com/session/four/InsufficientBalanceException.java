package com.session.four;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String message){
        super(message);
    }
}
