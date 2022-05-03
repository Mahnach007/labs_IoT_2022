package lab2;

public class Phone extends CallCenterEquipment {

	private int memory;
	private String model;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Phone(int price, String type, String mark, int memory, String model) {
		super(price, type, mark);
		this.memory = memory;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Phone [ Memory =" + getMemory() + ",  Model=" + getModel() + ", Price =" + getPrice() + ", Type ="
				+ getType() + ", Mark=" + getMark() + "]";
	}

}
