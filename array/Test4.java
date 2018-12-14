package array;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
//		1반부터 6반까지의 평균점수를 저장한 후 두 반의 반 번호를 입력받아 두 반 평균점수의 합을 출력하는 프로그램을 작성하시오. 
//		반별 평균점수는 초기값으로 1반부터 차례로 85.6 79.5 83.1 80.0 78.2 75.0으로 초기화하고 
//		출력은 소수 두 번째 자리에서 반올림하여 소수 첫째자리까지 한다.
		Scanner scanner =new Scanner(System.in);
		System.out.println("1반 부터 6반까지 두 반을 입력하세요.");
		int number = scanner.nextInt();
		int number2 = scanner.nextInt();
		double[] school = {0,85.6,79.5,83.1,80.0,78.2,75.0};
		double res = 0.0;
		res = (school[number] + school[number2]);
		System.out.println("두반의 평균점수는 : "+res);
	}
}
