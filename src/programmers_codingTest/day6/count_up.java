package programmers_codingTest.day6;

public class count_up {
	public static void main(String[] args) {
		System.out.println(solution(1, 3));
	}
	public static int[] solution(int start, int end) {
        int[] answer = new int[end-start];
        int n=0;
        for (int i = start; i < end; i++) {
        	answer[n]=i;
        	n++;
			
		}
        return answer;
    }

}
