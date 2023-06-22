package programmers_codingTest.day10_19;

import java.util.ArrayList;
import java.util.List;

public class day12 {
	public static void main(String[] args) {

	}

	public static int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length - n + 1];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i + n - 1];
		}
		return answer;
	}

	public int solution(int[] num_list) {
		int answer = 0;
		if (num_list.length > 11) {
			for (int i = 0; i < num_list.length; i++) {
				answer += num_list[i];
			}
		} else {
			for (int i = 0; i < num_list.length; i++) {
				answer *= num_list[i];
			}
		}
		return answer;
	}

	// n 번째 원소까지
	public int[] solution1(int[] num_list, int n) {
		int[] answer = new int[n];
		for (int i = 0; i < n; i++) {
			answer[i] = num_list[i];
		}

		return answer;
	}

	// n 보다 커질 때까지 더하기

	public int solution2(int[] numbers, int n) {
		int answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			answer+=numbers[i];
			if(answer>n)return answer;
		}
		return answer;
	}

	//첫번째로 나오는 음수
	public int solution3(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
			if(num_list[i]<0) return i;
		}
        return -1;
    }
	
	//배열의 원소만큼 추가하기
	 public int[] solution4(int[] arr) {
	        
	        List<Integer> result = new ArrayList<Integer>();
	        for (int i = 0; i < arr.length; i++) {
	        	for (int j = 0; j < arr[i]; j++) {
	        		result.add(arr[i]);
				}
				
			}
	        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
	        return answer;
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
