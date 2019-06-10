package com.biz.str;

public class String_09 {

	public static void main(String[] args) {

		String strKorea = "korea";
		
		boolean bYes = true;
		
		bYes = strKorea.equals("Korea");
		System.out.println(strKorea + " eq Korea : " + bYes);
		
		bYes = strKorea.equalsIgnoreCase("Korea");
		System.out.println(strKorea + " eqIg Korea : " + bYes);
	
		bYes = strKorea.matches("Korea");
		System.out.println(strKorea + " ma Korea : " + bYes);
	
		//strKorea 문자열 내에 Ko라는 문자열이 포함되어 있느냐?
		bYes = strKorea.contains("o");
		System.out.println(strKorea + " contains o : " + bYes);
	
	
	}

}
