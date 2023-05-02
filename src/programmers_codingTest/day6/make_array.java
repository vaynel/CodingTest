package programmers_codingTest.day6;

import java.util.ArrayList;
import java.util.List;

public class make_array {
	public static void main(String[] args) {

	}

	public static int[] solution(int[] arr, int[][] intervals) {
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < intervals.length; i++) {
			for (int j = intervals[i][0]; j < intervals[i][1]; j++) {
				intList.add(arr[j]);
			}
		}
		
		int[] result = intList.stream().mapToInt(Integer::intValue).toArray(); // int 배열로
		return result;
	}

}
