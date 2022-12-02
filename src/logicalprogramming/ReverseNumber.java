package com.logicalprogramming;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rev = 0;
        System.out.println("Enter the number :: \n");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for( ;num != 0; num=num/10)
        {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + rev);

    }
}
