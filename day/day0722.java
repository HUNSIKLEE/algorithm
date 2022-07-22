package com.eomcs.lang.ex01;
import java.util.Scanner;


class day0722 {
	public static void main(String[] args) {		


		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();

		input.close();

		String str = (a>b) ? ">" : ((a<b) ? "<":"==");
		System.out.println(str);
	}
}

