package bibimbap;

import java.util.Scanner;

public class Main {

	// Scanner 선언 및 생성
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// 자신의 이름 출력
		System.out.println("이한샘");

		// 자신의 학번 출력
		System.out.println("202211351");

		// A와 B를 받아 A@B 연산 결과를 출력하는 프로그램 작성
		// A@B = (A+B)*(A-B)
		System.out.print("A값을 입력하시오 : ");
		int a = scan.nextInt();
		System.out.print("B값을 입력하시오 : ");
		int b = scan.nextInt();
		System.out.println((a + b) * (a - b));

		// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성.
		System.out.print("A값을 입력하시오 : ");
		a = scan.nextInt();
		System.out.print("B값을 입력하시오 : ");
		b = scan.nextInt();
		System.out.print("C값을 입력하시오 : ");
		int c = scan.nextInt();

		int res1 = (a + b) % c;
		int res2 = ((a % c) + (b % c)) % c;

		// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		String text = "(A+B)%C는 ((A%C) + (B%C))%C 와 ";
		if (res1 == res2) {
			System.out.println(text + "같다");
		} else {
			System.out.println(text + "다르다");

		}

		// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		int res3 = (a * b) % c;
		int res4 = ((a % c) * (b % c)) % c;
		text = "(A×B)%C는 ((A%C) × (B%C))%C 와 ";
		if (res3 == res4) {
			System.out.println(text + "같다");
		} else {
			System.out.println(text + "다르다");
			
		}
	}

}
