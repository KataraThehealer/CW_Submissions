public class Rectangle 
{
	private double width;
	private double length;
	
	/**
	 * Constructor
	 */
	public Rectangle(double w, double l)
	{
		width = w;
		length = l;
	}
	
	/**
	 * This identifies the shape. 
	 */
	public static String getShape() 
	{
		return "Rectangle: ";
	}
	
	/**
	 * Calculates the area of this rectangle. 
	 * (width*length)
	 */
	public double getArea1()
	{
		return width*length;
	}
	
	/**
	 * Calculates the circumference of this rectangle 
	 * (width+width+length+length)
	 */
	public double getCircumference()
	{
		return width+width+length+length;
	}
	
	/**
	 * Calculates the perimiter of this rectangle. 
	 * (length*width*2)
	 */
	public double getPerimiter()
	{
		return length*width*2;
	}
}
