package lab2;

public class Computer extends CallCenterEquipment {
    
	private String motherboard;
	private String videocard;
	
	public String getMotherboard() {
		return motherboard;
	}



	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}



	public String getVideocard() {
		return videocard;
	}



	public void setVideocard(String videocard) {
		this.videocard = videocard;
	}



	public Computer(int price, String type, String mark ,String motherboard, String videocard ) {
		super (price, type, mark);
		this.motherboard = motherboard;
		this.videocard = videocard;
	}
	
	

	@Override
	public String toString() {
		return "Computer [ Motherboard =" + getMotherboard() + ", Videocard=" + 
				getVideocard() + ", Price =" + getPrice()
				+ ", Type =" + getType() + ", Mark =" + getMark() + "]";
	}

	
	
	   
	
	
	
}
