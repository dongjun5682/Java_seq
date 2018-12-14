package array;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//문자 10개를 저장할 수 있는 배열을 만들고 10개의 문자를 입력받아 입력받은 
		//문자를 이어서 출력하는 프로그램을 작성하시오.
		
		String[] num = new String[5];
		Scanner scanner =new Scanner(System.in);
		System.out.println("문자 5개를 입력하세요.");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.next();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
	}
}
