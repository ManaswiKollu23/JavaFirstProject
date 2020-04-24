package com.sapient.shapes;

public class Shapes {
	
	public static void main(String[] args) {
		
		Shapes shapes = new Shapes();
		int numberOfSides, sideLength;
		numberOfSides = 3;
		sideLength = 12;
		shapes.calculateShapeArea(numberOfSides, sideLength);
		
		numberOfSides = 4;
		sideLength = 15;
		shapes.calculateShapeArea(numberOfSides, sideLength);
		
		numberOfSides = 5;
		sideLength = 15;
		shapes.calculateShapeArea(numberOfSides, sideLength);
	}
	
	void calculateShapeArea(int noOfSides, int side) {
		if(noOfSides == 1) {
			Circle circle = new Circle();
			circle.calculateArea(side);
		} else if(noOfSides == 3) {
			Triangle triangle = new Triangle();
			triangle.calculateArea(side);
		} else if(noOfSides == 4) {
			Square square = new Square();
			square.calculateArea(side);
		} else {
			System.out.println("No Shapes Present");
		}
	}
}
