package programmers_codingTest.day1_9;

public class find_num {
	public static void main(String[] args) {
		int[]arr = {0,1,2,4,3};
		int[][]queries = {{0,4,2},{0,3,2},{0,2,2}};
		
		int[] result = solution(arr, queries);
		for (int i : result) {
			System.out.println(i);
		}

	}

	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int temp=2147483647;
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if(arr[j]>queries[i][2]) {
					temp = temp<arr[j] ? temp : arr[j];
				}
			}
			if(temp==2147483647)temp=-1;
			answer[i]=temp;	
		}
		return answer;
	}

}
