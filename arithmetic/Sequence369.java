package arithmetic;
/**
 * 3�� ����� ������ 1 ���� 10���� ���� ��� [���] 1 2 4 5 7 8 10
 */
public class Sequence369 {
	public static void main(String[] args) {
		String res ="";
		for (int i = 0; i <10; i++) {
			if((i+1)%3 !=0){
				res += (i+1)+" ";		
			}

		}
		System.out.println(res);
	}
}