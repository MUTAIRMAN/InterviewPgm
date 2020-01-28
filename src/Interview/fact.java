package Interview;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcFact(5));
	}
	
	public static int calcFact(int n)
	{
		if(n>1)
			return n*calcFact(n-1);
		else
			return 1;
	}

}
