import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class StrtoInt {
	
	
	public static void main(String a[])
	{
		int sample=123;
		int sam=0;
		while(sample>0)
		{
			sam=sam*10;
			sam=sam+sample%10;
			
			sample=sample/10;
			
		}
		
	System.out.println(sam);	
	
	
	}
	
	
	

}
