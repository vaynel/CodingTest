package programmers_codingTest.day1_9;

public class sequence3 {
	public static void main(String[] args) {

	}

	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = {};
		for (int i = 0; i < queries.length; i++) {
			int temp = arr[queries[i][0]];
			arr[queries[i][0]] = arr[queries[i][1]];
			arr[queries[i][1]] = temp;
			
		}
		
		return arr;
	}

}
