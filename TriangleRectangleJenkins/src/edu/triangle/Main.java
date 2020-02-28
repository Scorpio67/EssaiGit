package edu.triangle;

import edu.rectangle.Rectangle;

public class Main {

	public static void main(String[] args) {

		Triangle t1 = new Triangle(3, 4, 5);
		System.out.println("Triangle t1 is " + t1.getType());
		
		Triangle t2 = new Triangle(0, 0, 0);
		System.out.println("Triangle t2 is " + t2.getType());
		
		Triangle t3 = new Triangle(2, 3, 7);
		System.out.println("Triangle t3 is " + t3.getType());
		
		Rectangle r1 = new Rectangle(3, 4, 5, 6);
		System.out.println("Rectangle r1 is " + r1.getType());
		
		Rectangle r2 = new Rectangle(5, 7, 5, 9);
		System.out.println("Rectangle r1 is " + r2.getType());
		
		Rectangle r3 = new Rectangle(9, 9, 9, 9);
		System.out.println("Rectangle r1 is " + r3.getType());
		
		Rectangle r4 = new Rectangle(0, 0, 0, 0);
		System.out.println("Rectangle r1 is " + r4.getType());

	}
	
	

}
