package programmers_codingTest.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class print_string_without_space {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		String str = bf.readLine();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			
		}
	}
}
