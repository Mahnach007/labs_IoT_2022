package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class Main extends CallCenterEquipment {

	public Main(int price, String type, String mark) {
		super(price, type, mark);
	}

	public static void main(String[] agrs) throws Exception {

		Computer computer = new Computer(16, "Telifonia", "Sumsung", "MOS-1234", "Rtx 3090");
		Phone phone = new Phone(13, "Iphone", "Xiaomi", 13, "Rtx 3090");
		Monitor monitor = new Monitor(16, "Iphone", "Bpple", 27.7, "720x1080");
		Monitor monitor2 = new Monitor(13, "DX Racer", "Apple234", 27.7, "720x1080");
		CallCenterManager manager = new CallCenterManager();

		System.out.println(computer);
		System.out.println(phone);
		System.out.println(monitor);

		ArrayList<CallCenterEquipment> items = new ArrayList<>();

		items.add(computer);
		items.add(monitor2);
		items.add(monitor);
		items.add(phone);

		System.out.println(items);
		System.out.println("");
		manager.sortByMark(items);
		System.out.println(items);
		System.out.println("");
		Collections.reverse(items);
		System.out.print(items);
		System.out.println("");
		

		ArrayList<CallCenterEquipment> p = manager.findByPrice(16, items);
		System.out.println("");
		System.out.println(p);
		
		System.out.println("");
		ArrayList<CallCenterEquipment> p2 = manager.findByType("Iphone", items);
		System.out.println(p2);
	}

}