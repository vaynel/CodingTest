package programmers_codingTest.day4;

public class return_odd_plus_even {
	public static void main(String[] args) {
		int[] num_list={3, 4, 5, 2, 1};
		System.out.println(solution(num_list));
	}

	public static int solution(int[] num_list) {
		int answer = 0;
		String tempEven="",tempOdd="";
		int n=0;
		for (int i : num_list) {
			if(i%2==0)tempOdd+=String.valueOf(i);
			else tempEven+=String.valueOf(i);
			n++;
		}
		answer=Integer.valueOf(tempEven)+Integer.valueOf(tempOdd);
		return answer;
	}
}
