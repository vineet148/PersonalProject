package com.example.algopractice.Recursion;

public class selectUniqueChar {

	public static void main(String args[]) {

		String str = "abcde";
		int num = 2;

		uniqueCombination(str, 0,0, num, "");
	}

	private static void uniqueCombination(String str, int currentChar,int ssf,int num, String asf) {
		// TODO Auto-generated method stub

		if (currentChar == str.length()) {
			if (ssf == num) {
				System.out.println(asf);
			}
			return;

		}
		char ch = str.charAt(currentChar);
		uniqueCombination(str, currentChar + 1,ssf+1, num, asf + ch);
		uniqueCombination(str, currentChar + 1,ssf+0, num, asf+"");

	}
}
