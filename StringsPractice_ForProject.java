import java.util.Scanner;
public class StringsPractice_ForProject {
	static Scanner myReader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		boolean test = true;
		int count = 0;
		/**
		 * It will run what is inside the code until the user says to stop 
		 */
		while(test)
		{
			
			String userInput = new String (myReader.next());
			 
			System.out.println(userInput);
			
			if (userInput.equals("stop"))
			{
				test = false;
			}
			
			count++;
			
			System.out.println(count + userInput);
		} 
		makeCircle();
		
		myReader.close();
	
	
	}	
	/**
	 * this is a method for my circle that will let the user input what ever variable they would like as long as its a double.
	 * 
	 */
	public static void makeCircle()
	{
		//this code states the original radius of the circle: 3.0
		Circle cirOne = new Circle (3.0);
		System.out.println("the original radius is "+cirOne.getRadius());
		for(int i = 1; i <= 5; i++)	
		{
			double r = myReader.nextDouble();
			System.out.println(cirOne.getRadius() +r);
			cirOne.setRadius(cirOne.getRadius() +r);
		}
	}
	
	
	
}
