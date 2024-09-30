public class Square 
{
	private double side;
	
	//constructor:
	public Square(double s)
	{
		side = s;
	}
	
	/**
	 * This identifies the shape
	 */
	public static String getShape() 
	{
		return "Squares: ";
	}
	
	/**
	 *  This calculates the area of this circle. 
	 *  (side*side)
	 */
	public double getArea1()
	{
		return side*side;
	}
	
	/**
	 * This calculates the circumference of this circle. 
	 * (4*side) 
	 */
	public double getCircumference()
	{
		return 4*side;
	}
	
	
	public void setSide(double side) 
	{
		this.side = side;
	}
	public double getVolume()
	{
		return side*side*side;
	}
	
}
