package programmers_codingTest.day1_9;

import java.util.ArrayList;
import java.util.List;

public class make_array {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5, 3 };
		solution(arr);

	}

	public static int[] solution(int[] arr) {
		List<Integer> stklist = new ArrayList<Integer>();
		int i = 0;
		while (i < arr.length) {
			if (stklist.size() == 0) {
				stklist.add(arr[i]);
				i++;
			} else if (stklist.get(stklist.size() - 1) < arr[i]) {
				stklist.add(arr[i]);
				i++;
			} else if (stklist.get(stklist.size() - 1) >= arr[i])
				stklist.remove(stklist.size() - 1);

		}

		int[] stk = stklist.stream().mapToInt(j -> j).toArray();
		return stk;
	}

}
