package com.biz.str;

public class String_11 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		String s1 = "";
		
		//strNation 에 담긴 문자열의 9번째(0부터시작) 위치부터 잘라서
		// s1에 댐아라
		s1 = strNation.substring(9);
		System.out.println(s1);

		//범위설정, 9번째부터 14번의 앞까지(13번째) 까지
		s1 = strNation.substring(9,14);
		System.out.println(s1);
		
		//12번째 문자열을 추출하여 문자로 변환시켜라
		char c = strNation.charAt(12);
		System.out.println(c);
	}

}
