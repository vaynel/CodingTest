package programmers_codingTest.day1_9;

public class reverse_string {
	public static void main(String[] args) {
		System.out.println(solution("Stanley1yelnatS", 4, 10));
	}

	public static String solution(String my_string, int s, int e) {
		String answer = "";
		StringBuffer sb = new StringBuffer(my_string.subSequence(s, e));
		
		String temp =sb.reverse().toString(); 
		answer=my_string.substring(0, s)+temp+my_string.substring(e+1, my_string.length());
		return answer;
	}

}
