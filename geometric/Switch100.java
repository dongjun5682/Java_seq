package geometric;
/*
 * 아래 수열의 결과값을 구하는 프로그램을 작성하시오.
 * 1 - 2 + 3 - 4 + 5 - ..... + 99 - 100 = -50
 * 패턴 : 홀수는 + , 짝수는  -
 */

public class Switch100 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			sum += (i%2 != 0) ? i : -i;
		}
		System.out.println(sum);
	}
}
