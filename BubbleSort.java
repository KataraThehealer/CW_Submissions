import java.util.concurrent.TimeUnit;

public class Test_code_java 
{
	public static void main(String[] args) throws InterruptedException {
       
		int[] arr = {2,8,3,4,5};
		bubbleSort(arr);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
		}
	}
	
	public static void bubbleSort(int[] nums)
	{
	int counter = 2; 
	
	while(counter != 0)
	{
		counter = 0; 
		for(int i =0; i<nums.length-1; i++)
		{
			if( nums[i] > nums[i+1])
			{
				int temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp; 
				counter++;
			}
		}
	}
}
}
