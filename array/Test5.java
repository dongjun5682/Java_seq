package array;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		//5���� ������ �Է¹޾� �� �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(�Է¹��� ������ 1000�� ���� �ʴ´�.)
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("���� 5���� �Է��ϼ���.");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			if(num[i] >1000){
				System.out.println("�Է¼��� 1000�� ������ȵ˴ϴ�.");
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i] < num[j]){
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				}
			System.out.println(num[i]);
			}
		

	}
}



