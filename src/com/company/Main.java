package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please inter an integer: ");
        int x=sc.nextInt();
        System.out.println(cantToMeter(x));

    }

    private static int cantToMeter(int x) {
        x= 100*x;
        return x;
    }
}
