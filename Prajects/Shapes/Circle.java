public class Circle {
	
	private double radius; 
	private double pi;
	
	
	//constructor:
	public Circle(double r) 
	{
		radius = r;
		pi = 3.14;
	}
	
	/**
	 * This identifies the shape
	 */
	public static String getShape() 
	{
		return "Circles";
	}
	
	/**
	 * This prints the radius of the circle object.
	 */
	public double getRadius() 
	{
		return radius;
	}
	
	/**
	 * This prints out the circumference of this circle
	 * (2*pi*radius)
	 */
	public double getCircumference()
	{
		return 2*pi*radius;
	}
	
	/**
	 * This finds the diameter of this circle 
	 * (2*radius)
	 */
	public double getDiamater()
	{
		return 2*radius;
	}
	
	/**
	 * This finds the are of the circle 
	 * (pi*radius^2)
	 */
	public double getArea()
	{
		double mult = radius*radius;
		double fin = mult*pi; 
		return fin;
	}
	
	/**
	 * This turns everything about the circle object into a String
	 */
	public String toString()
	{
		return "This is a circle with radius" + radius + "and an area of " + getArea() + "and circummferance of " +getCircumference() + ".";
	}
	
	
	public void setRadius(double r) 
	{
		radius = r;
	}
	

}
