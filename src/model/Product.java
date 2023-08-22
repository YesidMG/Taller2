package model;

public class Product {
	
	private String nameProduct;
	private int priceUnite;
	private int amount;
	private int totalprice;
	
	public Product(String nameProduct, int priceUnite, int amount) {
		this.nameProduct = nameProduct;
		this.priceUnite = priceUnite;
		this.amount = amount;
		this.totalprice = this.priceUnite*this.amount;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getPriceUnite() {
		return priceUnite;
	}

	public void setPriceUnite(int priceUnite) {
		this.priceUnite = priceUnite;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	
	

}
