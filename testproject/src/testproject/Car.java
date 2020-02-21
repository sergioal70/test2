package testproject;

public class Car {

	// Attribute
	
	
	
	private String color;
	
	private String brand;
	
	private int horsePower;
	
	
	// Constructor, gibt es automatisch oder man kann einen bauen
	
	public Car(String color, String brand, int horsePower) {
		
		this.color = color;
		this.brand = brand;
		this.horsePower = horsePower;
		
	}
	
	
	
	// Methoden
	
	public void drive () {
		
      System.out.println("Das Auto fährt jetzt");
	
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getHorsePower() {
		return horsePower;
	}



	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
}
