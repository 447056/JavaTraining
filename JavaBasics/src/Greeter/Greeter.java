package Greeter;

public class Greeter {
	
	String name;
	
	public Greeter() {
		super();
		this.name = null;
	}

	public Greeter(String name) {
		super();
		this.name = name;
	}
	
	void greetUser(String... messages) {
		
		for (String message : messages) {
			System.out.println(" Message "+message+" "+name);
		}
		
	}
	
	void sayHello(String... names) {
		
		for (String name : names) {
			System.out.println("Welcome "+name);
		}
	}

}
