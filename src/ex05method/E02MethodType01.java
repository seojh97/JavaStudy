package ex05method;

/*
Java에서는 Naming Rule(이름을 지을때의 규칙)
-클래스명 : SimpleFunc
 => 대문자로 시작하는 Camel case로 작성한다.
-메서드 혹은 변수명 : simpleFunc
 => 소문자로 시작하는 Camel case를 사용한다.
-상수명 : SIMPLE_FUNC 
 => 전체를 대문자로 기술한다.
 단, 연결되는 단어는 _로 구분한다.
-패키지명 : simple.func 
 => 전체를 소문자로 기술한다.
 연결되는 단어는 .으로 구분한다.
*/

/*
메서드형태1] 매개변수도 없고, 반환값도 없는 메서드
	: 둘 다 없는 형태의 메서드로 주로 메뉴를 출력하거나 하는 단순 출력 기능
	정도로 사용한다.
*/
public class E02MethodType01 {

	//반환타입, 매개변수 둘다 없는 형태로 메서드를 정의함.
	static void menuPrint() {
		System.out.println("==메뉴를 선택하세욤==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("==============");
	}
	static void returnError() {
		int returnValue = 10;
		System.out.println("[Retrun문 이전]");
		
		/*
		이와같이 메서드 중간에 return을 기술하면 즉시 종료되므로 그 아래에
		있는 코드는 실행되지 않는 쓰레기코드가 된다.
		따라서 return을 사용할때는 반드시 조건문과 같이 기술되어야 한다.
		단, 메서드의 마지막 라인에 기술하면 조건문이 없어도 된다.
		*/
		//return;
		
		//이와같이 return문이 중간에 있으려면 조건부로 기술한다.
		if(returnValue%2==0) {
			System.out.println(returnValue +"는 짝수");
			//함수에서 return은 종료를 의미한다.
			return;
		}
		
		System.out.println(returnValue +"는 홀수");
		System.out.println("[return문 이후]");
	}
	
	public static void main(String[] args) {
		menuPrint();
		returnError();
	}

}

