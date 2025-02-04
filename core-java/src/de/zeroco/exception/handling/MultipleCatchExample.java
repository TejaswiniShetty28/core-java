package de.zeroco.exception.handling;

public class MultipleCatchExample {
	
	public static int division(int firstNumber, int secondNumber) throws ArithmeticException {
		return firstNumber / secondNumber;
	}
	
	public static char getChar(String input, int index) throws StringIndexOutOfBoundsException {
		return input.charAt(index);
	}
	
	public static int getElement(int[] array, int index) throws ArrayIndexOutOfBoundsException {
		return array[index];
	}
	
	public static void main(String[] args) {
		try {
			int[] array = {1, 2, 3, 4, 5};
			division(2, 0);
			getChar("hello", 10);
			getElement(array, 10);
		} catch (ArithmeticException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
		}
	}
}
