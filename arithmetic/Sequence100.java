package arithmetic;

public class Sequence100 {

	public static void main(String[] args) {
		int i=0 ,x = 0;

		while (true) {
			i++;
			x += i;
			if(i <100){
				continue;
			}else{
				break;
			}
		}

		System.out.println("====================");
		System.out.println("1+2+3+...+100±îÁö ÇÕ");
		System.out.println("====================");
		System.out.println(x);
		System.out.println("====================");
		
	}

}
