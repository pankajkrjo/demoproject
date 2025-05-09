package com.java.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;

public class DataException extends Exception {
    private static final long serialVersionUID=1L;

    public DataException(Throwable throwable) {
        super(throwable);
        this.throwable = throwable;
    }

    private String message;
    private Throwable throwable;
    private String statckTraceString;

    public DataException(String s) {
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    public String getStatckTraceString() {
        return statckTraceString;
    }

    public void setStatckTraceString(String statckTraceString) {
        this.statckTraceString = statckTraceString;
    }

    static public String generateStackTraceString(Throwable t){
        StringWriter s=new StringWriter();
        t.printStackTrace(new PrintWriter(s));
        return s.toString();
    }

    public DataException(String message, Throwable throwable) {
        super(message,throwable);
        generateStackTraceString(throwable);
        this.message = message;
        this.throwable = throwable;
    }
}
