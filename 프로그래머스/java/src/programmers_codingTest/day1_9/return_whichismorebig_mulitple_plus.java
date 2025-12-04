package programmers_codingTest.day1_9;

public class return_whichismorebig_mulitple_plus {

	public static void main(String[] args) {
		
		int[] num_list={5, 7, 8, 3};
		
		System.out.println(solution(num_list));
		
	}
	public static int solution(int[] num_list) {
        int temp1=1;
        for (int i = 0; i < num_list.length; i++) {
			temp1*=num_list[i];
		}
        int temp2=0;
        for (int i = 0; i < num_list.length; i++) {
			temp2+=num_list[i];
		}
        temp2=temp2*temp2;
        
        
        
        return temp1<=temp2? 1: 0;
    }
}
