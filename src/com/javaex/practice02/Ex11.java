package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {

	//두 개의 정수를 입력받아 큰수를 작은수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int a=sc.nextInt();
		System.out.print("두번째 숫자: ");
		int b=sc.nextInt();
		
		if (a>b) {
			System.out.println("몫: "+ a/b );
			System.out.println("나머지: "+ a%b);
		}else if(a<b) {
			System.out.println("몫: "+ b/a );
			System.out.println("나머지: "+ b%a);
		}else {
			System.out.println("같은수입니다");
		}
		sc.close();
	}
}
