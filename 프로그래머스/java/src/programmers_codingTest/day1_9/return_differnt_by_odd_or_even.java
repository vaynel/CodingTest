package programmers_codingTest.day1_9;

public class return_differnt_by_odd_or_even {

	public static void main(String[] args) {
		System.out.println(solution(10));
	}

	public static int solution(int n) {
		int answer = 0;
		switch (n%2) {
		case 1:
			for (int i = 1; i <= n; i++) {
				if(i%2==1)answer+=i;
			}
			break;
		case 0:
			for (int i = 1; i <= n; i++) {
				if(i%2==0)answer+=i*i;
			}
			break;

		}
		return answer;
	}

}
