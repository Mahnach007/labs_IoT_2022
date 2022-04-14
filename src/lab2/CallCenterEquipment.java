package lab2;

import java.util.ArrayList;




public class CallCenterEquipment implements Comparable<CallCenterEquipment> {




	private int price ;
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
	public int compareTo(CallCenterEquipment comparestu) { //сортує ціну
		int compareprice
        = ((CallCenterEquipment)comparestu).price;
		
		return this.price - compareprice;
	}
	
	
	
	public static void sortByMark(ArrayList<CallCenterEquipment> items)//сортує за типом
    {
  
        items.sort((o1, o2)-> o1.getMark().compareTo(o2.getMark()));
    }


	 
		
	 static CallCenterEquipment findByPrice(int id, ArrayList<CallCenterEquipment> items) throws Exception {
    	
	     for(CallCenterEquipment p : items ) {
	 
	        if(p.getPrice() == id)
	        	return p;
	        }
	     throw new Exception ("Id: " + id + " is not in the list");
	}
	 
	 static CallCenterEquipment findByType(String type, ArrayList<CallCenterEquipment> items) throws Exception {
	    	
	     for(CallCenterEquipment p2 : items ) {
	 
	        if(p2.getType() == type)
	        	return p2;
	        }
	     throw new Exception ("Id: " + type + " is not in the list");
	}
	
	
	
}









