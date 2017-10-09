import java.util.Scanner;

public class Import 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer.");
		int num1 = input.nextInt();
		System.out.println("Enter another integer.");
		int num2 = input.nextInt();
		System.out.println("The sum of your numbers is " +(num1+num2));
	}
}
//