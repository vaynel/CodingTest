package programmers_codingTest.day1_9;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class string_to_int {
	public static void main(String[] args) {

	}

	public static int solution(String binomial) throws ScriptException {
		int answer = 0;
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");

		answer = (int) engine.eval(binomial);

		return answer;
	}

}
