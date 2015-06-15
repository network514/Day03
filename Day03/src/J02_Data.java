public class J02_Data {
//	자바의 데이터 종류
	public static void main(String[] args) {
//		1. 정수 데이터 : 소수점이 없는 수
//			- 일반형 정수(기본) && 확장형 정수(L/l)
		System.out.println(123123); // 일반형
		System.out.println(123123L); // 확장형정수
//		=> 위의 결과는 같지만, 
//			자바는 두 개의 데이터를 다른 형태로 인식힌다.
		
//		System.out.println(2200000000); // 에러코드
//		=> 일반형 정수는 -21억 ... ~ +21억 ...까지의
//			범위만 가능하기 때문에 22억은 표현 불가능.
		System.out.println(2200000000L);
//		=> L을 붙이면, 확장형 정수로 인식하므로
//			사용가능하다.
//		2. 실수 데이터 : 소수점이 있는 수
//			- 일반형 실수(기본) && 약식형 실수(F/f) // 보통 소문자 f를 많이 쓴다. 
		System.out.println(12.345); // 일반형 실수 ; 비교적 오차가 적다.
		System.out.println(12.345f); // 약식형 실수
//		=> 두 결과는 같지만, 자바는 데이터를
//			서로 다른 형태로 인식한다.
//		=> 실수 데이터는 형태에 따라 
//			정밀도의 차이가 발생하기 때문에
//			약식형은 일반형보다 비교적 오차가 큰 편이다.
		System.out.println(123123.123123);
		System.out.println(123123.123123f); // 123123.125 오차가 발생.
		
//		3. 단일문자 데이터
//		- 알파벳, 기호 및 한글 (모든 나라 언어) 가능
//		- 한글자만 가능하다.
//		- 외따옴표로 표기한다.
		System.out.println('A');
		System.out.println('ㄱ');
		System.out.println('*');
		System.out.println('망');
		System.out.println('望');
		
//		4. 문자열
//		- 일반적으로 사용하는 문장을 의미한다.
//		- 자바에서는 String이라고 부른다.
//		- 쌍따옴표로 표기한다.
		System.out.println("안녕");
		System.out.println("조조가 유비를 만났다.");
		System.out.println("1234");
		System.out.println("12.34");
//		=> 문자열에 적용된 숫자는 숫자가 아니므로
//			계산되지 않는다. (그림일 뿐...)
		
//		5. 참/거짓 데이터 
//		- 맞다/틀리다 정보를 가지는 데이터 형태
//		- 맞는 경우 : true / 틀린 경우 : flase
		System.out.println(true); // 참
		System.out.println(false); // 거짓
	}
}