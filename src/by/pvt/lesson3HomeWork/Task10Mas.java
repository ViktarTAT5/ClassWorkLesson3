package by.pvt.lesson3HomeWork;

/*Задача
Вывести в порядке возрастания цифры, входящие в десятичную запись натурального числа N.*/

public class Task10Mas {
	public static void main(String[] args) {
		int a = 1532468970;
		String  temp = a + "";
		
		char[] masChar = temp.toCharArray();
		int[] mas = new int[masChar.length];
		
		for(int i = 0; i < masChar.length; i++) {
			mas[i] = Character.digit(masChar[i], 10);
		}
		
		Print.print(mas);
		sort(mas);
		Print.print(mas);
	}
	
	public static void sort(int[] mas) {

		for (int j = 0; j < mas.length; j++) {
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] > mas[i + 1]) {
					int temp = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = temp;
				}
			}
		}
	}
	
}
