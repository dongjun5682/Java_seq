package gichul;

import java.util.Scanner;

/**
 *  아래 C언어로 구현된 4~100 까지 숫자 중 소수(1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수)의개수를 
 *  구하는 프로그램
 * */


public class Test17_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 4,num=scanner.nextInt(); // i : 나눌 대상
		int count = 0;
		boolean isPrime = true;
		while (i <= num) {

			isPrime = true;
			for (int n = 2; n < i; n++) {

				if (i % n == 0) {
					isPrime = false;
				}
				continue;
			}
			if (isPrime == true)
				System.out.println(i);
				i++;
		
		}
		System.out.println(count);
		//		Scanner scanner = new Scanner(System.in);
		//		System.out.println("숫자하나를 입력하세요.");
		//		int a = scanner.nextInt();
		//		for (int i = 2; i < a; i++) {
		//			if(a%i != 0){
		//				System.out.println("소수입니다.");
		//				break;
		//			}else{
		//				System.out.println("소수가아닙니다.");
		//				break;
		//			}
		//		}
		//	}
		//}

	}
}