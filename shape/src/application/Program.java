package application;

import modal.entities.AbstractShape;
import modal.entities.Circle;
import modal.entities.Rectangle;
import modal.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		AbstractShape s1 = new Circle(Color.BRANCO, 2.0);
		AbstractShape s2 = new Rectangle(Color.AZUL, 3.0, 4.0);
		
		
		System.out.println("Circle Color: " + s1.getColor());
		System.out.println("Circle Area: " + String.format("%.2f", s1.area()));
		System.out.println("Rectangle Color: " + s2.getColor());
		System.out.println("Rectangle Area: " + String.format("%.2f", s2.area()));
	}

}
