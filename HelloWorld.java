import java.awt.Color;
public class HelloWorld
{
    public static void main(String[] args)
    {	
    	Marker pen = new Marker();
    	Color color = pen.getColor();
    	System.out.println(color);	
    	
    	Marker redPen = new Marker(Color.yellow, false, false);
    	Color newColor = redPen.getColor();
    	System.out.println(newColor);
    	redPen.setColor(Color.red);
    	newColor = redPen.getColor();
    	System.out.println(newColor);
    	boolean canWrite = redPen.
    	
    			
    }
}