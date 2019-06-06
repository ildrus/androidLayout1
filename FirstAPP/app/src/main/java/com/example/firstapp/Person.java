package com.example.firstapp;

public class Person {

    private String name;
    private int years;

    public Person(String name,int years){
        this.name=name;
        this.years=years;
    }

    public String getName(){
        return this.name;
    }

    public int getYears(){
        return this.years;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setYears(int year){
        this.years=years;
    }


}
