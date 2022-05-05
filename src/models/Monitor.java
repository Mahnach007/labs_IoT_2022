package models;

public class Monitor extends CallCenterEquipment {

	private double diagonal;
	private String displayExtention;

	public Monitor(int price, String type, String mark, double diagonal, String display_extention) {
		super(price, type, mark);
		this.diagonal = diagonal;
		this.displayExtention = display_extention;
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

	public void setDisplay_extention(String display_extention) {
		this.displayExtention = display_extention;
	}

	@Override
	public String toString() {
		return "Monitor [Diagonal=" + getDiagonal() + ",Display_extention =" + getDisplay_extention() + ", Price()="
				+ getPrice() + ", Type()=" + getType() + ", Mark()=" + getMark() + "]";
	}

}
