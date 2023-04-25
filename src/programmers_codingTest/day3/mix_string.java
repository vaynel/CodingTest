package programmers_codingTest.day3;

public class mix_string {
	
	public static void main(String[] args) {
		System.out.println(solution("aaaaa", "bbbbb"));
	}
	
	public static String solution(String str1, String str2) {
        String answer = "";
        int n =str1.length()>=str2.length() ? str1.length():str2.length();
        
        for (int i = 0; i < n; i++) {
			answer+=str1.charAt(i);
			answer+=str2.charAt(i);
        }
        
        return answer;
    }
}
