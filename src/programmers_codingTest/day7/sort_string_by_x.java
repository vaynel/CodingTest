package programmers_codingTest.day7;

import java.util.Arrays;

public class sort_string_by_x {
	public static void main(String[] args) {
		solution("dxccxbbbxaaaa");
	}
    public static String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        return answer;
    }	

}
