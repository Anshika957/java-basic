import java.util.Scanner;

class UserInput{
	/*create main method */ public static void main(String args[])
	{
		//to take user from input create scanner class 
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name: ");
		//declare string varriable ::
		String name = s.next();
		
		System.out.println("enter your age: ");
		int age = s.nextInt();
		
		System.out.println("enter your gender: ");
		char gender = s.next().charAt(0);
		
		System.out.println("name: =" +name);
		System.out.println("age: =" +age);
		System.out.println("gender: =" +gender);
	}
}