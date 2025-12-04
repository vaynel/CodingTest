package programmers_codingTest.day1_9;

public class beforeI {
	public static void main(String[] args) {
		solution("abcdevwxyz");
	}

	public static String solution(String myString) {
		for (int i = 0; i < myString.length(); i++) {
			if(myString.charAt(i)<108) {
				System.out.println(myString.charAt(i));
				myString= myString.replace(myString.charAt(i), 'I');
			}
		}
		return myString;
	}

}
