package com.shekar.tameofthrones;

import java.util.Arrays;
import java.util.HashMap;

public class Problem1 {

    private HashMap<String, String> kingdomEmblem;

    private HashMap<String, HashMap<Character, Integer>> kingdomEmblemCharCounts;

    public static void main(String[] args) {

        Problem1 problem1 = new Problem1();
        problem1.solve(args);
    }

    public void solve(String[] args) {

        checkOutput();

        solution(args);

        checkOutput();

    }

    public void setupInput() {
        kingdomEmblem = new HashMap<>();
        kingdomEmblem.put("LAND", "panda");
    }

    public void solution(String[] input) {

        String test = "HarshaShekara";

        String[] as = test.split("a");

        System.out.println(test.lastIndexOf("a"));
        System.out.println(test.length());

        Arrays.stream(as).forEach(System.out::println);


    }

    private void checkOutput() {

        System.out.println("Who is the ruler of Southeros?");

        System.out.println("Allies of Ruler?");

    }

}
