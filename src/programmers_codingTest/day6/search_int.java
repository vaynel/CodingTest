package programmers_codingTest.day6;

public class search_int {
	public static void main(String[] args) {
		
	}
	public static int solution(int[] num_list, int n) {
        for (int i : num_list) {
			if(i==n)return 1;
		}
        return 0;
    }

}
