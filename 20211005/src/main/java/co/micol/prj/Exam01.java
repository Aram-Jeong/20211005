package co.micol.prj;

import org.graalvm.compiler.replacements.amd64.AMD64ArrayIndexOf;

public class Exam01 {
	private String str = "20001004"; // yyyymmdd
	private String nstr = "1234";
	private String mstr = "3456";
	private String cstr = " akcd*fg.jsp";

	void stringTest() {
		System.out.println(str.toString());
		System.out.println(nstr.toString());
		System.out.println(nstr + mstr);

		int n = Integer.valueOf(nstr);
		int m = Integer.valueOf(mstr);
		System.out.println(n + m);

//		if(str.equals(cstr)) System.out.println(cstr); // 문자 비교에서는 ==보다 equals
		String mm = str.substring(4, 6); // 4번째부터 6번째 전까지
		String dd = str.substring(6); // 6번째부터 끝까지
		System.out.println("귀하의 생일은 " + mm + "월 " + dd + "일입니다.");
//		String cc=cstr.substring(0, 7);
		int l = cstr.indexOf(".");
		System.out.println(cstr.substring(0, l)); // 0번부터 l까지만 나옴
		System.out.println(cstr.replace("k", "B"));
		System.out.println(cstr.concat("xyz")); // 마지막 문자 뒤에 추가
		System.out.println(cstr.toUpperCase()); // 대문자로 바꿔줌
		System.out.println(cstr.getBytes());
		System.out.println(cstr.trim()); // 좌우 공백 제거, 내부 공백은 제거x

// 		char = 'a'; 1byte / str = "a"; 2byte
		char c = 'a';
		String cs = String.valueOf(c); // char type -> String type
		String s = "a";
		if (s == cs)
			System.out.println(c);
		
		// p. 45n? 504? 

	}

}
