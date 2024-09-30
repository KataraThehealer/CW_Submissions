public class Shapes_Main 
{

	public static void main(String[] args)
	
	{
		//My Circles: 
		//This is creating a new circle called circOne, while calling my circle class 
		Circle circOne = new Circle(4.0);
		System.out.println(Circle.getShape());
		System.out.println("Circle 1: ");
		System.out.print("The radius of this circle is ");
		System.out.println(circOne.getRadius());
		System.out.print("The circumference of this circle is ");
		System.out.println(circOne.getCircumference());
		System.out.print("The diamater of this circle is ");
		System.out.println(circOne.getDiamater());
		System.out.print("The area of this circle is ");
		System.out.println(circOne.getArea());
		//Prints out a space to space out my outputs
		System.out.println(" ");
	
		//This is creating a new circle with a new radius called circTwo, while calling my circle class
		Circle circTwo = new Circle(2.0); 
		System.out.println("Circle 2: ");
		System.out.print("The radius of this circle is ");
		System.out.println(circTwo.getRadius());
		System.out.print("The circumference of this circle is ");
		System.out.println(circTwo.getCircumference());
		System.out.print("The diamater of this circle is ");
		System.out.println(circTwo.getDiamater());
		System.out.print("The area of this circle is ");
		System.out.println(circTwo.getArea());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//This is creating a new circle with a new radius called circThree, while calling my circle class
		Circle circThree = new Circle(24.0);
		System.out.println("Circle 3: ");
		System.out.print("The radius of this circle is ");
		System.out.println(circThree.getRadius());
		System.out.print("The circumference of this circle is ");
		System.out.println(circThree.getCircumference());
		System.out.print("The diamater of this circle is ");
		System.out.println(circThree.getDiamater());
		System.out.print("The area of this circle is ");
		System.out.println(circThree.getArea());
		System.out.println(circOne.toString());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		
		//My Squares: 
		//This is creating a new square called squaOne, while calling my Square class 
		Square squaOne = new Square(4.0);
		System.out.println(Square.getShape());
		System.out.println("Square 1: ");
		System.out.print("The circumference of this square is ");
		System.out.println(squaOne.getCircumference());
		System.out.print("The volume of this square is ");
		System.out.println(squaOne.getVolume());
		System.out.print("The area of this square is ");
		System.out.println(squaOne.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//This is creating a new square with a new side called squaTwo, while calling my Square class
		Square squaTwo = new Square(9.0);
		System.out.println("Square 2: ");
		System.out.print("The circumference of this square is ");
		System.out.println(squaTwo.getCircumference());
		System.out.print("The volume of this square is ");
		System.out.println(squaTwo.getVolume());
		System.out.print("The area of this square is ");
		System.out.println(squaTwo.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//This is creating a new square with a new side called squaThree, while calling my Square class
		Square squaThree = new Square(3.0);
		System.out.println("Square 3: ");
		System.out.print("The circumference of this square is ");
		System.out.println(squaThree.getCircumference());
		System.out.print("The volume of this square is ");
		System.out.println(squaThree.getVolume());
		System.out.print("The area of this square is ");
		System.out.println(squaThree.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//My Rectangles: 
		//This is creating a new rectangle called rectOne, while calling my Rectangle class
		Rectangle rectOne = new Rectangle(4.0,5.0);
		System.out.println(Rectangle.getShape());
		System.out.println("Rectangle 1: ");
		System.out.print("The circumference of this rectangle is ");
		System.out.println(rectOne.getCircumference());
		System.out.print("The perimeter of this rectangle is ");
		System.out.println(rectOne.getPerimiter());
		System.out.print("The area of this rectangle is ");
		System.out.println(rectOne.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//This is creating a new square with new sides called rectTwo, while calling my Rectangle class
		Rectangle rectTwo = new Rectangle(5.0,7.0);
		System.out.println("Rectangle 2: ");
		System.out.print("The circumference of this rectangle is ");
		System.out.println(rectTwo.getCircumference());
		System.out.print("The perimeter of this rectangle is ");
		System.out.println(rectTwo.getPerimiter());
		System.out.print("The area of this rectangle is ");
		System.out.println(rectTwo.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//This is creating a new square with new sides called rectThree, while calling my Rectangle class
		Rectangle rectThree = new Rectangle(11.0,13.0);
		System.out.println("Rectangle 2: ");
		System.out.print("The circumference of this rectangle is ");
		System.out.println(rectThree.getCircumference());
		System.out.print("The perimeter of this rectangle is ");
		System.out.println(rectThree.getPerimiter());
		System.out.print("The area of this rectangle is ");
		System.out.println(rectThree.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//My Spheres:
		//This is creating a new Sphere called spheOne, while calling my Sphere class
		Sphere spheOne = new Sphere(4.0);
		System.out.println(Sphere.getShape());
		System.out.println("Sphere 1: ");
		System.out.print("The diameter of this sphere is ");
		System.out.println(spheOne.getDiamater());
		System.out.print("The volume of this sphere is ");
		System.out.println(spheOne.getVolume());
		System.out.print("The area of this sphere is ");
		System.out.println(spheOne.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//This is creating a new sphere with a new radius called spheTwo, while calling my Sphere class
		Sphere spheTwo = new Sphere(9.0);
		System.out.println("Sphere 2: ");
		System.out.print("The diameter of this sphere is ");
		System.out.println(spheTwo.getDiamater());
		System.out.print("The volume of this sphere is ");
		System.out.println(spheTwo.getVolume());
		System.out.print("The area of this sphere is ");
		System.out.println(spheTwo.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
	
		//This is creating a new sphere with a new radius called spheThree, while calling my Sphere class
		Sphere spheThree = new Sphere(11.0);
		System.out.println("Sphere 3: ");
		System.out.print("The diameter of this sphere is ");
		System.out.println(spheThree.getDiamater());
		System.out.print("The volume of this sphere is ");
		System.out.println(spheThree.getVolume());
		System.out.print("The area of this sphere is ");
		System.out.println(spheThree.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//My Cubes: 
		//This is creating a new Cube called scubeOne, while calling my Cube class
		Cube cubeOne = new Cube(4.0);
		System.out.println(Cube.getShape());
		System.out.println("Cube 1: ");
		System.out.print("The circumference of this Cube is ");
		System.out.println(cubeOne.getCircumference());
		System.out.print("The volume of this Cube is ");
		System.out.println(cubeOne.getVolume());
		System.out.print("The area of this Cube is ");
		System.out.println(cubeOne.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//This is creating a new cube with new side called cubeTwo, while calling my Cube class
		Cube cubeTwo = new Cube(12.0);
		System.out.println("Cube 2: ");
		System.out.print("The circumference of this Cube is ");
		System.out.println(cubeTwo.getCircumference());
		System.out.print("The volume of this Cube is ");
		System.out.println(cubeTwo.getVolume());
		System.out.print("The area of this Cube is ");
		System.out.println(cubeTwo.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
	
		//This is creating a new cube with new side called cubeThree, while calling my Cube class
		Cube cubeThree = new Cube(8.0);
		System.out.println("Cube 3: ");
		System.out.print("The circumference of this Cube is ");
		System.out.println(cubeThree.getCircumference());
		System.out.print("The volume of this Cube is ");
		System.out.println(cubeThree.getVolume());
		System.out.print("The area of this Cube is ");
		System.out.println(cubeThree.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//My Rhombus': 
		//This is creating a new Rhombus called rhomOne, while calling my Rhombus class
		Rhombus rhomOne = new Rhombus(12.0,8.0,8.0);
		System.out.println(Rhombus.getShape());
		System.out.println("Rhombus 1: ");
		System.out.print("The Perimiter of this rhombus is ");
		System.out.println(rhomOne.getPerimiter());
		System.out.print("The first area formula of this rhombus is ");
		System.out.println(rhomOne.getArea2());
		System.out.print("The second area formula of this rhombus is ");
		System.out.println(rhomOne.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		
		//This is creating a new rhombus with new diagonals and sides called rhomTwo, while calling my Rhombus class
		Rhombus rhomTwo = new Rhombus(14.0,4.0,4.0);
		System.out.println("Rhombus 2: ");
		System.out.print("The Perimiter of this rhombus is ");
		System.out.println(rhomTwo.getPerimiter());
		System.out.print("The first area formula of this rhombus is ");
		System.out.println(rhomTwo.getArea2());
		System.out.print("The second area formula of this rhombus is ");
		System.out.println(rhomTwo.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
		//This is creating a new rhombus with new diagonals and sides called rhomThree, while calling my Rhombus class
		Rhombus rhomThree = new Rhombus(8.0,4.0,4.0);
		System.out.println("Rhombus 3: ");
		System.out.print("The Perimiter of this rhombus is ");
		System.out.println(rhomThree.getPerimiter());
		System.out.print("The first area formula of this rhombus is ");
		System.out.println(rhomThree.getArea2());
		System.out.print("The second area formula of this rhombus is ");
		System.out.println(rhomThree.getArea1());
		//Prints out a space to space out my outputs
		System.out.println(" ");
	}	

}



