package programmers_codingTest.day9;

public class find_string_by_long {

	public static void main(String[] args) {
		solution("AbCdEFG", "dE");
		
	}
	
	public static String solution(String myString, String pat) {
        String answer = "";
        int n = myString.lastIndexOf(pat);
        answer=myString.substring(0, n+pat.length()-1);
        return answer;
    }
}
