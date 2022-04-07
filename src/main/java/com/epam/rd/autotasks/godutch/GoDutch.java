package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scan = new Scanner(System.in);
        int totalBill = scan.nextInt();
        if (totalBill < 0){
            System.out.println("Bill total amount cannot be negative");
            return;
        }
        int numberOfFriends = scan.nextInt();
        if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }
        System.out.println((int) (totalBill * 1.1) / numberOfFriends);
    }
}
