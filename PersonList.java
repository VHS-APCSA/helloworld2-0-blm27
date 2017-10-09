import java.util.ArrayList;
public class PersonList 
{
	private ArrayList<Person> people;
	public PersonList()
	{
		people = new ArrayList<Person>();
	}
	@Override
	public String toString()
	{
		String str = "";
		for(Person person : people)
		{
			str += person + "\n";
		}
		return str;
	}
	public void clearList()
	{
		while(people.size() > 0)
		{
			people.remove(0);
		}
	}
	public Person findSmallestId()
		{
			Person found = people.get(0);
			for(Person person : people)
			{
				if(person.getIdNum() < found.getIdNum())
				{
					found = person;
				}
			}
			return found;
	}
	public Person findById(int idNum)
	{
		Person found = null;
		for(Person person : people)
		{
			if(person.getIdNum() == idNum)
			{
				found = person;
				break;
			}
		}
		return found;
	}
	public void addPerson(Person person)
	{
		people.add(person);
	}
}
//
