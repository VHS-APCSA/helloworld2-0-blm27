import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest 
{
	public static void main(String[] args)
{
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 0; //
		while(num >= 0) //
		{
			num = input.nextInt();
			if(num >= 0)
			{
				list.add(num);
			}
		}
		System.out.println(list);
		int sum = 0;
		for(Integer numObject : list)
		{
			sum += numObject.intValue();
		}
		Integer numObject = new Integer(sum);
		String numString = numObject.toString();
		System.out.println("Sum =" + numString);
	}
}
