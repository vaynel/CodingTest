package programmers_codingTest.day1_9;

import java.util.HashMap;
import java.util.Map;

public class order_coffee {
	public static void main(String[] args) {
		
	}
	
	public static int solution(String[] order) {
        int answer = 0;
        for (String coffee : order) {
			if(coffee.contains("americano")) answer+=4500;
			if(coffee.contains("cafelatte")) answer+=5000;
			if(coffee.contains("anything")) answer+=4500;
		}
        return answer;
    }
}
