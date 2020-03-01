package com.example.myapplication;
import java.lang.*;
import java.awt.*;
// This is the abstract method

abstract class  Anonymous_Ineer {
    public abstract void my_method();
}

class Outer_Class{
    public static void main(String[] args) {
        Anonymous_Ineer inn = new Anonymous_Ineer() {
            @Override
            public void my_method() {
                System.out.println("This is an example of outer class");
            }
        };
        inn.my_method();
    }
}