package com.javaex.practice02;

import java.util.Scanner;

public class Ex16 {

	/*다음과 같이 정의되는 함수의 함수값을 계산해보자
	f(x)={█(x^3-9x+2 ,&x≤0  (x가 0보다 작거나 같으면 이식을 사용)@7x+2 ,&x>0  (x가 0보다 크면 이식을 사용))┤
	*/
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자: ");
		
		double a = sc.nextDouble();
		
		
		System.out.print("계산결과는 ");
		if	(a>0) {
			System.out.print(7*a+2);
		}else {
			System.out.print(a*a*a-(9*a)+2);
		}
		System.out.println("입니다");
		
		sc.close();
	}
}
