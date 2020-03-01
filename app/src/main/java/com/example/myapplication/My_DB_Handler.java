package com.example.myapplication;
// Here we use this file with the part of the DB model
// Here we define the import statements to extends our class
import android.accessibilityservice.GestureDescription;
import android.*;
import android.content.ContentQueryMap;
import android.content.ContentValues;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.view.View;

import java.lang.reflect.Constructor;
import java.sql.SQLInput;
import java.util.PriorityQueue;
// Here we use the cursor class to provide the best architecture //

class My_DB_Handler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "person.db";
    private static final String TABLE_NAME = "person";
    private static final String COLUMN_ID = "Person_ID";
    private static final String COLUMN_NAME = "Person_Name";

    // In this is the init of the Data_Base with the resources of java API
    // This is the init of the constructor as init the object //
    public My_DB_Handler(Context context, String name, SQLiteDatabase.CursorFactory factory,
                         int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    //  This it the creator and override the main functions

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO: Here we implement the source code of the main example
        String CREATE_TABLE = "CREATE TABLE" + TABLE_NAME + "(" + COLUMN_ID +
                "INTEGER PRIMARYKEY, " + COLUMN_NAME + "TEXT)";
        db.execSQL(CREATE_TABLE);
    }
    // Here we use the same subroutine as we can see in the main example as we can see in the next lines of the code

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //TODO: Here we use the source code as the layer form
    }

    public String load_handler() {
        // todo: Insert all the source code as we can see in the main example /
        // Here we use a translator of a SQL idiomatic to a class model
        String result = " "; // This is just as a void structure of the main example
        String query = "SELECT * FROM" + TABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        while (cursor.moveToNext()){
            int result_0 = cursor.getInt(0);
            String result_1 = cursor.getString(1);
            result = String.valueOf(result_0) + " " + result_1 +
                    System.getProperty("line Separator");
        }
        cursor.close();
        db.close();
        return result;

    }
    public void add_handler(){} // todo implement the person class, that is the in to do the part of the functions

    public boolean delete_handler(int ID) {
        boolean result = false;
        String query = "SELECT * FROM " + TABLE_NAME + "WHERE" + COLUMN_ID + " = " +
                String.valueOf(ID) + "' ";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        // Here we declare the Person class to obtain the main example as we can see in the next lines of the code
        // todo: declare the person class in a new java class
        cursor.close();
        result = true;
        return result;
    }

    public boolean update_Handler(int ID, String name){
        SQLiteDatabase db  = this.getWritableDatabase();
        ContentValues args = new ContentValues();
        args.put(COLUMN_ID, ID);
        args.put(COLUMN_NAME, name);
        return db.update(TABLE_NAME, args, COLUMN_ID + "= " + ID, null) > 0;
    }
    public void load_students(View view){

    }
}