package arithmetic;
/**
 ���� ���� : �����ϴ� �� ���� ���̰� ��� ������
 ����(common difference)��  ���������� ��Ÿ���� ����
 
 * */
public class Sequence100 {

	public static void main(String[] args) {
		int i=0, x = 0;
		String re = "";
		for (int j = 1; j <= 100; j++) {
			re += j +"+";
			x += j;
		}
		System.out.println(re+"\n"+x);
	}

}
