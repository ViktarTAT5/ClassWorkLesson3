package by.pvt.lesson3HomeWork;

/*Задача
Написать программу, которая сжимает серии массива, состоящего 
из единиц и нулей по следующему принципу:
например, массив [0,0,0,0,1,1,1,1,1,1,1,0,0,1,1,1,1] преобразуется 
в [4,7,2,4] (т.к. начинается с нуля, то сразу записывается количество элементов первой серии);
а массив [1,1,1,0,0,0,0,0,0,0] преобразуется в [0,3,7] (т.к. первая серия - это единицы, 
то первый элемент преобразованного массива 0).*/

public class Task9Mas {
	public static void main(String[] args) {
		int[] mas = new int[] { 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1 };

		String temp = compress(mas);

		String[] tempMas = temp.split("/");

		int[] result = Task6Mas.stToInt(tempMas);
		
		Print.print(result);
	}

	public static String compress(int[] mas) {
		int flag = 0;
		String temp = "";

		if (mas[0] == 1) {
			temp += 0 + "/";
			flag = 1;
		}

		int counter = 0;
		for (int i = 0; i < mas.length; i++) {
			if (i == mas.length - 1) {
				counter++;
				flag = Math.abs(flag - 1);
			}
			if (mas[i] == flag) {
				counter++;
			} else {
				temp += counter + "/";
				counter = 1;
				flag = mas[i];
			}
		}
		return temp;
	}
}
