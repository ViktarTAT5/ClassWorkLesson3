package by.pvt.lesson3HomeWork;

/*������
�������� ���������, ������� ������� ����� �������, ���������� 
�� ������ � ����� �� ���������� ��������:
��������, ������ [0,0,0,0,1,1,1,1,1,1,1,0,0,1,1,1,1] ������������� 
� [4,7,2,4] (�.�. ���������� � ����, �� ����� ������������ ���������� ��������� ������ �����);
� ������ [1,1,1,0,0,0,0,0,0,0] ������������� � [0,3,7] (�.�. ������ ����� - ��� �������, 
�� ������ ������� ���������������� ������� 0).*/

public class Task9Mas {
	public static void main(String[] args) {
		int[] mas = new int[] {0,0,0,0,0,1,1,1,1,0,0,1,1,1,1,0,0,0,0,0,1,1,1};
		
		String tempMas = "";
		int flag = 0;
		
		if(mas[0] == 1) {
			tempMas += 0 + "/";
			flag = 1;
		}
		
		int counter = 0;
		for(int i = 0; i < mas.length; i++) {
			if(i == mas.length-1) {
				counter++;
				flag = Math.abs(flag - 1);
			}
			if(mas[i] == flag) {
				counter++;
			} else {
				tempMas += counter + "/";
				counter = 1;
				flag = mas[i];
			}
		}
		System.out.println(tempMas);
		
	}
}
