package programmers_codingTest.day3;

public class add_more_bigger {
	public static void main(String[] args) {
		System.out.println(solution(9, 91));
	}
	
	
	public static int solution(int a, int b) {
        String temp1 = String.valueOf(a)+String.valueOf(b);
        String temp2 = String.valueOf(b)+String.valueOf(a);
        if(Integer.valueOf(temp1)>=Integer.valueOf(temp2))return Integer.valueOf(temp1);
        return Integer.valueOf(temp2);
    }    
	

}
