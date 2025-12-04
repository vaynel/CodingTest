package programmers_codingTest.day1_9;

public class find_string_change {

	public static void main(String[] args) {
		System.out.println(solution1("abstract algebra"));
	}

	public static int solution(String myString, String pat) {
		int answer = 0;
		String result="";
		for (int i = 0; i < myString.length(); i++) {
			if(myString.charAt(i)=='A') result+="B";
			else result+="A";
			
		}
		return result.contains(pat)?1:0;
	}
	
	public static String solution1(String myString) {
        String answer = "";
        for (char c : myString.toCharArray()) {
			if(c=='a') System.out.println(1);
		}
        
        
        for (int i = 0; i < myString.length(); i++) {
        	char temp = myString.charAt(i);
        	System.out.println(temp);
        	if(temp=='a'|temp==97)answer+=String.valueOf(temp).toUpperCase();
        	else answer+=String.valueOf(temp).toLowerCase();
			
		}
        return answer;
    }
}
