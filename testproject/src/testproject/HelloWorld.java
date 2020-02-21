package testproject;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.out.println("Hello World");
	
	String[] names = {"Alpha","Beta", "Gamma"};

	for (String test: names) System.out.println(test);
	
	// methodenaufruf
	
	System.out.println(myFirstMethode(20,30));
	
	
	// Jetzt benutzen wir die neue Klasse Car
	
	Car car1 = new Car("Grün","BMW",160); // instantiierung der neuen Klasse
	
	
	//car1.setColor("Rot");
	
	System.out.println(car1.getColor());
	
	car1.drive();
	
	
	
	

	}
	
	public static int myFirstMethode(int number1, int number2) {
	
		
		
		
		int result = number1+number2;
		return result;
		
		
	}

}
