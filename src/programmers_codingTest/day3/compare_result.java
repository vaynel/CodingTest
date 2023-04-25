package programmers_codingTest.day3;

public class compare_result {
	public static void main(String[] args) {
		
		System.out.println(solution(91, 2));
	}
	

    public static int solution(int a, int b) {
        int answer = 0;
        String temp = String.valueOf(a)+String.valueOf(b);
        answer = Integer.valueOf(temp)>=(2*a*b)? Integer.valueOf(temp): 2*a*b;
        return answer;
    }


}
