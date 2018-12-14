package gichul;
/**
 * java언어로 구현된 내림차순 선택정렬 프로그램을 분석하여 그 실행 결과를 쓰시오
**/

public class Test17 {
	public static void main(String[] args) {
		int[] num ={3,4,10,2,5};
		for (int i = 0; i <=3; i++) {
			for (int j = i+1; j <= 4; j++) {
				if (num[i] < num[j]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		for (int i = 0; i <= 4 ; i++) {
			System.out.println(num[i]+ " ");
		}
	}
}
