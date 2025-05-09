package com.plurasight;

import java.util.HashMap;

public class HashMapPracticeApp {
    public static void main(String[] args) {
        HashMap<String, String> statesAndCapitols = new HashMap<>();
        statesAndCapitols.put("CT", "Hartford");
        statesAndCapitols.put("CA", "Sacramento");
        statesAndCapitols.put("WA", "Olympia");
        statesAndCapitols.put("TX", "Austin");
        statesAndCapitols.put("FL", "Tallahassee");

        System.out.println(statesAndCapitols);

        System.out.println("The capital of texas is: ");
        System.out.println(statesAndCapitols.get("TX"));

        statesAndCapitols.remove("WA");

        System.out.println(statesAndCapitols);

        System.out.println("=============================");

        for (String value : statesAndCapitols.keySet()) {
            System.out.println(value);
        }

        System.out.println("=============================");

        for (String key : statesAndCapitols.keySet()) {
            System.out.println(key + ": " + statesAndCapitols.get(key));
        }
    }

}
