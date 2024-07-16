package lab02;

import java.util.Scanner;

public class bai4 {
	public static void bai01() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập b = ");
		int b = scanner.nextInt();
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0\n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm.");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm.");
		} else {
			float x = (float) (-b) / a; // cast data
			System.out.printf("Nghiệm của phương trình x = %.3f", x);
		}
		scanner.close();
	}

	public static void bai02() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập b = ");
		int b = scanner.nextInt();
		System.out.print("Nhập c = ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0\n", a, b, c);
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phương trình có vô số nghiệm.");
			} else if (b == 0) {
				System.out.println("Phương trình vô nghiệm.");
			} else {
				float xx = (float) (-c) / b;
				System.out.printf("Nghiệm của phương trình x = %.3f", xx);
			}
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm.");
			} else if (delta == 0) {
				float xk = (float) (-b) / (2 * a);
				System.out.printf("Phương trình có nghiệm kép x = %.3f", xk);
			} else {
				System.out.println("Phương trình có 2 nghiệm phân biệt: ");
				float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
				System.out.printf("x1 = %.3f", x1);

				float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("\nx2 = %.3f", x2);
			}
		}
		scanner.close();

	}

	public static void bai03() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện: ");
		int sodien = scanner.nextInt();
		int price = 0;
		if (sodien < 101) {
			price = sodien * 1000;
		} else {
			price = 100 * 1000 + (sodien - 100) * 1500;
		}
		System.out.println("Số tiền = " + price);
		scanner.close();

	}

	public static void main(String[] args) {
		// Bài 4
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất     |");
		System.out.println("| 2. Giải phương trình bậc hai      |");
		System.out.println("| 3. Tính số tiền điện              |");
		System.out.println("| 4. Kết thúc                       |");
		System.out.println("++ ------------------------------- ++");
		System.out.print("Mời lựa chọn: ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Bạn đã lựa chọn tính năng 1.");
			bai01();
			break;
		case 2:
			System.out.println("Bạn đã lựa chọn tính năng 2.");
			bai02();
			break;
		case 3:
			System.out.println("Bạn đã lựa chọn tính năng 3.");
			bai03();
			break;
		default:
			System.out.println("Thoát chương trình.");
			System.exit(0);
		}

		scanner.close();

	}
}
