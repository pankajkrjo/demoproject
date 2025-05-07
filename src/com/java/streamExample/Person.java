package com.java.streamExample;

public class Person {

    String name;
    int mobileNumber;
    String roolnumber;

    public Person(String name, int mobileNumber, String roolnumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.roolnumber = roolnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRoolnumber() {
        return roolnumber;
    }

    public void setRoolnumber(String roolnumber) {
        this.roolnumber = roolnumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", roolnumber='" + roolnumber + '\'' +
                '}';
    }
}
