package gichul;

import java.util.Scanner;
/**
 아래 C언어는 1~9999 정수값 중 10개의 입력 받아 배열에 저장한 후 저장된 자료 중 최소값을 출력하는 프로그램이다. 
 min 변수 초기값은 9999 (정수의 최대값: 9999)
 
 * */
public class Min17 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		int min = 9999;
		System.out.println("1~9999 값중 10개의 수를 입력하세요.");
		for (int i = 0; i <= 9; i++) {
				num[i] =scanner.nextInt(); 
				if(num[i] > 9999 || num[i] < 0 ){
					System.out.println("정수값은 1~9999 입니다.");
				}
		}
		for (int i = 0; i <= 9; i++) {
			if(min > num[i]){
				 min = num[i];
			}
		}
		System.out.printf("10개의 정수중에 최소값 : %d",min);
		
	}
}
