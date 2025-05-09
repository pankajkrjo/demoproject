package com.java.exceptions;

public class CustomerRecordDoNotExitException extends Exception{
    private static final long serialVersionID=1L;
    public CustomerRecordDoNotExitException(){
        super();
    }
    public CustomerRecordDoNotExitException(String msg){
        super(msg);
    }
    public CustomerRecordDoNotExitException(String msg,Throwable thr){
        super(msg,thr);
    }
}
