package lab2;

import java.util.ArrayList;

public class CallCenterManager {

	public void sortByMark(ArrayList<CallCenterEquipment> items)// сортує за типом
	{

		items.sort((o1, o2) -> o1.getMark().compareTo(o2.getMark()));
	}

	
  public ArrayList<CallCenterEquipment>  findByPrice(int price, ArrayList<CallCenterEquipment> items) throws Exception{
	 ArrayList<CallCenterEquipment> newItems = new ArrayList<>();
		for (CallCenterEquipment p : items) {
			
			if (p.getPrice() == price) {
				newItems.add(p);
			
			}
		}
		return newItems;
}

	public ArrayList<CallCenterEquipment> findByType(String type, ArrayList<CallCenterEquipment> items) throws Exception {
		
		ArrayList<CallCenterEquipment> newItems = new ArrayList<>();
		for (CallCenterEquipment p2 : items) {

			if (p2.getType() == type) {
				newItems.add(p2);
				}

		}
		return newItems;
	}
}
