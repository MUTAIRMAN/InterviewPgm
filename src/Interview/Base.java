package Interview;

public class Base {
	int val=0;
	
	Base()
	{
		AddVal();
	}
	
	public void AddVal() {
		System.out.println("BaseClass");
		val+=500;
	}

	public int display() {
		return val;
	}
}
