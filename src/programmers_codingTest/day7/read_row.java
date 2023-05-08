package programmers_codingTest.day7;

public class read_row {
	public static void main(String[] args) {
		System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
	}
	
	public static String solution(String my_string, int m, int c) {
        String answer = "";
        System.out.println(my_string.length()/m);
        for (int i = 0; i < my_string.length()/m; i++) {
        	answer+=my_string.charAt(c+(i*m)-1);
		}
        return answer;
    }
	

}
