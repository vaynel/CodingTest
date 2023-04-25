package programmers_codingTest.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class print_aToA {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		String str = bf.readLine();
        String result="";
		for (int i = 0; i < str.length(); i++) {
			char temp;
			//A=65 , Z = 90, a = 97, z = 122
			if(Integer.valueOf(str.charAt(i))>=65 & Integer.valueOf(str.charAt(i))<= 90) {
				result+=(char) (str.charAt(i)+32);
			}
			else {
				result+=(char) (str.charAt(i)-32);
			}
			
		}
		System.out.println(result);
	}
}
