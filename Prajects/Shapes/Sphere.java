public class Sphere {
	
	private double radius;
	private double pi;

	/**
	 * Constructor
	 */
	public Sphere(double r)
	{
		radius = r;
		pi = 3.14;
	}
	
	/**
	 * This identifies the shape. 
	 */
	public static String getShape() 
	{
		return "Sphere: ";
	}
	
	/**
	 * Calculates the area of this sphere. 
	 * (4*pi*radius^2)
	 */
	public double getArea1()
	{
		double mult = radius*radius;
		double fin = 4*pi*mult;
		return fin;
	}
	
	/**
	 * Finds the diameter of the sphere.
	 * (radius+radius)
	 */
	public double getDiamater()
	{
		return radius+radius;
	}
	
	/**
	 * Calculates the volume of this sphere. 
	 * (1.33*pi*radius^3)
	 */
	public double getVolume()
	{
		double mult = radius*radius*radius; 
		double fin = 1.33*pi*mult;
		return fin;
	}

}
