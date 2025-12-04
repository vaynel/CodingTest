package programmers_codingTest.day1_9;

public class print_stringLIst_to_string {
	public static void main(String[] args) {
		
		String[] arr=new String[3]; 
		arr[0]="a";
		arr[1]="b";
		arr[2]="c";
		String result="";
		
		for (int i = 0; i < arr.length; i++) {
			result+=arr[i];
		}
		System.out.println(String.join("", arr));
		
	}

}
