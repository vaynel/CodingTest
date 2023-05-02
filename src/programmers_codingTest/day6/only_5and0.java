package programmers_codingTest.day6;

import java.util.ArrayList;
import java.util.List;

public class only_5and0 {
	public static void main(String[] args) {
		solution(10,51);

	}

	public static int[] solution(int l, int r) {
		List<Integer> intList = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			if (i % 5 != 0) continue;
			int n=1;
			
			
		}
		System.out.println(intList);
		
		int[] result = intList.stream().mapToInt(Integer::intValue).toArray(); // int 배열로
		return result;
	}

}
