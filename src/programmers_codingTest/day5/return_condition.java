package programmers_codingTest.day5;

import javax.script.ScriptException;

public class return_condition {
	public static void main(String[] args) {
		try {
			solution("<", "=", 1, 2);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int solution(String ineq, String eq, int n, int m) throws ScriptException {
		boolean result = true;
		if(ineq.equals("<")&eq.equals("=")) {
			result=(n<=m);
			return result?1:0;
		}
		if(ineq.equals("<")&eq.equals("!")) {
			result=(n<m);
			return result?1:0;
		}
		if(ineq.equals(">")&eq.equals("=")) {
			result=(n>=m);
			return result?1:0;
		}
		if(ineq.equals(">")&eq.equals("!")) {
			result=(n>m);
			return result?1:0;
		}
		return result?1:0;
	}
}
