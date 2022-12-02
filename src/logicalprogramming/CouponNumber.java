package com.logicalprogramming;

    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

    public class CouponNumber {
        
        public static void main(String[] args) throws NumberFormatException, IOException {
            int choice = 0;
            do {
                CouponNumber cn = new CouponNumber();
                Scanner sc = new Scanner(System.in);
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Let's play with coupons");
                System.out.println("Enter the no of coupons you want to generate");
                int n = Integer.parseInt(br.readLine());
                cn.Coupons(n);
                System.out.println("press 1 for continue");
                choice = sc.nextInt();

            } while (choice == 1);
        }
        public static void Coupons(int n)
        {
            Random random = new Random();
            int randomCounter = 0;
            int couponCount = 0;
            int coupon = 0;
            HashSet<Integer> coupons = new HashSet<>();
            while(couponCount <n)
            {
                coupon = random.nextInt(1001);
                if(!(coupons.contains(coupon)))
                {
                    coupons.add(coupon);
                    couponCount++;
                }

                randomCounter++;

            }

            display(coupons, randomCounter);
        }
        public static void display(HashSet<Integer> coupons, int randomCounter)
        {
            for (Integer coupon : coupons)
            {
                System.out.print(coupon+ " ");
            }
            System.out.println("Total no of random nos needed to generate the coupons were "+randomCounter);
        }
}
