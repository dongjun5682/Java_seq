package arithmetic;

public class Sequence1350 {

	public static void main(String[] args) {
		int i = 0, d = 1, sum = 1 ;

		while (true) {
			i++;
			d += i; 
			sum += d;
			if(i < 19){	
				continue;	
			}else{
				break;
			}
		}
		
		System.out.printf(
        "======================================================\n"
      + "1+2+4+7+11+16+22+... �����ϴ� ������ 20��° �ױ��� �� \n"
      + "======================================================\n"
      + "%d \n"
      + "=======================================================",sum);


	}

}
