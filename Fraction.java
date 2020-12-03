package fraction;

public class Fraction {
	private int num;

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}

	private int den;
	
	public Fraction(int num, int den) {
		if (den == 0)
			throw new IllegalArgumentException("The denominator with the value of 0 is not permitted");
		if (num < 0 && den < 0) {
			num = Math.abs(num);
			den = Math.abs(den);
		}
		if (den < 0 && num > 0) {
			den = Math.abs(den);
			num = num * -1;
		}
	}//end of Fraction
	
	public int compareTo(Fraction fraction) {
		if ((fraction.den * this.num) > (fraction.num * this.den))
			return -1;
		else if ((fraction.den * this.num) < (fraction.num * this.den))
			return -1;
		else
			return 0;
	}
	
	private int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return 0;
	}


	
}
