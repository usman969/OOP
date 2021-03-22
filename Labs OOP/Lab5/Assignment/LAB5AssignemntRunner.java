package fraction;

import java.util.*;
public class LAB5AssignemntRunner {
    public static void main(String[]args){ 
    Scanner input = new Scanner(System.in);
        int numerator, denominator;
	System.out.print("Enter target Fraction's Numerator: ");
	numerator = input.nextInt();
	System.out.print("Enter target Fraction's Denominator: ");
	denominator = input.nextInt();
	Fraction fraction = new Fraction(numerator, denominator);	
		System.out.print("Enter new numerator: ");
		int otherNumerator = input.nextInt();
		System.out.print("Enter new denominator: ");
		int otherDenominator = input.nextInt();
		Fraction otherFraction = new Fraction(otherNumerator, otherDenominator);
		if (fraction.equals(otherFraction)) {
			fraction.displayFraction();
			System.out.print(" is equal to ");
			otherFraction.displayFraction();
		} else

		{
			fraction.displayFraction();
			System.out.print(" is not equal to ");
			otherFraction.displayFraction();
		}
    }                    
}
