package programmers_codingTest.day1_9;

import java.util.ArrayList;
import java.util.List;

public class string_upper_lower {
	public static void main(String[] args) {
		String[] strArr = {"AAA","BBB","CCC","DDD"};
		System.out.println(solution(strArr));
	}

	public static String[] solution(String[] strArr) {
		List<String> result = new ArrayList<String>();
		String[] answer = {};
		int n=0;
		for (String s : strArr) {
			if(n%2==0)result.add(s.toLowerCase());
			else result.add(s.toUpperCase());
		}
		answer = result.toArray(new String[result.size()]);
		return answer;
	}

}
