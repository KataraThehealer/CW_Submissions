public String doubleChar(String str) 
{
  String ans = "";
  
  for (int i=0;i<str.length(); i++)
  {
    ans += str.charAt(i);
    ans += str.charAt(i);
  }
  
  return ans; 
}