package FindingUniqueCharacterProblem;
import java.util.Arrays;

public class FindUnique {
	public static boolean findIfUnique(String s) {
		char[] chArr = s.toCharArray();
		Arrays.sort(chArr);

		for(int i=0;i<chArr.length-1; i++) {
			if(chArr[i] == chArr[i+1])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String input = "Abdfdse";
		boolean res = findIfUnique(input);
		if(res) {
			System.out.println("The given string has all Unique character");
		}
		else
			System.out.println("The given string is not unique");
	}
}
