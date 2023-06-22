package programmers_codingTest.day1_9;

public class uppercase_ {
	public static void main(String[] args) {
		solution("programmers",	"p");
	}

	public static String solution(String my_string, String alp) {
		String temp = alp.toUpperCase();
		String answer = my_string.replace(alp, temp);
		return answer;
	}

}
