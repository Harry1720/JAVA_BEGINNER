package lab04;

public class Program {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.nhapThongTin();
		System.out.println("==============");
		p1.xuatThongTin();

		System.out.println("========================");

		Product p2 = new Product();
		p2.nhapThongTin();
		System.out.println("==============");
		p2.xuatThongTin();

		p2.s.close();

	}
}
