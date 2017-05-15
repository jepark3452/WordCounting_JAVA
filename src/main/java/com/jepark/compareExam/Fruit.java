package com.jepark.compareExam;

public class Fruit implements Comparable{
	
	private String name;
	private int price;
	
	/**
	 * @param name
	 * @param price
	 */
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}

	public int compareTo(Object compareFurit) {
		int comparePrice = ((Fruit) compareFurit).getPrice();
		
		// asending order
		// return this.price - comparePrice;
		
		// desending order
		return comparePrice - this.price;
	}
}
