//Stephan Scott
public class NumberDemoScott {

	public static void main(String[] args) {
		// 7 variables for each primitive data type.
		//byte, short, int, long, float, double, boolean, char
		int numOfDataTypes = 7;
		
		System.out.println("There are " + numOfDataTypes + " data types.");
		
		byte varByte = 127;
		
		System.out.println("Bytes are four times smaller than an int, so smaller numbers from -127 to " + varByte + " can be used to save space.");
		
		short varShort = 32767;
		
		System.out.println("A short can be used to save memory as well, its double the size of a byte but still smaller than an int. Its range is -32,768 to " + varShort + " .");
		
		long varLong = 9223372036854775807L;
		
		System.out.println("A long is used when the int range has been reached, ranging from -9,223,372,036,854,775,808 to " + varLong + " .");

		float varFloat = 4.6f;
		
		System.out.println("A float is a single precision floating point and is a smaller version of a double. " + varFloat);

		double varDouble = 154.7456;
		
		System.out.println("A double is a 64bit precision floating point. Usually the default for decimal data values " + varDouble);

		char varChar = 'A';
				
		System.out.println("A char is char data type is a single 16-bit Unicode character for any single character, such as an " + varChar +".");

	}

}
