package lab04;

import java.util.Scanner;

public class Product {
	private String name;
	private double price;
	private double tax;
	Scanner s = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTaxPrice() {
		return getPrice() * getTax();
	}

	public void nhapThongTin() {

		System.out.print("Nhap ten san pham: ");
		String name = s.nextLine();
		setName(name);
		System.out.print("\nNhap gia san pham: ");
		double price = s.nextDouble();
		setPrice(price);
		System.out.print("\nNhap thue (so thap phan): ");
		double tax = s.nextDouble();
		setTax(tax);
	}

	public void xuatThongTin() {
		System.out.println("Ten san pham: " + getName());
		System.out.println("Gia san pham truoc thue: " + getPrice());
		System.out.println("Thue: " + getTax() * 100 + "%");
		System.out.println("Tien thue: " + getTaxPrice());
	}

}
