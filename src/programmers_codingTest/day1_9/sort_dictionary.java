package programmers_codingTest.day1_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort_dictionary {
	public static void main(String[] args) {
		solution("banana");
	}

	public static String[] solution(String my_string) {
		
		List<String> result = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i++) {
			result.add(my_string.substring(i, my_string.length()));
		}
		Collections.sort(result);
		String[] answer = result.stream().toArray(String[]::new);
		return answer;
	}
}
