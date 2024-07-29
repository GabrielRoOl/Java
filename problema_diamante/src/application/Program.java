package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScann;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcretePrinter p = new ConcretePrinter("1090");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		ConcreteScann s = new ConcreteScann("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("20890");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result : " + c.scan());
	}

}
