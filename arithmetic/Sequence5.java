package arithmetic;
/**
��������: �����ϴ� �� ���� ���̰� ��� ������ ����
����(common difference) : ���������� ��Ÿ���� ����
2+8+14+20+26=70
 * */
public class Sequence5 {

	public static void main(String[] args) {
		int A = 2; // ���� 2
        int S = A;
        int D = 6; // ����
        int N = 2; // ��°
        int AN = 0;
        // 2 + 8 + 14 + 20
        // 2 + (2+6) + (2+6+6)+ (2+6+6+6)
        String ex = "2";
        while (true) {
          AN = A + (N - 1)*D;
          S +=AN;
          N++;
          if(N < 5){
        	  ex += "+"+AN ;
        	  continue;
          }else{
        	  ex += "+"+AN;
        	  break;
          }
        }
       System.out.println(ex + "=" + S);
		
	}

}
