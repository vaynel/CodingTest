package programmers_codingTest.Lv1;

public class _0623 {
	public static void main(String[] args) {
		System.out.println(solution2(118372));
	}

	// 문자열 내 p와 y의 개수
	boolean solution(String s) {
		boolean answer = true;
		int p_count = 0;
		int y_count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
				p_count++;
			else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
				y_count++;
		}
		answer = (p_count == y_count);
		return answer;
	}

	// 정수 제곱근 판별
	public long solution(long n) {
		long answer = 0;
		while (answer * answer < n) {
			answer++;
			if (answer * answer == n)
				return (answer + 1) * (answer + 1);
		}
		return -1;
	}

	// 문자열을 정수로 만들기
	public int solution1(String s) {
		int answer = 0;
		answer = Integer.valueOf(s);
		return answer;
	}

	// 정수 내림차순으로 저리하기
	public static long solution2(long n) {
		long answer = 0;
		// 순서대로 리스트에 넣기
		int[] sort_list = new int[String.valueOf(n).length()];
		for (int i = 0; i < sort_list.length; i++) {
			sort_list[i] = (int) (n % 10);
			n /= 10;
		}
		// 버블 sort
		for (int i = 0; i < sort_list.length; i++) {
			for (int j = 1; j < sort_list.length; j++) {
				if (sort_list[j - 1] > sort_list[j]) {
					int temp = sort_list[j];
					sort_list[j] = sort_list[j - 1];
					sort_list[j - 1] = temp;
				}
			}
		}
		// 원하는 숫자로 만들기
		for (int i = 0; i < sort_list.length; i++) {
			answer += sort_list[i] * Math.pow(10, i);
		}
		return answer;
	}

	// 하샤드 수
	public boolean solution(int x) {
		boolean answer = true;
		int n = 0;
		int temp = x;
		while (x > 0) {
			n += x % 10;
			x = x / 10;
		}
		answer = temp % n == 0 ? true : false;
		return answer;
	}

	// 두 정수의 합
	public long solution(int a, int b) {
		long answer = 0;
		int temp = 0;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i < b + 1; i++) {
			answer += i;

		}
		return answer;
	}

	// 콜라츠 추측
	public int solution3(int num) {
		int answer = 0;
		while (answer <= 500) {
			if (num % 2 == 0)
				num /= 2;
			else
				num = num * 3 + 1;

			if (num == 1)
				break;
			answer++;
		}
		return answer == 500 ? -1 : answer;
	}

	// 서울에서 김서방 찾기
	public String solution(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim"))
				return "김서방은 " + i + "에 있다";
		}
		return answer;
	}

	// 나누어 떨어지는 숫자 배열
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int idx = 0;
		for (int i : arr) {
			if (i % divisor == 0) {
				int[] temp = answer;
				answer = new int[answer.length + 1];
				for (int j = 0; j < temp.length; j++) {
					answer[j] = temp[j];
				}
				answer[idx] = i;
				idx++;
			}
		}

		// 버블 sort
		for (int i = 0; i < answer.length; i++) {
			for (int j = 1; j < answer.length; j++) {
				if (answer[j - 1] > answer[j]) {
					int temp = answer[j];
					answer[j] = answer[j - 1];
					answer[j - 1] = temp;
				}
			}
		}
		return answer.length != 0 ? answer : new int[] { -1 };
	}

	// 음양 더하기
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < signs.length; i++) {
			if (signs[i])
				answer += absolutes[i];
			else
				answer -= absolutes[i];
		}
		return answer;
	}

	// 핸드폰 번호 가리기
	public String solution4(String phone_number) {
		String answer = "";
		return answer;
	}

}
