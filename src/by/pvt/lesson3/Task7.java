package by.pvt.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
/*�������� ������� ������: 
��������� ������� �� ��� �� 4. ���� ���, �� ��� ��� ������������.
���� ��� ������� �� 4, �� ��������� ������� �� �� �� 100. ���� ���, �� ��� ���������� ����������.
���� ��� ������� �� 100, �� ��� ���� �� ������� �� 400, �� ��� ������������.*/

		 
		final int AGE1 = 366;
		final int AGE2 = 365;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(reader.readLine());
		
		
		if( x%4 != 0 ){
			System.out.println("������������");
		}else{
			if( x%100 != 0  && x%4 == 0){
				System.out.println("����������");
		}else{
			if(x%100 == 0  && x%400 != 0 && x%4 == 0){
				System.out.println("������������");
			}else{
				System.out.println("����������");
			}
			}
		}
	}

}
