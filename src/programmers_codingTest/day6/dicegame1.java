package programmers_codingTest.day6;

public class dicegame1 {
	public static void main(String[] args) {
		
	}
	
	public static int solution(int a, int b) {
        int answer = 0;
        if((a+b)%2==0& a%2==1) {
        	return a*a+b*b;
        }
        if((a+b)%2==1)return 2*(a+b);
        if((a+b)%2==0&a%2==0)return Math.abs(a-b);
        return answer;
    }

}
