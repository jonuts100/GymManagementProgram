package main;

public class Product {
	private String name;
	private Double price;
	private Integer qty;
	
	public Product(String name,Double price,Integer qty) {
		// TODO Auto-generated constructor stub
		setName(name);
		setPrice(price);
		setQty(qty);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
}
