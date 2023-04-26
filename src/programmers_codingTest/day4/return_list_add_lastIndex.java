package programmers_codingTest.day4;

import java.util.Arrays;

public class return_list_add_lastIndex {
	public static void main(String[] args) {
		int[] num_list={3, 4, 5, 2, 1};
		System.out.println(solution(num_list));
	}
	
	public static int[] solution(int[] num_list) {
        int[] answer = {};
        int lastIndex = num_list.length-1;
        num_list=Arrays.copyOf(num_list, num_list.length+1);
        
        if(num_list[lastIndex]>num_list[lastIndex-1])num_list[num_list.length-1]=num_list[lastIndex]-num_list[lastIndex-1];
        else num_list[num_list.length-1]=num_list[lastIndex]*2;
        
        return answer;
    }

}
