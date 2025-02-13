public int[] makeLast(int[] nums) {
  int[] newArray = new int [nums.length*2]; 
  
  newArray[newArray.length-1] = nums[nums.length-1];
  
  return newArray;
}
