package by.pvt.lesson3;
import java.util.Random;

/*
 * ������� 1

������������� ��������� �����, ������� �� ����� ��� �����, � ����� ����� � ������������ ��� ����.������������� ��������� �����, ������� �� ����� ��� �����, � ����� ����� � ������������ ��� ����.

�������� ������� ������: 
random(900) ���������� ��������� ����� �� 0 �� 899. ���� ��������� � ���� 100, �� ��������� �������� �� 100 �� 999 ������������, �. �. ���������� ��� ����������� �����.
����� ������� �� ����� ����� ����� ���� ��� ��������� ������ �� 100.
��� ��������� ����� ������� ����� ������� ��������� ������ �� 10, � ����� ����� ������� �� ������� �� 10.
������� ����������� ����� ���������� ������� �� ������� ����� �� 10.


*/
public class Task1 {

	//public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Random r = new Random();
		
		int x = r.nextInt(900);
		int sum = 0;
		
		System.out.println(x);

		String str = ""+x;//x.toString();
		
		char[] chars = str.toCharArray();
		
		for(int i = 0; i < chars.length; i++){
			sum+=Character.getNumericValue(chars[i]);
		}

		System.out.println(sum);

		sum = 1;
		
		for(int i = 0; i < chars.length; i++){			
			sum*=Character.getNumericValue(chars[i]);
		}
		
		System.out.println(sum);
		
		
	}

}
