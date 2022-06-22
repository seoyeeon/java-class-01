package folder;

public class HelloJava {	// class는 객체를 만드는 껍데기, HelloJava는 그 껍데기 이름
							// 중괄호는 블록
	public static void main(String[] args) {
		// 주석
		// 주석은 프로그램에 영향을 주지 않는다.
		// 주석은 소스내용 설명을 위한 코드. (즉 개발자를 위한 코드)
		// 한줄주석
		/* 범위주석 */
		System.out.println("Hello ~~ Java~!!!");
		// Hello ~~ Java~!!! 를 출력해주는 코드

		System.out.println("/*문자열 안에선 주석이 될 수 없습니다.*/");

		// 이클립스에서 자주 사용하는 단축키
		// tab : 들여쓰기
		// shift + tab : 내어쓰기
		// ctrl + shift + c : 라인주석 단축키
		// ctrl + (+ , -) : 폰트 크기조절 단축키
		// ctrl + space : 자동완성 키
		// ex) sysout 후 ctrl + space >> System.out.println();
		// ctrl + shift + f : 자동정렬 단축키

	}

}
