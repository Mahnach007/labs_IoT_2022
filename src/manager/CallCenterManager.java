package manager;

import java.util.ArrayList;
import models.*;

public class CallCenterManager{
	

	public ArrayList<CallCenterEquipment> items = new ArrayList<>();
	
	
	
	public void sortByMark(ArrayList<CallCenterEquipment> items)// сортує за типом від меншого до більшого
	{

		items.sort((o1, o2) -> o1.getMark().compareTo(o2.getMark()));
	}
	
	public void reversSortByMark(ArrayList<CallCenterEquipment> items)// сортує за типом від більшого до меншого
	{

		items.sort((o1, o2) -> o2.getMark().compareTo(o1.getMark()));
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
  
  public boolean addname( CallCenterEquipment newCallCenterEquipment ) {
      items.add( newCallCenterEquipment );
     return true;
   }
}
