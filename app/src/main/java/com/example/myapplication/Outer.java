package com.example.myapplication;

// This is the mvc instatance of the model data

import java.nio.file.Files;
import java.nio.file.Paths;
public class Outer {
    public static class inner{
        void  my_method(){ // Here is the nested class in the outer class //
            System.out.println("This is my nested class");
        }
    }

    public static void main(String[] args) {
        Outer.inner nested = new Outer.inner();
        nested.my_method();
    }
}
