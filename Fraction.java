
public class Fraction 
{
		private int numerator;
		private int denominator;
		public Fraction()
		{
			numerator = 0;
			denominator = 0;
		}
		public Fraction (int numerator, int denominator)
		{
			this.numerator = numerator;
			this.denominator = denominator;
		}
		public String toMixedNumber()
		{
			String mixed = "";
			int wholePart = numerator/denominator;
			int remainder = numerator%denominator;
			mixed = wholePart + " " + remainder + "/" + denominator;
 			return mixed;
		}
		public double toDecimal()
		{
			double decimal = 0.0;
			decimal = (double) numerator/denominator;
			return decimal;	
		}
		public int getNumerator()
		{
			return numerator;
		}
		public void setNumerator(int numerator)
		{
			this.numerator = numerator;
		}
		public int getDenominator()
		{
			return denominator;
		}
		public void setDenominator(int denominator)
		{
			this.denominator = denominator;
		}
}
