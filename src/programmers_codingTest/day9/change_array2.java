package programmers_codingTest.day9;

public class change_array2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 100, 99, 98 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		int answer = 0;
		int[] temp = arr;
		do  {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < 50 & arr[i] % 2 == 1)
					arr[i] = arr[i] * 2 + 1;
				if (arr[i] >= 50 & arr[i] % 2 == 0)
					arr[i] = arr[i] / 2;
			}
			answer++;
			if(temp.equals(arr))break;
		}while(temp==arr);
		
	

		return answer;
	}

}
