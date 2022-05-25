import java.util.Scanner;
class Ternary{
	public static void main(String []args){
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value of x ");
		int x = obj.nextInt();
		System.out.println("x = "+x);
		
		System.out.println("Enter a value of y ");
		int y = obj.nextInt();
		System.out.println("y = "+y);
		
		int rs = 0;
		rs = (x < y) ? x : y ;
		System.out.println("rs = "+rs);
		
	}
}