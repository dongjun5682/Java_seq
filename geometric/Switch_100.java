package geometric;
/*
 * 아래 수열의 결과값을 구하는 프로그램을 작성하시오.
 *  1/2 - 2/3 + 3/4 - .... 98/99 + 99/100 = 0.6881721793101957
 */
public class Switch_100 {
	public static void main(String[] args) {
		double sum =0.0;
		for (int i = 1; i < 100; i++) {

			if(i%2 != 0 ){
				sum +=i/(double)(i+1);
			}else{
				sum -=i/(double)(i+1);
			}
			System.out.println(sum);
		}
		
	}
}
