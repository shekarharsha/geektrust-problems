package com.shekar.tameofthrones;

import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {

        Problem1 problem1 = new Problem1();
        problem1.solve(args);
    }

    public void solve(String[] args) {

        checkOutput();

        solution(args);

        checkOutput();

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
