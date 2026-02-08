package org.example;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args) {
        Map<String, String> person = new HashMap<>();

        person.put("name:", "John");
        person.put("LastName:", "Smith");

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
