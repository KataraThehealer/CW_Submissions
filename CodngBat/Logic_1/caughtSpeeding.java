public int caughtSpeeding(int speed, boolean isBirthday) 
{
  if(isBirthday == false)
  {
    if(speed <= 60)
    {
      return 0;
    }
    else if(speed >= 61 && speed <= 80)
    {
      return 1;
    }
    else if(speed >= 81)
    {
      return 2;
    }
  }
  if(isBirthday == true)
  {
    if(speed <= 65)
    {
      return 0;
    }
    else if(speed >= 66 && speed <= 85)
    {
      return 1;
    }
  }
  
  return 2;
      
}
