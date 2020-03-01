package com.example.myapplication;
// The next is the line we can use as stream layer
import android.icu.util.Output;

import java.io.*;

//Here we use the class as the main example
// This is the byte stream;

public class My_class  {
    public static void main(String[] args) throws IOException {
        // This is the init in the next sense
        //This is the instance as we can see in the next lines of the code
        // Init the constructors of the class extern

        FileInputStream in = null; // This is the init of the class Fileinput
        FileOutputStream out = null; // This is the init of the output class FileOutput class
        // So here here we use the try...
        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            // Here we use the conditional form
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        }
        finally {
            if (in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
        // Here is the end of the main constructor
    }
}