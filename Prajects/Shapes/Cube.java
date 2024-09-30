public class Cube 
{
	private double side;
	
	/**
	 * Constructor
	 */
	public Cube(double s) 
	{
		side = s; 
	}
	
	/**
	 * This identifies the shape. 
	 */
	public static String getShape()
	{
		return "Cube: ";
	}
	
	/**
	 * Calculates the are of this cube. 
	 * (6*side^2)
	 */
	public double getArea1() 
	{
		double a = side*side;
		return 6*a; 
	}
	
	/**
	 * This calculates the volume of this cube. 
	 * (side^3)
	 */
	public double getVolume() 
	{
		return side*side*side;
	}
	
	/**
	 * Calculates the circumference of this cube. 
	 * (12*side)
	 */
	public double getCircumference() 
	{
		return 12*side;
	}
	

}
