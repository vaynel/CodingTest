package programmers_codingTest.day1_9;

public class line_string {
	public static void main(String[] args) {
		
	}
	public static String solution(String[] str_list, String ex) {
        String answer = "";
        for (String s : str_list) {
			if(!s.contains(ex))answer+=s;
		}
        return answer;
    }

}
