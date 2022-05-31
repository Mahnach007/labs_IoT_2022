package write;

import java.io.*;
import java.util.ArrayList;

import manager.CallCenterManager;
import models.CallCenterEquipment;

public class CallCenterEquipmentWriter extends CallCenterManager {

	public  void WriteToFile(ArrayList<CallCenterEquipment> items ) throws IOException{
	

		FileWriter writer = new FileWriter("CallCenterEquipmentWriter.csv");
		
		PrintWriter out = new PrintWriter(writer);
		
		for(CallCenterEquipment p : items) {
			out.printf(p.getHeaders());
			out.println();
			out.printf(p.toCSV());
			out.println();
		}
			out.close();
	
		}


}
