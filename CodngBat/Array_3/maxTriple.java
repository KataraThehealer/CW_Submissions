public int maxTriple(int[] nums) {
  public int maxTriple(int[] nums) {
 int largest = 0; 
  int first = nums[0];
  int middle = nums[nums.length/2];
  int last = nums[nums.length-1];
  
  if(first > middle && first > last)
  {
    return first;
  }
  
  else if(middle > first && middle > last)
  {
    return middle;
  }
  
  else
  {
    return last;
  }
}

}
