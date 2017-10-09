
public class Person {
	private String name;
	private int idNum;
	public Person ()
	{
		this.name = "Bob";
		this.idNum = 0;
	}
	public Person(String name, int idNum)
	{
		this.name = name;
		this.idNum = idNum;
	}
	@Override
	public String toString()
	{
		String str = "";
		str = "Name = " + name + "\n";
		str += "Id Num = " + idNum;
		return str;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setIdNum(int idNum)
	{
		this.idNum = idNum;
	}
	public int getIdNum()
	{
		return idNum;
	}
}
//
