package gichul;

import java.util.Scanner;
/**
 �Ʒ� C���� 1~9999 ������ �� 10���� �Է� �޾� �迭�� ������ �� ����� �ڷ� �� �ּҰ��� ����ϴ� ���α׷��̴�. 
 min ���� �ʱⰪ�� 9999 (������ �ִ밪: 9999)
 
 * */
public class Min17 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		int min = 9999;
		System.out.println("1~9999 ���� 10���� ���� �Է��ϼ���.");
		for (int i = 0; i <= 9; i++) {
				num[i] =scanner.nextInt(); 
				if(num[i] > 9999 || num[i] < 0 ){
					System.out.println("�������� 1~9999 �Դϴ�.");
				}
		}
		for (int i = 0; i <= 9; i++) {
			if(min > num[i]){
				 min = num[i];
			}
		}
		System.out.printf("10���� �����߿� �ּҰ� : %d",min);
		
	}
}
