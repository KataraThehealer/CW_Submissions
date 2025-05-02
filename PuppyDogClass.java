public class PuppyDog extends Dog{
	
	boolean isFed;
	
	public PuppyDog(int a, String n, boolean ad, boolean f)
	{
		super(a, n, ad);
		isFed = f;
	}
	
	public void stateAge()
	{
		System.out.println(name + " is " + age + " years old.");
	}
	
	public void feedPup()
	{
		isFed = true; 
	}
	
	public void increaseAge()
	{
		super.increaseAge();
		isFed = false;
	}
	
	public String toString()
	{
		if(isFed)
		{
			return super.toString() +  "I'm fed!";
		}
		
		return "hi";
	}
	
	public boolean equals(PuppyDog lilDog)
	{
		if (super.equals(lilDog) && this.isFed == lilDog.isFed)
		{
			return true;
		}
		
		return false; 
	}
}
