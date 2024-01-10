package org.example;

import com.google.gson.Gson;

public class Demo {
    public static void main(String[] args) {
        Gson gson=new Gson();
        Person person=new Person("Megala",22,"Bangalore");

        String jsondata=gson.toJson(person);
        System.out.println(jsondata);


        Person obj = gson.fromJson(jsondata, Person.class);


        System.out.println("Object " + obj);
        // new pull request
    }

}
