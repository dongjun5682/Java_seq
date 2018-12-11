package arithmetic;
/**
 등차 수열 : 연속하는 두 항의 차이가 모두 일정한
 공차(common difference)는  공통적으로 나타나는 차이
 
 * */
public class Sequence01 {

	public static void main(String[] args) {
		//2+8+14+20+26=70
		int a = 2; //초항
		int s =a;
		int d = 6;//공차
		int n =2;//번째
		int an = 0;
		String ex = "2";
		for(int i = 0; i < 4; i++){
			an = a+(n-1)*d;
			a = an;
			s += an;
			ex += "+" + an;
			
		}
		System.out.println(ex+"="+s);
	}

}
