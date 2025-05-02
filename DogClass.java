public class Dog {

	//attributes
	protected String name;
	protected int age; 
	protected boolean adopStat;


	public Dog(int a, String name, boolean ad)
	{
		age = a; 
		this.name = name;
		adopStat = ad;
	}
	
	public boolean getAdoptionStatus()
	{
		return adopStat;
	}
	
	public void stateAge()
	{
		System.out.println(name + " is " + age + " years old.");
	}
	
	public void increaseAge()
	{
		age++;
	}
	
	public String toString()
	{
		stateAge(); 
		if(adopStat)
		{
			return name + " is not homeless.";
		}
		return name + " is homeless.";
	}

	public boolean equals(Dog doggy)
	{
		if(this.age == doggy.age && this.name == doggy.name && this.adopStat == doggy.adopStat)
		{
			return true;
		}
		
		return false; 
	}

}
