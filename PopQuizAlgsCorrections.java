
public class PopQuizALgsCorrections {

// TODO Auto-generated method stub
//Question 1:
public static void shifter(int[] nums)
	{
		nums last = nums[nums.length-1];
			
		for (int i = nums.length-1; i >0; i--)
		{
			nums[i+1] = nums[i];
		}
			
		nums[0] = last;
			
		
	}


//Question 2:

public static int [] copySort(int[] nums)
{
	int counter = 1; 
	while(counter != 0)
	{
		counter = 0;
		int[] copy = nums; 
		
		for(int i = 0; i<copy.length; i++)
		{
			if(copy[i]>copy[i+1])
			{
				int temp = copy[i];
				copy[i] = copy[i+1];
				copy[i+1] = temp;
				
				counter++;
			}
		}
	}
	
	return copy;
}

}

