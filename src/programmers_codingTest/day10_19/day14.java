package programmers_codingTest.day10_19;

public class day14 {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 1, 3 };
		boolean[] flag = { true, false, true, false, false };
		//solution(arr, flag);
		
		String my_String = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		solution(my_String, indices);
		
		

	}

	// 카운트 다운
	public int[] solution(int start, int end) {
		int[] answer = new int[end - start];
		int n = 0;
		for (int i = start; i > end; i--) {
			answer[n] = i;
			n++;
		}
		return answer;
	}

	// 1로 만들기
	public int solution(int[] num_list) {
		int answer = 0;
		int temp = 0;
		for (int i : num_list) {
			while (temp != 1) {
				temp = i % 2 == 0 ? i / 2 : (i - 1) / 2;
				answer++;
			}
		}
		return answer;
	}

	// 수열과 구간 쿼리 1
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = {};
		return answer;
	}

	// 빈 배열에 추가, 삭제하기
	public static int[] solution(int[] arr, boolean[] flag) {
		int[] answer = {};
		int[] temp;
		for (int i = 0; i < arr.length; i++) {
			if (flag[i] == true) {
				temp = answer;
				answer = new int[answer.length + arr[i] * 2];
				// 이전 값 복사
				for (int j = 0; j < temp.length; j++) {
					answer[j] = temp[j];
				}
				// 값 추가
				for (int j = temp.length; j < answer.length; j++) {
					answer[j] = arr[i];
				}
			} else {
				temp = answer;
				answer = new int[answer.length - 2];
				for (int j = 0; j < answer.length; j++) {
					answer[j] = temp[j];
				}
			}
		}
		return answer;
	}

	// 글자 지우기
	public static  String solution(String my_string, int[] indices) {
		for (int i : indices) {
		
		
		}
		return my_string;
	}
	
	
	// 조건에 맞는 수열 2
	public int solution4(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
			
		}
        return answer;
    }

}
