package programmers_codingTest.day1_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_plus_b {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		String str = bf.readLine();
		String[] t = str.split(" ");
		
		int a = Integer.valueOf(t[0]);
		int b =Integer.valueOf(t[1]);
		System.out.println(a +" + " +b +" = " +(a+b));
	}

}
