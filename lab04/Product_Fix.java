package lab04;

public class Product_Fix {
	private String name;
	private double price;
	private double tax;

	public Product_Fix(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public Product_Fix() {

	}

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

	// Trả về đối tượng
	public Product_Fix nhapThongTin(String name, double price, double tax) {
		Product_Fix pr = new Product_Fix(name, price, tax);
		return pr;
	}

	public void xuatThongTin(Product_Fix pr) {
		System.out.println("Name: " + pr.getName() + " Price: " + pr.getPrice() + " Tax: " + pr.getTax());
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}
}
