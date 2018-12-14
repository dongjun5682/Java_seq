package array;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		//10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
		String[] a = new String[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("5개 문자를 입력하세요.");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.next();
			
			if(i == 0 || i == 3|| i == 4){
				System.out.println(a[i]);
			}
		}
		
	}
}
