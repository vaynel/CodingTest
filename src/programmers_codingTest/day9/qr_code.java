package programmers_codingTest.day9;

import java.util.ArrayList;
import java.util.List;

public class qr_code {
	public static void main(String[] args) {

	}

	public String solution(int q, int r, String code) {
		String answer = "";
		for (int i = 0; i < code.length(); i++) {
			if (i % q == r)
				answer += code.charAt(i);
		}

		return answer;
	}

	public String solution(String my_string, int[] index_list) {
		String answer = "";
		for (int i = 0; i < index_list.length; i++) {
			answer += my_string.charAt(i);

		}
		return answer;
	}

	public String solution(String my_string, int[][] queries) {

		for (int i = 0; i < queries.length; i++) {
			StringBuffer sb = new StringBuffer(my_string.substring(queries[i][0], queries[i][1]+1));
			my_string = my_string.substring(0, queries[i][0])+sb.reverse().toString()+my_string.substring(queries[i][1], my_string.length());
			System.out.println(my_string);
		}
		
		return my_string;
	}

}
