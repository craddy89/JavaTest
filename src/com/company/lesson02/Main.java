package com.company.lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int number = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        System.out.println(name + " будет получать " + number + " через " + number2 + " лет.");


    }

    public static int sum(int a, int b) {
        return a + b;
    }

}
