package models;

public class Monitor extends CallCenterEquipment {

	private double diagonal;
	private String displayExtention;

	public Monitor(int price, String type, String mark, double diagonal, String displayExtention) {
		super(price, type, mark);
		this.diagonal = diagonal;
		this.displayExtention = displayExtention;
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	public String getDisplay_extention() {
		return displayExtention;
	}

	public void setDisplay_extention(String displayExtention) {
		this.displayExtention = displayExtention;
	}

	@Override
	public String toString() {
		return "Monitor [Diagonal=" + getDiagonal() + ",Display_extention =" + getDisplay_extention() + ", Price()="
				+ getPrice() + ", Type()=" + getType() + ", Mark()=" + getMark() + "]";
	}
	
	@Override
	public String getHeaders() {
		return  super.getHeaders()+ "," + "diagonal, displayExtention";
		
	}
	@Override
	public String toCSV() {
		return super.toCSV()+ " , " + diagonal + " , " + displayExtention ;
		
	}

}
