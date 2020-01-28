package Interview;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		int a=0,b=1;
		int c;
		for(int i=0;i<10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		
	}

}
