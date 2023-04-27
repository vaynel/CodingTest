package programmers_codingTest.day5;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
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

	public static boolean solution(String ineq, String eq, int n, int m) throws ScriptException {
		ScriptEngineManager s = new ScriptEngineManager();
		ScriptEngine engine = s.getEngineByMimeType("JavaScript");
		System.out.println((String)(n + ineq + eq + m));
		boolean aa=(boolean) engine.eval((String)(n + ineq + eq + m));
		System.out.println(aa );

		return (boolean) engine.eval(n + ineq + eq + m);
	}
}
