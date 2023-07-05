package ex04controlstatement;
//문제1) 파일명 : QuNumberYN.java
//하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
//(System.in.read()를 사용하세요)

import java.io.IOException;
import java.util.Scanner;

public class QuNumberYN {

	public static void main(String[] args) throws IOException {
		System.out.println("하나의 문자를 입력하세요:");
		int asciiCode = System.in.read();
		
		if(asciiCode>='0' && asciiCode<='9') {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
	}

}
