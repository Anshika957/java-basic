// assignment operator
import java.util.Scanner;
class AssignmentOP{
	public static void main(String args[]){
	// x= 10, y= 7, z=5
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter a value of x ");
	int x = obj.nextInt();
    System.out.println("x =  "+x);
	
	System.out.print("enter a value of y ");
	int y = obj.nextInt();
	System.out.println("y =  "+y);
	
	System.out.print("enter a value of z ");
	int z = obj.nextInt();
	System.out.println("z =  "+z);
	
	x = x+5;
	System.out.println("x =  "+x);
	
	x+= 12;
	System.out.println("x =  "+x);
	
	y -=2;
	System.out.println("y =  "+y);
	
	z *=y;
	System.out.println("z =  "+z);
	
	x /=y;
	System.out.println("x =  "+x);
	
	z %=3;
	System.out.println("z =  "+z);
	
	}
}