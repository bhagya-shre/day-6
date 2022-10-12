package com.infinite.Inventory;

public class Stock {
private String stockid;
private String itemName;
private double price;
private int qualityAvail;
@Override
public String toString() {
	return "Stock [stockid=" + stockid + ", itemName=" + itemName + ", price=" + price + ", qualityAvail="
			+ qualityAvail + "]";
}
public Stock(String stockid, String itemName, double price, int qualityAvail) {
	super();
	this.stockid = stockid;
	this.itemName = itemName;
	this.price = price;
	this.qualityAvail = qualityAvail;
}
public Stock() {
	super();
	
}
public String getStockid() {
	return stockid;
}
public void setStockid(String stockid) {
	this.stockid = stockid;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQualityAvail() {
	return qualityAvail;
}
public void setQualityAvail(int qualityAvail) {
	this.qualityAvail = qualityAvail;
}


}
