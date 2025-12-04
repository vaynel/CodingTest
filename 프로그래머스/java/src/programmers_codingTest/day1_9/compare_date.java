package programmers_codingTest.day1_9;

public class compare_date {
	
	public static void main(String[] args) {
		
	}
	
    public static int solution(int[] date1, int[] date2) {
    	for (int i = 0; i < date2.length; i++) {
    		if(date1[i]>date2[i]) return 0;
			if(date1[i]==date2[i]) continue;
			if(date1[i]<date2[i]) return 1;
		}
        return 0;
    }

}
