package programmers_codingTest.day1_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_ad {

	public static void main(String[] args) {
		String[] strArr = new String[] {"and","notad","abcd"};
		solution(strArr);
	}
	
    public static String[] solution(String[] strArr) {
        List<String> stlist =new ArrayList<>( Arrays.asList(strArr));
        for (String string : stlist) {
			if(string.contains("ad")) {
				stlist.remove(stlist.indexOf(string));
			}
		}
        String[] answer = stlist.stream().toArray(String[]::new);
        return answer;
    }
}
