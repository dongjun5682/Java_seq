package geometric;
/*
 * 아래 수열의 결과값을 구하는 프로그램을 작성하시오.
 *  1+2+4+7+11+16+22+... +
 *  위패턴대로 20번 반복했을 때의 결과값은 ? 얼마?
 */

public class Test {
	public static void main(String[] args) {
		int S = 0;
		int a = 1;
		for (int i = 1; i < 20; i++) {
			S += a;
			a = a+i;
			System.out.println(a);
		}
		
	}
}
