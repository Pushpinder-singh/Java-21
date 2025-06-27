package Codility;

public class StringProblem {

	
	// no three consecutive characters are the same.
	    public static String solution(int A, int B) {
	        StringBuilder sb = new StringBuilder();

	        // While either 'a' or 'b' is remaining
	        while (A > 0 || B > 0) {
	            int len = sb.length();

	            // Check the last two characters to avoid 3 in a row
	            boolean writeA = false;

	            if (A > B) {
	                // Prefer 'a' when more a's are left
	                writeA = !(len >= 2 && sb.charAt(len - 1) == 'a' && sb.charAt(len - 2) == 'a');
	            } else if (B > A) {
	                // Prefer 'b' when more b's are left
	                writeA = (len >= 2 && sb.charAt(len - 1) == 'b' && sb.charAt(len - 2) == 'b');
	            } else {
	                // Equal a and b, alternate
	                writeA = !(len >= 2 && sb.charAt(len - 1) == 'a' && sb.charAt(len - 2) == 'a');
	            }

	            if (writeA && A > 0) {
	                sb.append('a');
	                A--;
	            } else if (B > 0) {
	                sb.append('b');
	                B--;
	            }
	        }

	        return sb.toString();
	    }


	public static void main(String[] args) {


        System.out.println(solution(5, 3)); // Example: "aabaabab"
        System.out.println(solution(3, 3)); // Example: "ababab"
        System.out.println(solution(1, 4)); // Example: "bbabb"
	}

}
