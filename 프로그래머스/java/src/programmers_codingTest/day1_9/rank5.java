package programmers_codingTest.day1_9;

import java.util.Arrays;

public class rank5 {

	public static void main(String[] args) {

	}

	public static int[] solution(int[] num_list) {
		int[] answer = new int[5];
		Arrays.sort(answer);
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}

	public int solution(String num_str) {
		int answer = 0;
		for (char c : num_str.toCharArray()) {
			answer += Integer.valueOf(String.valueOf(c));
		}
		return answer;
	}

	public int[] solution(int[] arr, int n) {
		switch (arr.length % 2) {
		case 1:
			for (int i = 0; i < arr.length; i++) {
				if(i%2==0)arr[i]+=n;
			}

			break;
		case 0:
			for (int i = 0; i < arr.length; i++) {
				if(i%2==1)arr[i]+=n;
			}

			break;
		}
		return arr;
	}

}
