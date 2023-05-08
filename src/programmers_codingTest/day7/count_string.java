package programmers_codingTest.day7;

public class count_string {
	public static void main(String[] args) {
		System.out.println(solution("banana", "ana"));
	}

	public static int solution(String myString, String pat) {
		int answer = 0;
		int patlength = pat.length();
		int count = 0;
		if (myString.length() < patlength)
			return answer;
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == pat.charAt(0)) {
				count = 0;
				for (int j = 0; j < pat.length(); j++) {
					if (i + j > myString.length() - 1)continue;
					if (myString.charAt(i + j) == pat.charAt(j))count++;
					if (count == patlength)answer++;
				}
			}
		}
		return answer;
	}

}
