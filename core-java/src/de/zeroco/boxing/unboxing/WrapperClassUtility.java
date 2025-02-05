package de.zeroco.boxing.unboxing;

public class WrapperClassUtility {
	
	public static void main(String[] args) {
		System.out.println(convertToDouble(20.0));
		System.out.println(convertToInt(20));
		System.out.println(convertToFloat(20.0f));
		System.out.println(convertToLong(20L));
//		System.out.println(convertToByte((byte)20));
//		System.out.println(convertToShort((short)20));
//		System.out.println(convertToChar('a'));
		System.out.println(parseToInt("123"));
		System.out.println(parseToFloat("20.0"));
		System.out.println(parseToDouble("202.0"));
		System.out.println(parseToBoolean("true"));
	}
	
	public static int convertToInt(Integer number) {
		return number.intValue();
	}
	
	public static long convertToLong(Long number) {
		return number.longValue();
	}
	
	public static float convertToFloat(Float number) {
		return number.floatValue();
	}
	
	public static double convertToDouble(Double number) {
		return number.doubleValue();
	}
	
	public static short convertToShort(Short number) {
		return number.shortValue();
	}
	
//	public static byte convertToByte(Byte number) {
//		return number.byteValue();
//	}
//	
//	public static char convertToChar(Character alphabet) {
//		return alphabet.charValue();
//	}
	
	public static boolean convertToBoolean(Boolean value) {
		return value.booleanValue();
	}
	
	public static int parseToInt(String input) {
		return Integer.parseInt(input); 
	}
	
	public static float parseToFloat(String input) {
		return Float.parseFloat(input);
	}
	
	public static double parseToDouble(String input) {
		return Double.parseDouble(input);
	}
	
	public static boolean parseToBoolean(String input) {
		return Boolean.parseBoolean(input);
	}
	
}
