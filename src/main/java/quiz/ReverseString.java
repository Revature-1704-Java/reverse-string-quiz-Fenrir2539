package quiz;

/*
public class ReverseString {
    public String reverse(String input) {
        return new StringBuffer(input).reverse().toString();
    }
*/

public class ReverseString {
	public String reverse(String input) {
		//Turn input string into an easily traversable char array
		char[] ogString = input.toCharArray();
		//A String Builder to make the reversed string one char at a time
		StringBuilder reversedStringB = new StringBuilder();
		//Start at the end of the char array (length-1) place each char into StrBuilder
		for (int i = ogString.length-1; i>=0; i--) {
			reversedStringB.append(ogString[i]);
		}
		//Turn the Builder into a string
		String output = reversedStringB.toString();
		return output;
	}

}