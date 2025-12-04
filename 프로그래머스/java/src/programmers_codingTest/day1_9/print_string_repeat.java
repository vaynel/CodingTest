package programmers_codingTest.day1_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class print_string_repeat {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		String str = bf.readLine();
		String[] t = str.split(" ");
		
		String a = t[0];
		int n =Integer.valueOf(t[1]);
		for (int i = 0; i <n; i++) {
			System.out.print(a);
		}
	}

}
