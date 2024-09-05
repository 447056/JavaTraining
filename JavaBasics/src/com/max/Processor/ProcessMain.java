package com.max.Processor;

public class ProcessMain {
	
	public static void main(String[] args) {
		
		Processor processor = new Processor();
		processor.calculate(12.5);
		processor.calculate(13, 3);
		processor.calculate(12);
		processor.calculate(12.5, 12);
		processor.calculate(14.0, 13.0);
		
	}

}
