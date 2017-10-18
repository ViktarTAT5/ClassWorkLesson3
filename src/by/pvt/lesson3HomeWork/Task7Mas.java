package by.pvt.lesson3HomeWork;

import java.util.Random;

/*Задача
Задан упорядоченный по возрастанию целочисленный массив. 
Сформировать второй массив из случайных целых чисел, которые 
не встречаются в первом массиве, но имеют величину больше 
минимального и меньше максимального из чисел первого массива.*/

public class Task7Mas {
	public static void main(String[] args) {
		int[] mas = new int[] { 1, 10, 11, 12, 13, 14, 15, 20 };
		int[] result = new int[20];

		int minBorder = mas[0];
		int maxBorder = mas[mas.length - 1];
		int maxBorderVBR = maxBorder - minBorder;

		Random rn = new Random();
		int temp;

		for (int i = 0; i < result.length; i++) {
			do {
			do {
				temp = rn.nextInt(maxBorderVBR) + minBorder;
			} while (temp >= maxBorder | temp <= minBorder);
			}while(choice(temp, mas));
			result[i] = temp;
		}
		Print.print(result);
	}

	private static boolean choice(int temp, int[] mas) {
		for (int i : mas) {
			if (i == temp) {
				return true;
				
			}
		}
		return false;
	}
}
