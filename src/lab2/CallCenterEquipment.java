package lab2;

import java.util.ArrayList;
import java.util.Comparator;


public class CallCenterEquipment implements Comparable<CallCenterEquipment> {

	private int price;
	private String type;
	private String mark;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public CallCenterEquipment(int price, String type, String mark) {

		this.price = price;
		this.type = type;
		this.mark = mark;
	}
	
	

	@Override
	public String toString() {
		return "CallCenterEquipment [price=" + price + ", type=" + type + ", mark=" + mark + "]";
	} 

	@Override
	public int compareTo(CallCenterEquipment comparestu) { // сортує ціну
		int compareprice = ((CallCenterEquipment) comparestu).price;

		return this.price - compareprice;
	}
	
	
	
}