package by.pvt.lesson3HomeWork;

public class Task2Mas {

	/*
	 * Задача В одномерном массиве найти максимальный из отрицательных элементов и
	 * поменять его местами с последним элементом массива.
	 */

	public static void main(String[] args) {
		int[] mas = new int[] { 14, -4, 1, -6, 7, -4, 10, 12 };

		Print.print(mas);

		int min = minValue(mas);
		if (min < 0) {
			int max = maxValue(mas, min);
			change(mas, max);
			Print.print(mas);
		} else {
			System.out.println("Zero");
		}
	}

	public static void change(int[] mas, int max) {
		int temp = mas[mas.length - 1];
		mas[mas.length - 1] = max;
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] == max) {
				mas[i] = temp;
			}
		}
	}

	public static int maxValue(int[] mas, int min) {
		for (int i : mas) {
			if (i > min && i < 0) {
				min = i;
			}
		}
		return min;
	}

	public static int minValue(int[] mas) {
		int min = mas[0];
		for (int i : mas) {
			if (i < min) {
				min = i;
			}
		}

		return min;
	}
}
