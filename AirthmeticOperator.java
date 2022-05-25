//enter two number from keyboard to performed all the airthmetic operation
import java.util.*;
class AirthmeticOperator{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of x");
		int x = sc.nextInt();
		System.out.print("The value of x = "+x);
		
		System.out.print("Enter a value of y");
		int y = sc.nextInt();
		System.out.print("The value of y = "+y);
		
		int rs;
		rs = x+y;
		
		System.out.println("sum =   "+rs);
		System.out.println("sum =   "+(x + y));
		System.out.println("sub =   "+(x - y));
		System.out.println("mul =   "+(x * y));
		System.out.println("div =   "+(float) x/y);
		System.out.println("rem =   "+(x % y));
	}
	
}