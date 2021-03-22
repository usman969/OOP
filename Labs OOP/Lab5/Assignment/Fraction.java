package fraction;


import java.util.*;

public class Fraction 
{
    private int numerator;
    private int denominator;

    public Fraction(int n, int d) 
    {
        numerator = n;
	denominator = d;
    }

    public void setNumerator(int n) 
    {
	numerator = n;
    }
    public void setDenominator(int d)
    {
        denominator = d;
    }

    public void displayFraction()
    {
	System.out.print(numerator + "/" + denominator);
    }

    public boolean equals(Fraction other)
    {
	int n1, n2;
	int n3, n4;
	int num5 = 1;
        for (int i = 2; i <= Math.min(numerator, denominator); i++) 
	{

            if (numerator % i == 0 && denominator % i == 0)
            num5 = i;
	}

	n1 = numerator / num5;
	n2 = denominator / num5;

	int otherGcf = 1;
	for (int i = 2; i <= Math.min(other.numerator, other.denominator); i++) 
	{
			
            if (other.numerator % i == 0 && other.denominator % i == 0)
            otherGcf = i;
	}

	n3 = other.numerator / otherGcf;
	n4 = other.denominator / otherGcf;

	return (n1 == n3 && n2 == n4);

	}

}
