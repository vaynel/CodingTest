package programmers_codingTest.day7;

public class make_string {
	public static void main(String[] args) {
		String[] my_strings = { "progressive", "hamburger", "hammer", "ahocorasick" };
		int[][] parts = { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } };
		System.out.println(solution(my_strings, parts));

	}

	public static String solution(String[] my_strings, int[][] parts) {
		String answer = "";
		for (int i = 0; i < parts.length; i++) {
			System.out.println(my_strings[i].substring(parts[i][0], parts[i][1]+1));
			answer += my_strings[i].substring(parts[i][0], parts[i][1]+1);
		}

		return answer;
	}

}
