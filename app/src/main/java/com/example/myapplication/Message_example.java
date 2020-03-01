package com.example.myapplication;

import androidx.core.app.NavUtils;

interface message{
    String greet();
}

class My_new_Class{
    private void  display_message(message m){
        System.out.println(m.greet() + "This is an example in a inner example");
    }

    public static void main(String[] args) {
        My_new_Class obj = new My_new_Class();
        // This is the instance of the main class
        obj.display_message(new message() {
            @Override
            public String greet() {
                return "Hello World";
            }
        });
    }

}