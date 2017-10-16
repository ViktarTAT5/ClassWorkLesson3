/*package by.pvt.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		int size = str.length();
		int[] mas = new int[size];
		int x = Integer.parseInt(str);
		
		int y = Integer.parseInt(reader.readLine());
		
		 
		for(int i = 0; i < mas.length; i++) {
			if(x%10 == y){
				i-= 1;
				size-=1;
			}else{
				mas[i] = x%10;
			}
			x/=10;
		}
		
		System.out.println(size);
		
		int[] masResult = new int[size];
		
		if(mas.length == masResult.length){
			System.out.println("have not");
		}else{
		
		x= 0;
		for(int i = size; i >= 0; i--){
			x *= 10;
			x+= mas[i];
		}
		System.out.println(x);
		}
	}

}
*/