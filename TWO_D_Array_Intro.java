public class TWO_D_Array_Intro {

	
	public static void main(String[] args) 
	{
		
		//1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
		int[][] gridNums = new int[4][6];
		
		//2. Instantiate a 2-D array with the following values:
		// 4   5    7
		// 2  -1   8
		// 0  1   3
		int[][] forGrid2Nums = new int[3][4];
		//Row 1
		forGrid2Nums[0][0] = 4;
		forGrid2Nums[0][1] = 5;
		forGrid2Nums[0][2] = 7;
		forGrid2Nums[0][3] = 6;
		//Row 2
		forGrid2Nums[1][0] = 2;
		forGrid2Nums[1][1] = -1;
		forGrid2Nums[1][2] = 8;
		forGrid2Nums[1][3] = 0;
		//Row 3
		forGrid2Nums[2][0] = 0;
		forGrid2Nums[2][1] = 1;
		forGrid2Nums[2][2] = 3;
		forGrid2Nums[2][3] = 4;
		

		//For the following problems, print out those elements before and after to verify it worked. 
		//3. For both of those arrays, change the element in the first row, first column to a 17.
		gridNums[0][0] = 17;
		forGrid2Nums[0][0] = 17;
		
		//4. For both of those arrays, change the element in the second row, third column into a 20. 
		gridNums[2][3] = 20;
		forGrid2Nums[2][3] = 20;
		
		//5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 
		gridNums[0][gridNums[0].length-1] = -5;
		forGrid2Nums[0][forGrid2Nums[0].length-1] = -5;
		
		//6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length 
		gridNums[3][gridNums[3].length-4] = -7;
		forGrid2Nums[2][forGrid2Nums[2].length-2] = -7;
		
		//7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
		gridNums[3][gridNums[3].length-1] = -30;
		forGrid2Nums[2][forGrid2Nums[2].length-1] = -30;
		
		printElementFirstRow(forGrid2Nums);
		printElementFirstColumn(forGrid2Nums);
		printElementRowMajor(forGrid2Nums);
		printElementColumnMajor(forGrid2Nums);
	}
		//8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
		public static int[][] printElementFirstRow(int[][] arr)
		{
			for(int i =0;i<=arr[0].length-1; i++)
			{
				System.out.println(arr[0][i]);
			}
			return arr;
		}
		
		//9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
		public static int[][] printElementFirstColumn(int[][] arr)
		{
			for(int i = 0; i<=arr.length-1;i++)
			{
				System.out.print(arr[i][1]);
			}
			return arr;
			
		}
		
		//10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 
		public static int[][] printElementRowMajor(int[][] arr)
		{

			for (int i = 0; i<=arr[0].length-1; i++)
			{
				for(int r=0; r<=arr.length-1;r++)
				{
					System.out.println(arr[r][i]);
				}
			}
			return arr;
		}
		
		//11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 	
		public static int[][] printElementColumnMajor(int[][] arr)
		{
			for(int i=0; i<=arr.length-1;i++)
			{
				for(int r=0;r<arr[0].length-1;r++)
				{
					System.out.println(arr[i][r]);
				}
			}
			return arr;
		}
	
}
