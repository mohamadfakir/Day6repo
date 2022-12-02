package com.logicalprogramming;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer you want to check:");
        n = sc.nextInt();
        for (int i = 2; i <= n / 2; ++i) {
            // condition for nonprime number
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }

    }

}
