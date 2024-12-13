package main;
public class Packages {
	private String name;
	private Double pricing;
	private Integer duration; //in months
	
	public Packages(String name, Double pricing, Integer duration) {
		// TODO Auto-generated constructor stub
		setName(name);
		setPricing(pricing);
		setDuration(duration);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPricing() {
		return pricing;
	}

	public void setPricing(Double pricing) {
		this.pricing = pricing;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	

}
