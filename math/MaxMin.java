package math;

import java.util.Random;

/**
3���� ���� �л��� �����Ը� �����Ͽ���.

- �� ���� �л��� ���� 30���̴�.

- �� ���� �л� �������� �ִ�, �ּҰ��� ���Ͻÿ�.
- ��, �����Դ� 40 ~100 ���̿����� �������� �����Ͻÿ�.

*/
public class MaxMin {
	public static void main(String[] args) {
		Random random = new Random();
		int[] class1 = new int[30];
		int a[][] ={{50,60,70},{60,70,80},{10,20,30}};
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < a.length; j++) {
			System.out.println(	a[i][j]);
			}
		}
		int max =40 ,min=100;
		for (int i = 0; i < class1.length; i++) {
			class1[i] = random.nextInt(61)+40;
		}
		for (int i = 0; i < class1.length; i++) {
			System.out.print(class1[i]+" ");
			if(class1[i] > max){
				max = class1[i];
			}else if(class1[i] < min){
				min = class1[i];
			}
		}
		System.out.printf("�ִ밪 : %d  �ּҰ� : %d",max,min);
	}
	
}
