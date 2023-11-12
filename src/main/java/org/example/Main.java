package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonFinally = gson.toJson(new User("Vladymyr", "Cherednichenko"));
        System.out.println("jsonFinally = " + jsonFinally);


    }

    static class User{
        String name;
        String firstName;
        User(String name, String firstName){
            this.name = name;
            this.firstName = firstName;
        }
    }
}