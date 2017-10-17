package by.pvt.lesson3HomeWork;

/*������
�������� ������, �������������� ����� ������ ����� ����� � ������, ��� ������
 ������� ���������� ���������� ��������� � ��������� ����� ����� ��� ������.
 �� ���� ������ ��������� ��������� ������� �������� 0, ������ ������ ����� 
 �������������� ������� - �������. ��������:

������ [2, 3] ��������������� ��� 00111,
������ [0, 4, 1, 2] ��������������� ��� 1111011.
��������� �������� ��������� ���������� ��������� �������.*/

public class Task5Mas {
	
	public static void main(String[] args) {
		int[] mas = new int[] { 0,4,1,5,2,3 };
		
		extract(mas);
		
	}
	
	public static void extract(int[] mas) {
		int sign = 0;
		if(mas[0] == 0) {
			sign = 1;
		}
		for(int i = sign; i < mas.length; i++) {
			write(mas[i], sign);
			sign = replace(sign);
		}
		
		
	}
	
	public static int replace(int sign) {
		if(sign == 0) {
			sign = 1;
		} else {
			sign = 0;
		}
		//System.out.print(" sign=" +sign + " ");
		return sign;
	}
	
	public static void write(int a, int sign) {
		for(int i = 0; i < a; i++) {
			System.out.print(sign);
		}
	}
}
