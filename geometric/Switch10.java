package geometric;
/*
 *
 1-2+3-4+5-6+7-8+9-10+11-12+13-14+15-16+17-18+19-20 = -10
 **/
public class Switch10 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum += (i%2 != 0) ? i : -i ; // ���׿�����
		}
		System.out.println(sum);
	}
}
