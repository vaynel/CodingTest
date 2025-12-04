package programmers_codingTest.day1_9;

import java.util.Arrays;

public class arithmetic_sequence {

	public static void main(String[] args) {
	}

	public static int solution(int a, int d, boolean[] included) {
		int answer = 0;
		int n=1;
		for (boolean b : included) {
			if(b==true)answer+=a+(n-1)*d;
			n++;
		}
		
		return answer;
	}
}
