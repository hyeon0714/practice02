package com.javaex.practice02;

import java.util.Scanner;

public class Ex15 {

	/*
	 아래와 같은 계산기 프로그램을 작성하세요.
	 
		기호, 숫자1, 숫자2 순서로 입력받습니다.
		기호는 ( +  -  *  /  ) 4가지 입니다.
		입력된 내용으로 계산하여 결과값을 출력합니다.
		나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.
	*/
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		
		System.out.print("기호:");
		String a=sc.next();
		System.out.print("숫자1:");
		double b=sc.nextDouble();
		System.out.print("숫자2:");
		double c=sc.nextDouble();
		
		
		
		
		if (a.equals("+")) {
			System.out.println("결과는: "+(b+c));
		}else if(a.equals("-")) {
			System.out.println("결과는: "+(b-c));
		}else if(a.equals("*")) {
			System.out.println("결과는: "+(b*c));	
		}else if(a.equals("/")) {
			if(c==0) {
				System.out.println("계산할수 없습니다");
			}else{
				System.out.println("결과는: "+(b/c));
			}
		}
		sc.close();

		// .equals("") 잘 확인하자
	} 
}
