package lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Nhập một số thực: ");
			double x = scanner.nextDouble();
			list.add(x);
			scanner.nextLine();// Hứng phím Enter
			System.out.print("Input more? (N: exit, else: continue): ");
			String option = scanner.nextLine();

			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		scanner.close();
		System.out.println("Array: " + list.toString());
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.print("Sum = " + sum);
	}
}
