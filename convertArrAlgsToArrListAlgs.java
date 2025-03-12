import java.util.ArrayList;

public class convertArrAlgsToArrListAlgs {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer>intArrayList = new ArrayList<Integer>();
		
		intArrayList.add(4);
		intArrayList.add(5);
		intArrayList.add(1);
		intArrayList.add(6);
		intArrayList.add(3);
		
		System.out.println(checkFor4(intArrayList));
		ridAllFives(intArrayList);
		System.out.println(intArrayList);
		bubbleSort(intArrayList);
		System.out.println(intArrayList);

	}
	
	//1. Create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
	public static int checkFor4(ArrayList<Integer>intArrayList)
	{
		int counter = 0; 
		
		for (int i = 0; i< intArrayList.size(); i++)
		{
			if(intArrayList.get(i) == 4)
			{
				return i;
			}
		}
		
		return counter; 
	}
	
	//2. Create a method ridAllFives() that is passed an ArrayList nums and altars that ArrayList without returning anything. The ArrayList will have any 5’s deleted from nums.
	public static void ridAllFives(ArrayList<Integer>IntArrayList)
	{
		int counter = 0; 
		
		for (int i = 0; i < IntArrayList.size()-1; i++) 
		{
			if (IntArrayList.get(i) == 5)
			{
				IntArrayList.remove(i);
			}
		}
	}
	
	//3. Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
	public static void bubbleSort(ArrayList<Integer>IntArrayList)
	{
		int counter = 0; 
		
		while (counter != 0)
		{
			counter = 0; 
			
			for (int i = 0; i < IntArrayList.size()-1; i++)
			{
				if(IntArrayList.get(i) > IntArrayList.get(i+1))
				{
					int temp = IntArrayList.get(i);
					IntArrayList.set(i, i+1);
					IntArrayList.set(i+1, temp);
					counter++;
				}
			}
		}
	}
	
}

