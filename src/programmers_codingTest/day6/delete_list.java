package programmers_codingTest.day6;

import java.util.Arrays;

public class delete_list {
	public static void main(String[] args) {
		int[] arr = { 293, 1000, 395, 678, 94 };
		int[] delete_list = { 94, 777, 104, 1000, 1, 12 };
		System.out.println(solution(arr, delete_list));
	}

	public static int[] solution(int[] arr, int[] delete_list) {
		for (int i : arr) {
			for (int j : delete_list) {
				if (i == j)
					arr = Arrays.stream(arr).filter(n -> n != i).toArray();
			}
		}
		return arr;
	}

	public static int[] removeElement(int[] arr, int item) {
		return Arrays.stream(arr).filter(i -> i != item).toArray();
	}

}
