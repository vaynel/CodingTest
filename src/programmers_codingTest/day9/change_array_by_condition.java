package programmers_codingTest.day9;

public class change_array_by_condition {
	public static void main(String[] args) {

	}

	public static int[] solution(int[] arr, int k) {
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(k%2==1) answer[i]=arr[i]*k;
			else answer[i]=arr[i]+k;
		}
		return answer;
	}

}
