import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       NumberList myList = new NumberList();
       int num = 0;
       while(num >= 0)
       {
    	   System.out.println("Enter a number.");
    	   num = input.nextInt();
    	   if(num >= 0)
    	   {
    		   myList.addNum(num);
    	   }
       }
       System.out.println(myList);
       myList.removeEvens(); 
       System.out.println(myList);
    }
}