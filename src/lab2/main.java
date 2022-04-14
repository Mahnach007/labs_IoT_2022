package lab2;

import java.util.ArrayList;
import java.util.Collections;




public class main extends CallCenterEquipment {
	
	public main(int price, String type, String mark) {
		super(price, type, mark);
	}

	public static void main (String[] agrs) throws Exception {
	     
	     Computer computer = new Computer(16, "Telifonia", "Sumsung", "MOS-1234", "Rtx 3090");
	     Phone phone = new Phone(13, "Iphone", "Xiaomi", 13, "Rtx 3090");
	     Monitor monitor = new Monitor(15, "DX Racer", "Apple", 27.7, "720x1080");
	     
	     System.out.println(computer);
	     System.out.println(phone);
	     System.out.println(monitor);
	    
	     ArrayList<CallCenterEquipment> items = new ArrayList<CallCenterEquipment>();
	     
	     

		 
	     items.add(computer);
	     items.add(phone);
	     items.add(monitor);
	     System.out.println(items);
	     System.out.println("");
	     sortByMark(items);
	     System.out.println(items);
	     System.out.println("");
	     Collections.reverse(items);
	     System.out.print(items);
	     
	     

	    
		CallCenterEquipment p = findByPrice(13, items);
		System.out.println("");
		System.out.println(p.getMark());
		CallCenterEquipment p2 = findByType("Iphone", items);
		System.out.println("");
		System.out.println(p2.getMark());

	  }

	
}