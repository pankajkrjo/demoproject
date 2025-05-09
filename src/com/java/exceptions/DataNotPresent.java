package com.java.exceptions;

public class DataNotPresent  extends DataException{
    private static final long serialVersionUID=1L;
    public DataNotPresent(){
        super("");
    }

    public DataNotPresent(String message, Throwable throwable) {
        super(message, throwable);
    }

    public DataNotPresent(String message){
        super(message);
    }
}
