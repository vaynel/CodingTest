package programmers_codingTest.day1_9;

import java.util.Arrays;
import java.util.List;

public class split_ {
	public static void main(String[] args) {
		System.out.println(solution("i    love  you"));
	}

	public static String[] solution(String my_string) {
		my_string = my_string.replace(" ", "1");
        String[] answer = my_string.split("1");
        System.out.println(my_string);
        List<String> list = Arrays.asList(answer);
        for (int i = 0; i < list.size(); i++) {
        	System.out.println(list.get(i));
			if(list.get(i)==" "|list.get(i)=="") {
				System.out.println(1);
				list.remove(list.get(i));
			}
		}
        System.out.println(list);
        String[] array = list.stream().toArray(String[]::new);
        return array;
    }
}
