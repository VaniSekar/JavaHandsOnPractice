package com.vani.junit;

public class PalindromeTester {

	public PalindromeTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s= "Malayalam";
		PalindromeTester palindromeTester = new PalindromeTester();
		if(palindromeTester.checkPalindrome(s)){
		System.out.println("the String is Palindrome"+palindromeTester.checkPalindrome(s));
		}
		else{
			System.out.println("the string is not a Palindrome");
		}

	}
	
	public boolean checkPalindrome(String inputStr){
		StringBuffer sbf = new StringBuffer();
		sbf.append(inputStr);
		
			StringBuffer reverseStr = sbf.reverse();
			if(inputStr.equalsIgnoreCase(reverseStr.toString())){
			return true;
			}
			else{
				return false;
			}
				
	}

}
