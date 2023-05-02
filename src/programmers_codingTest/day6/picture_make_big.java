package programmers_codingTest.day6;

import java.util.ArrayList;
import java.util.List;

public class picture_make_big {
	public static void main(String[] args) {
		String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
		solution(picture, 3);
	}
	
	public static String[] solution(String[] picture, int k) {
		List<String> result = new ArrayList<String>();
		
		for (String s : picture) {
			String temp="";
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < k; j++) {
					temp+=s.charAt(i);
				}
			}
			System.out.println(temp);
			result.add(temp);
		}
        return (String[]) result.toArray();
    }

}
