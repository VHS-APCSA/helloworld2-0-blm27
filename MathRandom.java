import java.util.Scanner;
public class MathRandom 
{
	public static void main(String[] args)
	{
		int count = 0;
		String word = "psychdelic";
		while(word.length() > 0)
		{
			int index = (int) (Math.random() * word.length());
			System.out.print(word.substring(index, index +1)+ " ");
			word = word.substring(0, index) + word.substring(index +1);
			if(count % 10 == 9)
				System.out.println();
			count++;
		}
	}
}
