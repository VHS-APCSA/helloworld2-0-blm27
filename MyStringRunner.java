import java.util.Scanner;
public class MyStringRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str = input.next();
		MyString myString = new MyString(str);
		myString.printByLetter();
		String esFront = myString.esFront();
		System.out.println(esFront);
		String ftl = myString.firstToLast();
		System.out.println(ftl);
		String reverse = myString.reverseString();
		System.out.println(reverse);
		input.close();
	}
}
