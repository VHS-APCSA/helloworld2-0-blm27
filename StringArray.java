
public class StringArray
{
	private String[] words;
	public StringArray()
	{
		words = new String[] {"monkey", "biscuit", "senior", "sassafrass",
				"superb", "robotics", "sieve"};
	}
	public void mangle()
	{
		for(int index =0; index < words.length -1; index++)
		{
			String first = words[index];
			String second = words[index+1];
			words[index] = first.substring(0, first.length() /2) + 
					second.substring(0, second.length() /2);
			words[index +1] = first.substring(first.length() /2) + 
					second.substring(second.length() /2);
		}
	}
	@Override
	public String toString()
	{
		String ret = "[";
		for(String str : words)
		{
			ret += str + " ";
		}
		ret += "]";
		return ret;

	}
}
