package lab04;

public class Video30 {
	public static void main(String[] args) {
		Product_Fix p1 = new Product_Fix();
		p1 = p1.nhapThongTin("RAM", 10, 0.02);
		p1.xuatThongTin(p1);
		System.out.println("Tax: " + p1.getTaxPrice(p1.getPrice(), p1.getTax()));
//		Product_Fix p2 = new Product_Fix("computer", 20, 0.05);

		Product_Fix test = new Product_Fix();
		Product_Fix p3 = test.nhapThongTin("CD", 20, 0.01);// gián tiếp
		test.xuatThongTin(p3);
		System.out.println("Tax: " + test.getTaxPrice(p3.getPrice(), p3.getTax()));

	}
}
