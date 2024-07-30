package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử của mảng: ");
		int sl = scanner.nextInt();
		int[] a = new int[sl];
		for (int i = 0; i < sl; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Mảng sau khi xếp: " + Arrays.toString(a));
		System.out.println("Phần tử lớn nhất của mảng: " + a[sl - 1]);
		System.out.println("Phần tử nhỏ nhất của mảng: " + a[0]);

		// Cách 2:
//		int max = a[0]; //Không được đặt max = 0 do trong mảng có thể có mọi phần tử có giá trị > 0; tương tự với min.
//		for (int i = 1; i < a.length; i++) {
//			max = Math.max(a[i], max);
//		}
//		int min = a[0];
//		for (int i = 1; i < a.length; i++) {
//			max = Math.min(a[i], max);
//		}
//		System.out.println("Phần tử lớn nhất của mảng: " + max);
//		System.out.println("Phần tử nhỏ nhất của mảng: " + min);

		scanner.close();
	}

}
