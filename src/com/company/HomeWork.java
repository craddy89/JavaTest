package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your number: ");

        int number1 = Integer.parseInt(bufferedReader.readLine());

        checkInterval(number1);

    }
    public static void checkInterval(int a) {
        if (a >= 20 && a <= 50) {
            System.out.println("Число " + a + " содержится в интервале.");
        } else {
            System.out.println("Число " + a + " не содержится в интервале.");
        }
    }
}
