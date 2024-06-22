package com.globalpayex.bank.exception;

public class LowBalException extends Exception{

    public LowBalException(String message) {
        super(message);
    }
}
