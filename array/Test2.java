package array;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
//		100 ���� ������ ������ �� �ִ� �迭�� �����ϰ� ������ ���ʷ� �Է¹޴ٰ� 0 �� 
//		�ԷµǸ� 0 �� �����ϰ� �� ������ �Էµ� ������
//		���� ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int[] num = new int[100];
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			if(num[i] == 0){
				break;
			}else {
				count++;
				System.out.println(count);
			}
		}
		for (int i = count-1; i >= 0; i--) {
			System.out.print(num[i] + " " );
		}
	}
}
