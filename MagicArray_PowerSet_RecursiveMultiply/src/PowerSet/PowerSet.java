package PowerSet;

/*
 *  Power Set: Write a method to return all subsets of a set.
 */
public class PowerSet {

	static void findPowerSet(String str, int index, String current) {

		int length = str.length();

		if (index == length) {
			System.out.println(current);
			return;
		}

		findPowerSet(str, index + 1, current + str.charAt(index));
		findPowerSet(str, index + 1, current);

	}

	public static void main(String[] args) {

		String str = "abcde";
		int index = 0;
		String current = "";

		findPowerSet(str, index, current);
	}

}
