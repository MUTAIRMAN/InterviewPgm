package Interview;

public class ReverseANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1002, rev=0,dig;

		while (num > 0) {
			dig = num % 10;
			rev=rev*10+dig;
			num = num / 10;
			
		}
		
		System.out.println(rev);

	}

}
