package gichul;

import java.util.Scanner;

/**
 *  �Ʒ� C���� ������ 4~100 ���� ���� �� �Ҽ�(1�� �ڱ� �ڽŸ����� ������ �������� 1���� ū ���� ����)�ǰ����� 
 *  ���ϴ� ���α׷�
 * */


public class Test17_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 4,num=scanner.nextInt(); // i : ���� ���
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
		//		System.out.println("�����ϳ��� �Է��ϼ���.");
		//		int a = scanner.nextInt();
		//		for (int i = 2; i < a; i++) {
		//			if(a%i != 0){
		//				System.out.println("�Ҽ��Դϴ�.");
		//				break;
		//			}else{
		//				System.out.println("�Ҽ����ƴմϴ�.");
		//				break;
		//			}
		//		}
		//	}
		//}

	}
}