package com.bitcamp.al;


public class al01 {
    public static void main(String[] args) {



      System.out.println("점수를 입력해주세요.");
      java.util.Scanner sorce = new java.util.Scanner(System.in);
        int i = sorce.nextInt();
        sorce.nextLine();

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

