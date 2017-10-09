
public class TestPrep 
{
	private String name;
	private int grade;
	public TestPrep()
	{
		name = "";
		grade = 0;
	}
	public TestPrep(String name, int grade)
	{
		this.name = name;
		this.grade = grade;
	}
	public void retest(int newGrade)
	{
		grade = newGrade;
	}
}

