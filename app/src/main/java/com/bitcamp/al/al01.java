package com.bitcamp.al;

import java.util.Scanner;

public class al01 {
    public static void main(String[] args) {

        Scanner sorce = new Scanner(System.in);
        int i = sorce.nextInt();
        sorce.close();

        if (i <= 100 && i >= 90) {
            System.out.println("A");
        } else if (i <= 89 && i >= 80) {
            System.out.println("B");
        } else if (i <= 79 && i >= 70) {
            System.out.println("C");
        } else if (i <= 69 && i >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}

