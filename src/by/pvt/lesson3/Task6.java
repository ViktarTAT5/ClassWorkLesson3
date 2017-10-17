/*package by.pvt.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(reader.readLine());
		String sign;
		if (x < 0){
			System.out.println("-");
		}else if(x > 0){
			System.out.println("+");
		} else {
			System.out.println("0");
		}
		
		String str = "" + x;
		System.out.println(str.length());
		
	}

}
*/