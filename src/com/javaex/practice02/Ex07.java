package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		
		int age = sc.nextInt();
		
		if (age<=7) {
			System.out.println("취학전아동/무료 입니다.");
		}else if(age<=13) {
			System.out.println("초등학생/2000원 입니다.");
		}else if(age<=16) {
			System.out.println("중학생/3000원 입니다.");
		}else if(age<=19) {
			System.out.println("고등학생/4000원 입니다.");
		}else {
			System.out.println("성인/5000원 입니다.");
		}
	
		sc.close();
	}
}
