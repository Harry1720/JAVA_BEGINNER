package lab03;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		System.out.println("Nhập một số nguyên: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", a, i, a * i);
		}
		scanner.close();
	}
}
