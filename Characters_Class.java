
public class Characters 
{
	private int age; 
	private String firstName; 
	private String lastName; 
	private String superPower;
		
		public Characters(String firstName, String lastName, int age, String superPower)
		{
			this.age=age;
			this.firstName = firstName;
			this.lastName = lastName;
			this.superPower = superPower;
			
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getSuperPower() {
			return superPower;
		}

		public void setSuperPower(String superPower) {
			this.superPower = superPower;
		}
	
	
}
