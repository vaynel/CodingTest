package programmers_codingTest.day1_9;

public class print_string_overwrite {
	 public static void main(String[] args) {
		System.out.println(solution("Program29b8UYP","merS123",7));
		
		
		
	}
	
	 public static String solution(String my_string, String overwrite_string, int s) {
	        String answer = "";
	        String temp="";
	        answer=my_string;
	        for (int i = 0; i < my_string.length(); i++) {
	        	
	        	if(my_string.length()>(s+overwrite_string.length())) {
	        		temp = my_string.substring(s+overwrite_string.length());
	        	}
	        	
	        	if(i==s) {
	        		answer = answer.replace(my_string.substring(i), overwrite_string);
	        	}
				
			}
	        return answer+temp;
	   }   
	 
}