package math;

import java.util.Random;

/**
3개의 반의 학생의 몸무게를 측정하였다.

- 각 반의 학생의 수는 30명이다.

- 각 반의 학생 몸무게의 최대, 최소값을 구하시오.
- 단, 몸무게는 40 ~100 사이에서만 랜덤으로 생성하시오.

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
		System.out.printf("최대값 : %d  최소값 : %d",max,min);
	}
	
}
