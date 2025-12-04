package programmers_codingTest.Lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _0626 {

	public static void main(String[] args) {
		solution3("a234");
	}

	// 휴대폰 가리기
	public String solution(String phone_number) {
		String answer = "";
		for (int i = 0; i < phone_number.length(); i++) {
			if (phone_number.length() - i > 4)
				answer += "*";
			else
				answer += phone_number.charAt(i);
		}
		return answer;
	}

	// 없는 숫자 더하기
	public int solution(int[] numbers) {
		int answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
		return 55 - answer;
	}

	// 제일작은 수 제거하기
	public int[] solution1(int[] arr) {
		if (arr.length == 1)
			return new int[] { -1 };
		int[] answer = new int[arr.length - 1];
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				min = Math.min(arr[i], arr[j]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				min = i;
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < min)
				answer[i] = arr[i];
			else if (i > min)
				answer[i - 1] = arr[i];
		}
		return answer;
	}

	// 가운데 글자 반환하기
	public static String solution2(String s) {
		if (s.length() % 2 == 0)
			return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		else
			return s.substring(s.length() / 2, s.length() / 2);
	}

	// 수박수박수박수박수
	public String solution(int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				answer += "수";
			else
				answer += "박";
		}
		return answer;
	}

	// 내적
	public int solution(int[] a, int[] b) {
		int answer = 0;
		for (int i = 0; i < b.length; i++) {
			answer += a[i] * b[i];
		}
		return answer;
	}

	// 약수의개수와 덧샘
	public static int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i < right + 1; i++) {
			int count = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					count++;
			}
			if ((count + 1) % 2 == 0)
				answer += i;
			else
				answer -= i;
			count = 0;
		}
		return answer;
	}

	// 문자열 내림차순으로 배치하기
	public static String solution4(String s) {
		String answer = "";
		List<Integer> s_to_asc = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			s_to_asc.add((int) s.charAt(i));
		}
		s_to_asc.sort(Comparator.reverseOrder());
		for (int i = 0; i < s_to_asc.size(); i++) {
			answer += Character.toString(s_to_asc.get(i));
		}
		return answer;
	}

	// 부족한 금액 계산하기
	public long solution(int price, int money, int count) {
		long answer = 0;
		for (int i = 1; i <= count; i++) {
			answer += price * i;
		}
		return answer - money;
	}

	// 문자열 다루기
	public static boolean solution3(String s) {
		boolean answer = false;
		if (s.length() == 4 | s.length() == 6) {
			for (char c : s.toCharArray()) {
				if ((int) c < 48 | (int) c > 57)
					return false;
			}
			return true;
		}
		return answer;
	}

	// 행렬의 덧셈
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[1].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}

	// 별그리기
	public String solution3(int a, int b) {
		String answer = "";
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		return answer;
	}

	// 최대공약수와 최소공배수
	public int[] solution5(int n, int m) {
		int[] answer = new int[2];
		int r=1;
		int a =n,b=m;
		while(a % b != 0) {
			  r = a % b;
		        a = b;
		        b = r;
		}
		answer[0]=r;
		answer[1]=n*m/r;
		
		return answer;
	}

}
