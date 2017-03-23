package Chapter8.day17.homework;

public class Product {
	private String name;
	private String id;
	private double price;
	private int number;
	
	public Product() {
		super();
	}

	public Product(String name, String id, double price, int number) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.number = number;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass() != Product.class){
			return false;
		}
		return super.equals(obj);
	}
}
