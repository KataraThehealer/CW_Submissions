
public class Methods_Intro_Practice {
//Task 1: Methods Intro Practice
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task 1: call
		System.out.print(stateName());
		System.out.print(stateEyeColor());
		System.out.print(stateHairStyle());
		System.out.println(stateFavoriteFood());
		//Task 2: call
		System.out.print(stateRadius());
		System.out.print(stateDiameter());
		System.out.println(stateCircum());
		//Task 3: call
		System.out.print(stateSum());
		System.out.print(stateDiff());
		System.out.print(stateProd());
		System.out.print(stateQuot());
		System.out.println(stateMod());
	}
	
	public static String stateName() {
		return("My name is Manae!! ");
	}
	
	public static String stateEyeColor() {
		return("My eyes are dark brown. ");
	}
	
	public static String stateHairStyle() {
		return("My hair is in an afro type style. ");
	}
	
	public static String stateBestFriend() {
		return("Anolani Paik and Simone Callejo are my best friends. ");
	}
	
	public static String stateFavoriteFood() { 
		return("Chicken alfredo would have to be my favorite food. ");
	}
	// Task 2: Circle 
	public static void pringCircleStats(String[] args) {
	
	} 
		public static String stateRadius() {
			return("The radius of this circle is 5. ");
		}
		
		public static String stateDiameter() {
			return("The diameter is 10. ");
		}
		public static String stateCircum() {
			double rad = 5.0;
			double pie = rad*rad;
			double pi = 3.1519;
			return("The circulum of the circle is " + (double)2*pi*rad + ", while the area is " + (double)pi*pie + ".");
		}
	
	public static void printMathsStuff(String[] args) {
			
	} 
		public static String stateSum() {
			int intA = 13;
			int intB = 11;
			int add = intA+intB;
			return("My two ints are 13 and 11. The sum would be " + (int)add + ". ");
		}
		public static String stateDiff() {
			int intA = 13;
			int intB = 11;
			int sub = intA-intB;
			return("The difference is " + (int)sub + ". ");
		}
		public static String stateProd() {
			int intA = 13;
			int intB = 11;
			return("The product is " + (int)intA*intB + ". ");
		}
		public static String stateQuot() {
			int intA = 13;
			int intB = 11;
			return("The quotient is " + (int)intA/intB + ". ");
		}
		public static String stateMod() {
			int intA = 13;
			int intB = 11;
			return("The modulus is " + (int)intA%intB + ".");
		}

	
		

		
	}
	

	
