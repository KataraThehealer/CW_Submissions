
public class Homework1_Practicing_System_and_Primatives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//task 1: printout your name using the letter "O" in ASCII art
		
		System.out.println("                        O");
		System.out.println("O   O  OO  O   O  OO   O  OOOO");
		System.out.println("OO OO O  O OO  O O  O     O");
		System.out.println("O O O OOOO O O O OOOO     OOO");
		System.out.println("O   O O  O O  OO O  O     O");
		System.out.println("O   O O  O O   O O  O     OOOO");
		
		//task 2: Write code to computer the following math problem 
		double topmulta=6.0*3.5;
		double topmultb=1.5*5;
		double sub = topmulta-topmultb;
		double botsub = 55.6-30.2;
		double fin = sub/botsub;
		
		System.out.println(" ");
		System.out.println("Task 2:");
		System.out.print("The answer to 6.0 x 3.5 - 1.5 x 5/55.6 - 30.2 is ");
		System.out.println(fin);
		System.out.println(" ");
		
		//task 3: Write adaptable code that will print out the circumference and area of a circle that has a radius of 4.0.
		
		System.out.println("Task 3:");
		double pi = 3.1519; 
		double rad = 4.0;
		double cir = 2*pi*rad;
		System.out.print("The circumference of the circle is ");
		System.out.println(cir);
		double rads = rad*rad;
		double area = pi*rads;
		System.out.print("The area of the circle is ");
		System.out.print(area);
		
		
	}

}
