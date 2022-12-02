package com.logicalprogramming;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the nth no of Fibonacci Series required : \n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci series is printed below.");
        for (int i = 0; i < n; i++)
        {
            a = b + c;
            System.out.print(a+" ");
            c = b;
            b = a;
        }
    }
}
