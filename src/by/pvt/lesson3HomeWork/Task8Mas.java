package by.pvt.lesson3HomeWork;

//Задача
//Даны два массива с различным количеством элементов. 
//Перераспределить их элементы так, чтобы в первом массиве 
//были наименьшие из двух массивов, а во втором - наибольшие.

public class Task8Mas {
	public static void main(String[] args) {
		int[] mas1 = new int[] { 88, 56, 2, 3,6, 48, 21, 15 };
		int[] mas2 = new int[] { 12,6, 46, 65, 13, 25, 9, 4, 1, 11, 22, 8, 6, 7, 45, 26, 64, 19, 85, 48 };

		if(mas1.length > mas2.length) {
			System.out.println("Error");
			return;
		}
		
		Task10Mas.sort(mas1);
		Task10Mas.sort(mas2);

		Print.print(mas1);
		Print.print(mas2);

		for (int i1 = 0; i1 < mas1.length; i1++) {
			int i2 = 0;
			int temp;
			if (mas1[i1] > mas2[i2]) {
				temp = mas2[i2];
				mas2[i2] = mas1[i1];
				mas1[i1] = temp;
				Print.print(mas1);
				Print.print(mas2);
				if(i2 != mas2.length && mas2[i2] > mas2[i2+1]) {
					Task10Mas.sort(mas2);
				}
			} else {
				if (mas1[i1] == mas2[i2]) {
					if (i1 != mas1.length - 1) {
						mas1[i1 + 1] = mas2[i2];
					}
				} else {
					i1--;
					i2++;
				}
			}
		}

	}
}
