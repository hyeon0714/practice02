package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요");
		System.out.print("키: ");
		int a = sc.nextInt();
		System.out.print("몸무게: ");
		int b = sc.nextInt();
		
		if ((a-100)*0.9 > b) {
			System.out.println("저체중입니다");
			System.out.println("표준체중:" + ((a-100)*0.9));
		}else if ((a-100)*0.9==b) {
			System.out.println("표준입니다");
			System.out.println("표준체중:" + ((a-100)*0.9));
		}else {
			System.out.println("과제중입니다");
			System.out.println("표준체중:" + ((a-100)*0.9));
		}
			
		sc.close();
		
	}
}
