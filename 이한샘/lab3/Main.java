package bibimbap;

import java.util.Scanner;

public class Main {

	// Scanner ���� �� ����
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// �ڽ��� �̸� ���
		System.out.println("���ѻ�");

		// �ڽ��� �й� ���
		System.out.println("202211351");

		// A�� B�� �޾� A@B ���� ����� ����ϴ� ���α׷� �ۼ�
		// A@B = (A+B)*(A-B)
		System.out.print("A���� �Է��Ͻÿ� : ");
		int a = scan.nextInt();
		System.out.print("B���� �Է��Ͻÿ� : ");
		int b = scan.nextInt();
		System.out.println((a + b) * (a - b));

		// �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ�.
		System.out.print("A���� �Է��Ͻÿ� : ");
		a = scan.nextInt();
		System.out.print("B���� �Է��Ͻÿ� : ");
		b = scan.nextInt();
		System.out.print("C���� �Է��Ͻÿ� : ");
		int c = scan.nextInt();

		int res1 = (a + b) % c;
		int res2 = ((a % c) + (b % c)) % c;

		// (A+B)%C�� ((A%C) + (B%C))%C �� ������?
		String text = "(A+B)%C�� ((A%C) + (B%C))%C �� ";
		if (res1 == res2) {
			System.out.println(text + "����");
		} else {
			System.out.println(text + "�ٸ���");

		}

		// (A��B)%C�� ((A%C) �� (B%C))%C �� ������?
		int res3 = (a * b) % c;
		int res4 = ((a % c) * (b % c)) % c;
		text = "(A��B)%C�� ((A%C) �� (B%C))%C �� ";
		if (res3 == res4) {
			System.out.println(text + "����");
		} else {
			System.out.println(text + "�ٸ���");
			
		}
	}

}
