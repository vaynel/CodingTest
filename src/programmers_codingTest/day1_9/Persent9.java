package programmers_codingTest.day1_9;

public class Persent9 {
	public static void main(String[] args) {
		System.out.println(solution("78720646226947352489"	));
	}

	public static int solution(String number) {
		int n = 0;
		try {
			int answer = Integer.parseInt(number) % 9;
			return answer;
		} catch (Exception e) {
			for (int i = 0; i < number.length(); i++) {
				System.out.println((int) number.charAt(i)+":"+n);
				n +=number.charAt(i)-48;

			}
			System.out.println(n);
			return n % 9;
		}

	}

}
