import java.util.ArrayList;
public class NumberList
{
	private ArrayList<Integer> list;
	public NumberList()
	{
		list = new ArrayList<Integer>();
	}
	public void addNum(int num)                                 
	{
		list.add(num);
	}
	public  void removeEvens()
	{
		int index = 0;
		while(index <list.size())
		{
			Integer num = list.get(index);
			if(num %2 ==0)
			{
				list.remove(index);
			}
			else
			{
			index++; //++ increases by 1//
			}
		}
	}
	public int getSum()
	{
		int sum = 0;
		for(Integer num : list)
		{
			sum += num;
		}
		return sum;
	}
	@Override
	public String toString()
	{
		String str = list + "\n";
		return str;
	}
}
//
