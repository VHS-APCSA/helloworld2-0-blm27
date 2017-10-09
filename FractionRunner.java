
public class FractionRunner 
{
	public static void main(String[] args)
	{
		Fraction fraction = new Fraction(17,3);
		double decimal = fraction.toDecimal();
		System.out.println(decimal);
		String mixed = fraction.toMixedNumber();
		System.out.println(mixed);
		
		Fraction bad = new Fraction();
		double num = bad.toDecimal();
		System.out.println(num);
}
}
