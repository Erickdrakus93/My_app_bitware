package com.example.myapplication;

public class Form {
    private String name;
    private String idNun;
    private int age;

    // This is a get method as we can see in the examples

    public int get_Age(){
       return age;
    }

    // This is the setter method of the name
    public void set_age(int new_age){
        age = new_age;
    }

    public String get_id(){
        return idNun;
    }
    // This is the corresponding setter

    public void set_id(String new_id){
        idNun = new_id;
    }

    public String get_name(){
        return name;
    }

    // This is the setter method

    public void set_name(String new_name){
        name = new_name;
    }


}
