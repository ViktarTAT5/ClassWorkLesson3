package by.pvt.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
/*Алгоритм решения задачи: 
Проверяем делится ли год на 4. Если нет, то год уже невисокосный.
Если год делится на 4, то проверяем делится ли он на 100. Если нет, то год однозначно високосный.
Если год делится на 100, но при этом не делится на 400, то год невисокосный.*/

		 
		final int AGE1 = 366;
		final int AGE2 = 365;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(reader.readLine());
		
		
		if( x%4 != 0 ){
			System.out.println("Невисокосный");
		}else{
			if( x%100 != 0  && x%4 == 0){
				System.out.println("Високосный");
		}else{
			if(x%100 == 0  && x%400 != 0 && x%4 == 0){
				System.out.println("Невисокосный");
			}else{
				System.out.println("Високосный");
			}
			}
		}
	}

}
