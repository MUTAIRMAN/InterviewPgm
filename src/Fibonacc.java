
public class Fibonacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=55;
				
		int t1=0,t2=1;
		
		while(n>1)
		{
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            n=n-1;
		}
		
		
		System.out.println(t2);
	}

}
