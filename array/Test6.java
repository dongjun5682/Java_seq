package array;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
//10개의 문자를 입력받아 마지막으로 입력받은 문자부터 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		String[] num = new String[10];
		System.out.println("문자 5개를 입력하세요.");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.next();
			count++;
		}
		for (int i = count; i > 0; i--) {
			System.out.print(num[i-1] + " ");
		}
	}
}



