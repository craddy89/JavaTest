package com.company.lesson01;

public class Main {

    public static void main(String[] args) {
        System.out.println(convert(13));
        System.out.println(percent(23));
        print("Mother");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int convert(int countEuro) {
        return (int) (countEuro * 0.93);
    }

    public static int percent(int numberPercent) {
        return numberPercent + numberPercent % 10;
    }

    public static void print(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

}
