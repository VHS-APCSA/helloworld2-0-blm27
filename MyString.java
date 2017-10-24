
public class MyString
{
	private String word;
	public MyString()
	{
		word = "";
	}
	public MyString(String word)
	{
		this.word = word;
	}
	public String firstToLast()
	{
		String ftl = "";
		ftl = word.substring(word.length() -1) 
		+ word.substring(1, word.length() -1) 
		+ word.substring(0,1);
		return ftl;
	}
	public String reverseString()
	{
		String reverseString = "";
		int index = 0;
		while(index < word.length())
		{
			System.out.println(word.substring(index +1, index));
			
			index++;
		}
		return reverseString;
	}
	public String esFront()
	{
		String esFront = "";
		int index = 0;
		while(index < word.length())
		{
			if(word.substring(index, index + 1).equals("e"))
			{
				esFront = "e" + esFront;
			}
			else
			{
				esFront = esFront + word.substring(index, index +1);
			}
			index++;
		}
		return esFront;
	}
	public void printByLetter()
	{
		int index = 0;
		while(index < word.length())
		{
			System.out.println(word.substring(index, index +1));
			
			index++;
		}
	}
}
