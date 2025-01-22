
public class Arrays_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Today you will be declaring variables that store an array of elements. Create code that accomplishes the following tasks and submit it via github:

			//1. Create an empty array that is meant to represent doubles. Name it doubArr.Repeat this for arrays that 
			//represent ints, booleans, String objects, and Circle objects. 
		double [] doubArr;
		int [] intArr; 
		boolean [] booArr; 
		String [] stringArr; 
		//Circle [] circArr; 

			//2. Create an array of ints with the following represented values: 7, -12, 88, -88, 0, 5, 2000.
		System.out.println("Task 2: ");
		int [] numArr = {7,-12,88,-88,0,5,2000};
		
		System.out.println(numArr[0]);
		System.out.println(numArr[numArr.length-1]);
		numArr[3] = 7;
		System.out.println(" ");
		
			//3. Create an array that represents 5 String objects with default values. Name the array fruitsArr. 
			//In the comment for this task, state what each element's default value is. State what the default value for ints,
			//doubles, booleans, and any reference data type is as well. 
		/**
		 * The default for ints = 0, doubles = 0.0, booleans = false, any other = null
		 */
		String [] fruitsArr = new String[5];
		
		//4. Change the 2nd element in fruitsArr to "Bapple" .
		fruitsArr[1] = "Bapple";

		//5. Change the last element in fruitsArr to "Zanana" . Accomplish this without typing the number "4" 
		//and instead accessing the arrays length.
		
		fruitsArr[4] = "Zanana";
		

		//6. To verify you did number 4 correctly, print out the second element of fruitsArr.
		System.out.println("Task 6: ");
		System.out.println(fruitsArr[1]);
		System.out.println("");

		
		//7. Create a loop that one by one prints out each element in fruitsArr.
		System.out.println("Task 7: ");
		for(int i = 0; i < fruitsArr.length; i++)
		{
			System.out.println(fruitsArr[i]);
		}
		System.out.println("");
		
		//Boolean[] 
		
	}

}
