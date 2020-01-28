package Interview;

import com.github.gv2011.gson.Gson;

public class ReadJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
Gson gson=new Gson();
gson.toJson(1);          
gson.toJson("abcd");    
gson.toJson(new Long(10)); 
int[] values = { 1 };
gson.toJson(values);      

System.out.println(gson);
	}

}
