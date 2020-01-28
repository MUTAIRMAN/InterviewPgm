package Interview;

import java.util.ArrayList;
import java.util.List;

public class reverSewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String j="muthu is a good.";
		String[] li;
		li=j.split(" ");
		for(int i=li.length-1;i>-1;i--)
		{
			if(li[i].contains("."))
			{
				
			li[i]="."+li[i].substring(0,li[i].length()-1);
			}
			System.out.println(li[i]);

		}
		
	}

}
