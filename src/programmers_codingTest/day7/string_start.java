package programmers_codingTest.day7;

import java.util.ArrayList;
import java.util.List;

public class string_start {
	public static void main(String[] args) {
		solution2("abcd");
		
	}
	public static int solution1(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.substring(0, is_prefix.length()).equals(is_prefix))return 1;
        return answer;
    }
	
	
	public static String[] solution2(String myStr) {
		myStr=myStr.replace("b", "a");
		myStr=myStr.replace("c", "a");
		String[] answer = myStr.split("a");
		List<String> result = new ArrayList<>();
		for (String string : answer) {
			if(!string.equals("")) result.add(string);
		}
		if(result.size()==0)result.add("EMPTY");
        return result.toArray(new String[result.size()]);
    }

}
