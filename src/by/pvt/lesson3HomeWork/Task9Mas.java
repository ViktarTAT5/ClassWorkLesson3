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
