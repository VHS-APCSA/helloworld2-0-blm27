
public class DoubleFor {

	public static void main(String[] args)
	{
		int[][] twoD  = new int[3][5];
		for(int row = 0; row < twoD.length; row++)
		{
			for(int col = 0; col < twoD[row].length; col++)
			{
				twoD[row][col] = (int)(Math.random() * 5);
			}
		}
		for(int row = 0; row < twoD.length; row++)
		{
			for(int col = 0; col < twoD[row].length; col++)
			{
				System.out.print(twoD[row][col] + " ");
			}
			System.out.println();
		}
	}
}

