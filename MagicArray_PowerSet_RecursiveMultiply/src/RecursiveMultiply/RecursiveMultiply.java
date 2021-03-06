package RecursiveMultiply;

/*
 * Recursive Multiply: 
 * Write a recursive function to multiply two positive integers 
 * without using the *operator. You can use addition, subtraction, 
 * and bit shifting, but you should minimize the number of those operations.
 */
public class RecursiveMultiply {

	static int multiplyRecursively(int num1, int num2) {

		if (num1 < num2) {
			return multiplyRecursively(num2, num1);
		} else if (num2 != 0) {
			return (num1 + multiplyRecursively(num1, num2 - 1));
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {

		int num1 = 4;
		int num2 = 7;

		System.out.println(
				"result of multiplication of " + num1 + " and " + num2 + " ==> " + multiplyRecursively(num1, num2));
	}

}
