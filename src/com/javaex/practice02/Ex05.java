package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		
		
		/*
		보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요
		*/
		int age; //나이
		
		Scanner sc = new Scanner(System.in);
		
		//나이를 입력받는다
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		//그룹을 분류한다
		if (age>20) {
			System.out.print("\"1번그룹\"");
		}else {//20살 이하라면
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다");
		
		/*
		(1)	15일 때 결과  //'2번그룹'
		(2)	19일 때 결과  //'2번그룹'
		(3)	20일 때 결과  //'2번그룹'
		(4)	21일 때 결과  //'1번그룹'
		(5)	100일 때 결과  //'1번그룹'

		
		*/
		
		sc.close();
	}
}
