/*package by.pvt.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		task4();
		

	}

	static void task4() throws Exception {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		String s = "";
		
		do{
			
			int a = Integer.parseInt(r.readLine());
			int b = Integer.parseInt(r.readLine());
			s = r.readLine();
			
			if("+".equals(s)){
				int c = a + b;
				System.out.println(c);
			}else if("-".equals(s)){
				int c = a - b;
				System.out.println(c);
			}else if("*".equals(s)){
				int c = a * b;
				System.out.println(c);
			}else if("/".equals(s)){
				
				if(b != 0){
					float c = (float) a / (float) b;
					System.out.println(c);
				}else{
					System.out.println("Y = " +b);
				}
			}else if("0".equals(s) == true){
				
			}else{
				System.out.println("error");
			}
			
		}while("0".equals(s) != true);
		System.out.println("End");
		
		
		
		
	}
	
}
*/