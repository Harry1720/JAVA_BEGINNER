package lab03;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		System.out.println("Nhập một số nguyên: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.printf("%d không là số nguyên tố.", a);
				break;
			}
		}
		System.out.printf("%d là số nguyên tố.", a);
		scanner.close();
	}
}
