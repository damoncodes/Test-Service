package com.estore.testservice;

public class MyException extends Exception {
    private String msg;

    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
