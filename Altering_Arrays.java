
public class Altering_Arrays {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/**Create a method subract5FromAll4() that is passed an array nums and returns a new array. T
		 * he new array will consist of the values of nums, except that each element must be 5 less than its corresponding 
		 * element in nums. Nums will always have 4 elements. 
		 * Ex: subtract5FromAll4( {5, 0, 8, 20}  )   -------returns----->     {0, -5, 3, 15}
		*/
			
	}
	
	int[] nums = {10,16,13};

	public static int[] subtract5FromAll4(int[] arr)
	{
		int[] copyArr = new int[arr.length];
		
		for(int i=0; i < arr.length; i++)
		{
			copyArr[i] = 4+arr[i];
			System.out.print(copyArr);
		}
		
		return copyArr;
		
	}
	

}
