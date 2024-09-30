public class Rhombus 
{
	private double side;
	private double diag1;
	private double diag2; 
	
	/**
	 * Constructor
	 */
	public Rhombus (double s,double d1, double d2)
	{
		side = s;
		diag1 = d1;
		diag2 = d2; 
	}
	
	/**
	 * Identifies the shape. 
	 */
	public static String getShape() 
	{
		return "Rhombus: ";
	}
	
	/**
	 * Calculates the area of this rhombus. 
	 * (diag1*diag2/2)
	 */
	public double getArea1() 
	{
		double L = diag1*diag2;
		double fin = L/2;
		return fin;
	}
	/**
	 * Calculates the perimiter of this rhombus. 
	 * (4*side)
	 */
	
	public double getPerimiter() 
	{
		return 4*side;
	}
	
	/**
	 * This calculates the area of the rhombus using a different formula. 
	 * (diag1*diag2*0.5)
	 */
	public double getArea2() 
	{
		double F = diag1*diag2;
		double fin = 0.5*F;
		return fin;
	}
}
