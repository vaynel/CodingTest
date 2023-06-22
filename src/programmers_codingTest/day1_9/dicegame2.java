package programmers_codingTest.day1_9;

public class dicegame2 {
	
	public static void main(String[] args) {
		System.out.println(solution(2, 6, 1));
		System.out.println(solution(5, 3, 3));
		System.out.println(solution(4, 4, 4));
	}
	public static int solution(int a, int b, int c) {
        if(a==b&b==c)return (a+b+c)*(a*a+b*b+c*c)*(int)(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));
        if(a==b|a==c|b==c) return (a+b+c)*(a*a+b*b+c*c);        
        return (a+b+c);
    }
	
}
