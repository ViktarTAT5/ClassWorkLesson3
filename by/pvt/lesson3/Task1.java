package by.pvt.lesson3;
import java.util.Random;

/*
 * Задание 1

Сгенерировать случайное число, вывести на экран это число, а также сумму и произведение его цифр.Сгенерировать случайное число, вывести на экран это число, а также сумму и произведение его цифр.

Алгоритм решения задачи: 
random(900) генерирует случайное число от 0 до 899. Если прибавить к нему 100, то получится диапазон от 100 до 999 включительно, т. е. охватывает все трехзначные числа.
Чтобы извлечь из числа цифру сотен надо его разделить нацело на 100.
Для получения цифры десяток можно сначала разделить нацело на 10, а затем найти остаток от деления на 10.
Единицы извлекаются путем нахождения остатка от деления числа на 10.


*/
public class Task1 {

	//public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Random r = new Random();
		
		int x = r.nextInt(900);
		int sum = 0;
		
		System.out.println(x);

		String str = ""+x;//x.toString();
		
		char[] chars = str.toCharArray();
		
		for(int i = 0; i < chars.length; i++){
			sum+=Character.getNumericValue(chars[i]);
		}

		System.out.println(sum);

		sum = 1;
		
		for(int i = 0; i < chars.length; i++){			
			sum*=Character.getNumericValue(chars[i]);
		}
		
		System.out.println(sum);
		
		
	}

}
