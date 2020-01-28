package Interview;

public class Derived extends Base {
	
	Derived(){
		AddVal();
	}

	public void AddVal() {
	//	System.out.println("DerivedClass");
		val=val+20;
	}
	public int display() {
		return val;
	}
}
