package com.api.cucumber;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("serial")
		ArrayList<String> data = new ArrayList<String>() {
			{
				add("((A & (C & B)) | ! (  B & C)) ");
				add("!a");
				add("A | B");
				add("A & B");
				add("((A & B) | C)");
				add("!(A & B)");
				add("b | (g & ((c | f) & (h | j)) )");
				add("(((!b & a ) | c) & !g) | (g & ((c | f) & (h | j)) )");
				add("(A & B)");
				//add("& b");
				//add(" | a");
				add("(AA)");
				add("!A & !B & !C & !D & !E & !F & !G");
				add("A | ((B & C)) | (D & ((E & RH1 & RH2 & RH3) | E1))  | (F & ((G & RH1 & RH2) | G1)) | H | I");

			}
		};

		App obj = new App();

		for (String expression : data) {
			obj.processExpression(expression.trim());
		}

	}

	public void processExpression(String expression) {
		if (expression.length() == 1) {
			if (!isLabel(expression.charAt(0)))
				throw new RuntimeException("Invalid Expression" + expression.charAt(0) + "   " + expression);
		}
		for (int mCurrentPos = 0; mCurrentPos < expression.length(); mCurrentPos++) {
			char currentChar = expression.charAt(mCurrentPos);

			if (currentChar == '!') {
				int mNextPos = mCurrentPos + 1;
				if (mNextPos >= expression.length())
					throw new RuntimeException("Invalid Expression " + expression);
				validateSubsequentExpression(expression, mNextPos);
			}

			if (currentChar == '&' || currentChar == '|') {
				int backPosition = mCurrentPos - 1;
				int forwardPos = mCurrentPos + 1;
				if (backPosition < 0 || forwardPos >= expression.length())
					throw new RuntimeException("Invalid Expression " + expression);
				validateSubsequentExpression(expression, forwardPos);
				validateAntecedentExpression(expression, backPosition);

			}

		}
	}

	private void validateAntecedentExpression(String aExpression, int mPosition) {
		while (mPosition >= 0) {
			if (aExpression.charAt(mPosition) == '&' || aExpression.charAt(mPosition) == '|')
				throw new RuntimeException(
						"Invalid Expression " + aExpression.charAt(mPosition) + "   " + aExpression);
			if (isLabel(aExpression.charAt(mPosition))) {
				break;
			}
			mPosition--;
		}
	}

	private void validateSubsequentExpression(String aExpression, int mPosition) {
		while (mPosition < aExpression.length() - 1) {
			if (aExpression.charAt(mPosition) == '&' || aExpression.charAt(mPosition) == '|')
				throw new RuntimeException("Invalid Expression " + aExpression.charAt(mPosition) + "   " + aExpression);
			if (isLabel(aExpression.charAt(mPosition))) {
				break;
			}
			mPosition++;
		}
	}

	public boolean isBracket(char ch) {
		if (ch == '(' || ch == ')')
			return true;
		return false;
	}

	public boolean isLabel(char ch) {
		int charValue = (int) ch;
		
		if (charValue >= 97 && charValue <= 122)
			return true;
		if (charValue >= 64 && charValue <= 90)
			return true;
		
		return false;
	}
}
