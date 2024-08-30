/*
 * This is my cube class, basically my code calculates 
 * the side length, the surface area and the volume of a cube. 
 */
public class Intro_Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) Declare a side length as an int 
		double side = 5;
		// 2) Calculate its surface area 
		double square = side*side; 
		double area = square*6; 
		// 3) Calculate its volume
		double volume = side*side*side; 
		// 3) Print its values as doubles - in a sentance 
		System.out.println("The side length is " + (int)side + ".");
		System.out.println("The surface area of the cube is " + (int)area + ".");
		System.out.println("The volume of the square is " + (int)volume + ".");
		
