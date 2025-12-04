package programmers_codingTest.day1_9;

public class resolve_code {
	public static void main(String[] args) {
		System.out.println(solution("abc1abc1abc"));
	}

	public static String solution(String code) {
		String answer = "";
		int mode = 0;
		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '1') {
				mode = mode == 1 ? 0 : 1;
				continue;
			}
				
			switch (mode) {
			case 0:
				if(i%2==0)answer+=code.charAt(i);
				break;
			case 1:
				if(i%2==1)answer+=code.charAt(i);
				break;
			}
			

		}
		return answer!=""?answer:"EMPTY";
	}
}
