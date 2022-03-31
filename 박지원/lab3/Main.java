package bibimbap.study.parkjiwon;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("박지원");
        System.out.println("202211305");

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a + b) * (a - b));

        int c = sc.nextInt();
        int f1 = (a + b) % c;
        int f2 = ((a % c) + (b % c)) % c;
        System.out.println("(A+B)%C 는 ((A%C) + (B%C))%C 와 같다: " + (f1 == f2));

        int f3 = (a * b) % c;
        int f4 = ((a % c) * (b % c)) % c;
        System.out.println("(AxB)%C 는 ((A%C) x (B%C))%C 와 같다: " + (f1 == f2));
    }
}
