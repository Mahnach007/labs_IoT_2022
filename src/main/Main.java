package main;

import java.util.ArrayList;

import manager.CallCenterManager;
import models.CallCenterEquipment;
import write.CallCenterEquipmentWriter;
import models.*;


public class Main{

	
	public static void main(String[] agrs) throws Exception {

		Computer computer = new Computer(100, "Telifonia", "Sumsung", "MOS-1234", "Rtx 3090");
		Phone phone = new Phone(30, "Calling", "Xiaomi", 64, "Iphone X");
		Monitor monitor = new Monitor(50, "Viewing", "Apple", 27.7, "720x1080");
		Monitor monitor1 = new Monitor(50, "Viewing", "Apple", 27.7, "720x1080");
		CallCenterManager manager = new CallCenterManager();
		CallCenterEquipmentWriter writer = new CallCenterEquipmentWriter();
		
		

		System.out.println(computer);
		System.out.println(phone);
		System.out.println(monitor);

		ArrayList<CallCenterEquipment> items = new ArrayList<>();
		
		items.add(computer);
		items.add(monitor);
		items.add(phone);		

		System.out.println(items);
		System.out.println("");
		manager.sortByMark(items);
		System.out.println(items);
		System.out.println("");
		manager.reversSortByMark(items);
		System.out.print(items);
		System.out.println("");
		

		ArrayList<CallCenterEquipment> p = manager.findByPrice(30, items);
		System.out.println("");
		System.out.println(p);
		
		System.out.println("");
		ArrayList<CallCenterEquipment> p2 = manager.findByType("Calling", items);
		System.out.println(p2);
	
		writer.WriteToFile(items);
	}

}