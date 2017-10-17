package by.pvt.lesson3HomeWork;

public class Task1Mas {
	
	/*
	 * Задача
	 *  Определить количество элементов в заданном массиве, отличающихся от
	 * минимального на 5.
	 */
	
	public static void main(String[] args) {

		int[] mas = new int[] {1,6,7,4,10,12};
		
		
		System.out.println(countAmount(mas, minValue(mas)));

	}
	
	public static int minValue(int[] mas) {
		int min = mas[0];
		for(int i : mas) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}
	
	public static int countAmount(int[] mas, int min) {
		int amount = 0;
		int diversity;
		for(int i : mas) {
			diversity = i - min;
			if(diversity == 5) {
				amount++;
			}
		}
		return amount;
	}
	
}
