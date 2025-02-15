public int[] make2(int[] a, int[] b) {
  int[] myArray = new int[2];
  
  int alen = a.length;
  int blen = b.length;
  
  if(alen == 0)
  {
    myArray[0] = b[0];
    myArray[1] = b[1];
    
    return myArray;
  }
  
  else if(alen == 1 && blen == 1)
  {
    myArray[0] = a[0];
    myArray[1] = b[0];
    
    return myArray;
  }
  
  else if(alen == 1)
  {
    myArray[0] = a[0];
    myArray[1] = b[0];
    
    return myArray;
  }
  
  else
  {
    myArray[0] = a[0];
    myArray[1] = a[1];
  }
  
  return myArray;
  
}
