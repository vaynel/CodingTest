package programmers_codingTest.day10_19;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class day11 {
	public static void main(String[] args) {
		String[] strArr = {"a","d","efg"};
		solution(strArr);
		
	}
	
	public String solution(String n_str) {
        String answer = String.valueOf(Integer.valueOf(n_str));
        return answer;
    }
	
	public static int solution(String[] strArr) {
        List<Integer> count = new ArrayList<Integer>();
        for (int i = 0; i < strArr.length; i++) {
			if(count.size()<=strArr[i].length()) {
				for (int j = count.size(); j <= strArr[i].length(); j++) {
					count.add(0);
				}
			}
			count.set(strArr[i].length(), count.get(strArr[i].length())+1);
			
		}
        System.out.println(count);
        return  Collections.max(count);
    }
	
	public int[] solution(int[] arr) {
        
        int n=2;
        while (arr.length<=n) {
			n*=2;
		}
        int[] answer = new int[n];
        for (int i = 0; i < answer.length; i++) {
			if(i<arr.length)answer[i]=arr[i];
			else answer[i]=0;
		}
        return answer;
    }
	
	public String solution(String a, String b) {
		 BigInteger c = new BigInteger(a);
		 BigInteger d = new BigInteger(b);
         String answer = String.valueOf(c.add(d));
        return answer;
    }
	
	
	public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> mapresult = new HashMap<Integer, Integer>();
        for (int i = 0; i < rank.length; i++) {
        	if(attendance[i]) {
        		mapresult.put(rank[i],i);
        	}
		}
        List<Map.Entry<Integer, Integer>> entries =
        		mapresult.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList());	
        Entry<Integer, Integer> a = entries.get(0);
        Entry<Integer, Integer> b = entries.get(1);
        Entry<Integer, Integer> c = entries.get(2);
        return 10000*a.getValue()+100*b.getValue()+c.getValue();
    }

}
