package programmers_codingTest.day7;

import java.util.ArrayList;
import java.util.List;

public class count_between_x {
	public static void main(String[] args) {
		System.out.println(solution("oxooxoxxox"));
	}

	public static int[] solution(String myString) {
		int[] answer = {};
		List<Integer> result = new ArrayList<>();
		int count = 0;
		for (char c : myString.toCharArray()) {
			if(c=='x') {
				result.add(count);
				count=0;
				continue;
			}
			count++;
		}
		result.add(count);
		
		return  result.stream().mapToInt(i->i).toArray();
	}

}
