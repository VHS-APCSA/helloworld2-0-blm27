import java.util.Scanner;
public class PersonListRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PersonList people = new PersonList();
		String name = "";
		int idNum = 0;
		while(idNum >= 0)
		{
			System.out.println("Enter a name and id number." + "Enter -1 to quit loop.\n");
			name = input.nextLine();
			idNum = input.nextInt();
			input.nextLine();
			if(idNum >=0)
			{	
			people.addPerson(new Person(name, idNum));
			}	
		}
		System.out.println(people);
		Person smallest = people.findSmallestId();
		System.out.println("Smallest : " + smallest);
		people.clearList();
		System.out.println(people);
	}
}
//for (Type name : list)// 
