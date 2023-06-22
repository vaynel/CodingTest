package programmers_codingTest.day10_19;

public class day13 {
	public static void main(String[] args) {

	}

	// 배열 만들기 1
	public int[] solution(int n, int k) {
		int[] answer = new int[(int) n / k];
		for (int i = 0; i < n / k; i++) {
			answer[i] = i * k;
		}
		return answer;
	}

	// n개 간격의 원소들
	public int[] solution(int[] num_list, int n) {
		int[] answer;
		int m = 0;
		if (num_list.length % n != 0)
			answer = new int[num_list.length / n + 1];
		else
			answer = new int[num_list.length / n];

		for (int i = 0; i < num_list.length; i += n) {
			answer[m] = num_list[i];
			m++;
		}
		return answer;
	}

	// 짝수 vs 홀수
	public int solution(int[] num_list) {
		int answer = 0;
		int odd = 0;
		int even = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0)
				odd += num_list[i];
			else
				even += num_list[i];
		}
		return Math.max(odd, even);
	}

	// 조건에 맞게 수열 변환하기 1
	public int[] solution1(int[] arr) {
		int[] answer = new int[arr.length];
		for (int i = 0; i < answer.length; i++) {
			if (arr[i] >= 50 & arr[i] % 2 == 0)
				answer[i] = arr[i] / 2;
			else if (arr[i] < 50 & arr[i] % 2 == 1)
				answer[i] = arr[i] * 2;
			else
				answer[i] = arr[i];
		}
		return answer;
	}

	// 순서바꾸기1
	public int[] solution2(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
		for (int i = 0; i < answer.length; i++) {
			if (i + n < num_list.length)
				answer[i] = num_list[n + i];
			else
				answer[i] = num_list[Math.abs(num_list.length - i - n)];
		}

		return answer;
	}

	// 5명씩
	// 런타임 에러 이유 모름
	public String[] solution(String[] names) {

		int size = names.length / 5 == 0 ? names.length / 5 : names.length / 5 + 1;
		String[] answer = new String[size];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = names[i * 5];
		}
		return answer;
	}

	// 할 일 목록
	public String[] solution(String[] todo_list, boolean[] finished) {
		int n = 0;
		for (boolean b : finished) {
			if (b == false)
				n++;
		}
		String[] answer = new String[n];
		n = 0;
		for (int i = 0; i < todo_list.length; i++) {
			if (finished[i] == false) {
				answer[n] = todo_list[i];
				n++;
			}

		}
		return answer;
	}

	// 가까운 1찾기
	public int solution3(int[] arr, int idx) {
		int answer = 0;
		for (int i = idx; i < arr.length; i++) {
			if(arr[i]==1) return i;
		}
		return -1;
	}

}
