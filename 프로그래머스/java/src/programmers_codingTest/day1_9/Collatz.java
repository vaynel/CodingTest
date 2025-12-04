package programmers_codingTest.day1_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collatz {
	public static void main(String[] args) {
		int a[] = solution(10);
		for (int i : a) {
			System.out.print(i + ",");
		}
	}

	public static int[] solution(int n) {
		int[] answer = {};
		List<Integer> intList 
         = Arrays.stream(answer)
                 .boxed()
                 .collect(Collectors.toList());
		intList.add(n);
		while (n != 1) {
			if (n % 2 == 0)
				n = n / 2;
			else
				n = 3 * n + 1;
			intList.add(n);
		}
		int[] i = intList.stream().mapToInt(Integer::intValue).toArray(); // int 배열로
		return i;
	}
}
