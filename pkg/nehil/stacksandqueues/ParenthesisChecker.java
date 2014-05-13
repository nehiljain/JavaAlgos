package pkg.nehil.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;

//this is the client code using deque in collections api 
public class ParenthesisChecker {
	private enum PARANTHESIS {

		LP('('), RP(')'), LCB('{'), RCB('}'), LSB('['), RSB(']');

		char symbol;

		PARANTHESIS(Character symbol){
			this.symbol = symbol;
		}

		char getSymbol() {
			return this.symbol;
		}
	}
	final Deque<Character> paranthesisStack = new ArrayDeque<Character>();

	public boolean isBalancedExp(String s) {

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == PARANTHESIS.LP.getSymbol() ||
				ch == PARANTHESIS.LSB.getSymbol() ||
				ch == PARANTHESIS.LCB.getSymbol()) {

				paranthesisStack.push(ch);
			}
			else if (ch == PARANTHESIS.RP.getSymbol()) {
				if (paranthesisStack.isEmpty() || 
					paranthesisStack.pop() != PARANTHESIS.LP.getSymbol()) {

					return false;
				}
			}
			else if (ch == PARANTHESIS.RSB.getSymbol()) {
				if (paranthesisStack.isEmpty() || 
					paranthesisStack.pop() != PARANTHESIS.LSB.getSymbol()) {
					return false;
				}
			}
			else if (ch == PARANTHESIS.RCB.getSymbol()) {
				if (paranthesisStack.isEmpty() ||
					paranthesisStack.pop() != PARANTHESIS.LCB.getSymbol()) {

					return false;
				}
			}
		}
		return paranthesisStack.isEmpty();
	}

}