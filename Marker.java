import java.awt.Color;
public class Marker
{
	private Color color;
	private boolean canWrite;
	private boolean isOpen;
	//The role of a constructor is to 
	//initialize instance variables
	public Marker()
	{
		color = Color.blue;
		canWrite = false;
		isOpen = false;
	}
	public Marker(Color color, boolean canWrite, boolean isOpen)
	{
		this.color = color;
		this.canWrite = canWrite;
		this.isOpen = isOpen;
	}
	public void setColor(Color color)
	{
		this.color = color;
	}
	public void setCanWrite(boolean canWrite)
	{
		this.canWrite = canWrite;
	}
	public Color getColor()
	{
		return color;
	}	
	public boolean getCanWrite()
	{
		return canWrite;
	}
	public boolean getIsOpen()
	{
		return isOpen;
	}
}	