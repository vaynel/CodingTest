package programmers_codingTest.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class print_even_or_odd {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		Integer n = Integer.valueOf(bf.readLine());
		if(n%2 !=0) {
			System.out.println(n +" is odd");
		}
		else {
			System.out.println(n +" is even");
		}
	}
}
