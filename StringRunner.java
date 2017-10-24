import java.util.Scanner;
import java.util.ArrayList;
public class StringRunner {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<String> stringList = new ArrayList<String>();
		System.out.println("Enter a word.");
		String str = input.next();
		while(!str.equals("quit"))
		{
			stringList.add(str);
			System.out.println("Type quit to quit.");
			str = input.next();
		}
		int index = 0;
		while(index < stringList.size())
		{
			String string = stringList.get(index);
			stringList.set(index, string.substring(string.length() /2));
			index++;
		}
		System.out.println(stringList);
		input.close();
	}
}
