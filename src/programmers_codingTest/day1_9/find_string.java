package programmers_codingTest.day1_9;

public class find_string {
	public static void main(String[] args) {
		System.out.println(solution("aaAA", "aaaaa"));
	}
	
	public static int solution(String myString, String pat) {
        int answer = 0;
        if(myString.length()<pat.length())return 0;
        for (int i =0; i<myString.length();i++) {
        	if(myString.charAt(i)==pat.charAt(0)) {
        		for (char p : pat.toCharArray()) {
					
				}
        	}
		}
        
        return answer;
    }

}
