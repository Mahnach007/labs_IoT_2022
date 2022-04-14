package lab2;

public class main {
	
	

	public static void main (String[] agrs)  {
	     
	     Computer computer = new Computer(16, "Telifonia", "Sumsung", "MOS-1234", "Rtx 3090");
	     Phone phone = new Phone(13, "Iphone", "Xiaomi", 13, "Rtx 3090");
	     Monitor monitor = new Monitor(15, "DX Racer", "Apple", 27.7, "720x1080");
	     
	     System.out.println(computer);
	     System.out.println(phone);
	     System.out.println(monitor);
	    

	  }

	
}