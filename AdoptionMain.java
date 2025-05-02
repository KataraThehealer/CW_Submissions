public class Apotion_Main {

	public static void main(String[] args) 
	{
		Dog Maddie = new Dog(13, "Maddie", false);
		System.out.println(Maddie.getAdoptionStatus());
		Maddie.stateAge();
		Maddie.increaseAge();
		Maddie.stateAge();
		
		
		PuppyDog Liv = new PuppyDog(1, "Liv", true, true);
		System.out.println(Liv.getAdoptionStatus());
		Liv.stateAge();
		Liv.increaseAge();
		Liv.stateAge();
		
		System.out.print(Liv);
		
		//PuppyDog Puppu = new PuppyDog(1, )
		
				
		System.out.print(Liv.equals(Maddie));

	}

}
