package com.biz.str;

public class String_06 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		String[] s1 = strNation.split("");
		// s1은 낱개 문자열을 담고있는 배열이 된다.
		//이 s1문자열 배열에서
		//영문자 o가 최초로 몇번째에 나타나는지
		//찾아봅시다.
		int str1 = 0;

		for(int i =0; i<strNation.length(); i++) {

			//if(s1[i]==0{
			if(s1[i].equals("o") ) {
				
				str1 = i;
				break;
			}
			
		}

		System.out.println("최초o는" + (str1+1) + "번째입니다.");
		/*
		 * 문자열은 ==를 사용해서 비교할 경우
		 * 문자열 변수에 저장된 값을 상대로 비교하지 않고
		 * 실제 문자열이 저장된 주소를 상대로 비교를 한다.
		 * 
		 * 따라서 문자열 변수에 저장된 값을 어떤 문자열과 비교할 때에는
		 * == 대신에 equals()매서드를 사용해야 한다. 
		 */
		
		
		
	}

}
