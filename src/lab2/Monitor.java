package lab2;

public class Monitor extends CallCenterEquipment{
	
	private double diagonal;
	private String display_extention;
	
	public Monitor(int price, String type, String mark ,double diagonal, String display_extention ) {
		super (price, type, mark);
		this.diagonal = diagonal;
		this. display_extention = display_extention;
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	public String getDisplay_extention() {
		return display_extention;
	}

	public void setDisplay_extention(String display_extention) {
		this.display_extention = display_extention;
	}

	@Override
	public String toString() {
		return "Monitor [Diagonal=" + getDiagonal() + ",Display_extention =" + getDisplay_extention()
				+ ", Price()=" + getPrice() + ", Type()=" + getType() + ", Mark()=" + getMark() + "]";
	}


	
	
}

