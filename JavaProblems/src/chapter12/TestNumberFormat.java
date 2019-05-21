package chapter12;
/*
 * Write the bin2Dec(String binaryString) method to convert a binary string
 * into a decimal number.  Implement the bin2Dec method to throw a NumberFormatException
 * if the string is not a binary string.
 */
public class TestNumberFormat {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Prompt user for a binary string.
		System.out.print("Enter a binary string to convert to decimal: ");
		String binaryString = input.nextLine();
		String binaryString2 = binaryString;
		
		int decNum = (int)bin2Dec(binaryString);
		
		System.out.printf("%s in decimal form is %d", binaryString2, decNum);

	}
	
	// bin2Dec method.
	public static double bin2Dec(String binaryString)throws NumberFormatException {
		
		int dec = 0;
		
		for(int i = 0; i < binaryString.length()-1; i++) {
			String sub = binaryString.substring(i, i+1);
			System.out.print(sub);
			if(sub.equals("0") || sub.equals("1")) {
				continue;
			}
			else
				throw new NumberFormatException("This is not a binary number!");
		}
		
		dec = Integer.parseInt(binaryString, 2);
		return dec;
	}

}
