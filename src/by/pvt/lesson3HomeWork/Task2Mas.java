package by.pvt.lesson3HomeWork;

public class Task2Mas {

	/*
	 * Задача В одномерном массиве найти максимальный из отрицательных элементов и
	 * поменять его местами с последним элементом массива.
	 */

	public static void main(String[] args) {
		int[] mas = new int[] { 1, 6, 7, -4, 10, 12 };

		Print.print(mas);

		int min = minValue(mas);
		if (min < 0) {
			change(mas, min);
			Print.print(mas);
		} else {
			System.out.println("Zero");
		}
	}

	public static void change(int[] mas, int min) {
		int number = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0 && mas[i] > min) {
				min = mas[i];
				number = i;
			}
		}
		int temp = mas[number];
		mas[number] = mas[mas.length - 1];
		mas[mas.length - 1] = temp;
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
