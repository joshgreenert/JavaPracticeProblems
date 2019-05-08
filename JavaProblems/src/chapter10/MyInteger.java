package chapter10;
/*
 * This class will host the MyInteger fields that will
 * allow similar functionality to the Integer class.
 */
public class MyInteger {

	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getInteger() {
		return value;
	}
	
	public boolean isEven() {
		return (value % 2) == 0;
	}
	
	public boolean isOdd() {
		return (value % 2)  == 1;
	}
	
	public boolean isPrime() {
		if (value == 1 || value == 2) {
            return true;
        }
        else {
            for (int i = 2; i < value; i++) {
                if (i % value == 0) return false;
            }
        }
        return true;
	}
	
	public boolean isEven(int value) {
		if(value % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int value) {
		if(value % 2 != 0) {
			return true;
		}
		return false;
	}
	
	public boolean isPrime(int value) {
		for(int i = 2; i <= value; i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	
	public boolean equals(int myInt) {
		if(myInt == value) {
			return true;
		}
		
		return false;
	}
	
	public boolean equals(MyInteger myInt) {
		if(myInt.value == this.value) {
			return true;
		}
		return false;
	}
	
	public static int parseInt(char[] values) {
		int sum = 0;
		for(char i : values) {
			sum += Character.getNumericValue(i);
		}
		return sum;
	}
	
	public static int parseInt(String values) {
		return Integer.parseInt(values);
	}

	
}
