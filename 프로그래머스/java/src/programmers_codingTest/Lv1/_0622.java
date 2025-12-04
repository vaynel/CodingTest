package programmers_codingTest.Lv1;

public class _0622 {
	public static void main(String[] args) {

		System.out.println(solution11(12345));
	}

	// 자릿수 더하기
	public int solution1(int n) {
		int answer = 0;
		String num = String.valueOf(n);
		for (int i = 0; i < num.length(); i++) {
			answer += Integer.valueOf(num.charAt(i) - 48);
		}
		return answer;
	}

	// 짝수와 홀수 문제
	public String solution2(int num) {
		String answer = num % 2 == 0 ? "짝수" : "홀수";
		return answer;
	}

	// 약수의 합
	public static int solution3(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				answer += i;
		}
		return answer;
	}

	// 나머지가 1이 되는 수 찾기
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 1)
				return i;
		}
		return answer;
	}

	// x만큼 간격이 있는 n개의 숫자
	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1);
		}
		return answer;
	}

	// 평균구하기
	public double solution(int[] arr) {
		double answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer / arr.length;
	}

	// 자연수 뒤집어 배열로 만들기
	public static int[] solution11(long n) {
		int j = 0;
		long temp = n;
		while (temp > 0) {
			temp /= 10;
			j++;
		}
		int[] answer = new int[j];

		int i = 0;
		while (n > 0) {
			answer[i] = (int) (n % 10);
			n /= 10;
			i++;
		}
		return answer;
	}

}
