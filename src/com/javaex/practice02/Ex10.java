package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {

	//두개의 숫자를 입력받아 큰수와 작은수를 분류하여 출력하세요
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		int a=sc.nextInt();
		System.out.print("숫자2: ");
		int b=sc.nextInt();
		
		if (a>b) {
			System.out.println("큰수 :"+a+"     작은수:"+b);
		}else if(a<b) {
			System.out.println("큰수 :"+b+"     작은수:"+a);
		}else {
			System.out.println("같은수입니다");
		}
		sc.close();
		
	}
}
