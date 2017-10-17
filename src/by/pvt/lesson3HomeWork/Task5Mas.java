package by.pvt.lesson3HomeWork;

/*Задача
Вводится массив, представляющий собой сжатие серий нулей и единиц, где каждый
 элемент обозначает количество элементов в очередной серии нулей или единиц.
 Но если первым элементом вводимого массива является 0, значит первая серия 
 распакованного массива - единицы. Например:

массив [2, 3] распаковывается как 00111,
массив [0, 4, 1, 2] распаковывается как 1111011.
Требуется написать программу распаковки вводимого массива.*/

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
