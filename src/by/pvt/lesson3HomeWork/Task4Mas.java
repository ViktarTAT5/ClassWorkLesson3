package by.pvt.lesson3HomeWork;

import java.util.Scanner;

/*Задача
 *В один массив записаны наименования товаров, в другую - их цена. Написать программу,
 *вычисляющую общую стоимость покупки при условии, что пользователь может указывать
 *приобретаемый товар и его количество.*/

public class Task4Mas {
	public static void main(String[] args) {
		String[] productMas = new String[] { "Груши", "Яблоки", "Огурцы", "Помидоры", "Укроп", "Петрушка", "Курица",
				"Сыр", "Масло", "Молоко" };
		double[] priceMas = new double[] { 40.50, 31.20, 21.80, 35.00, 150.00, 145.00, 200.00, 400.00, 81.40, 53.35 };

		print(productMas, priceMas);

		request(priceMas);
	}

	public static void print(String[] products, double[] price) {
		if (products.length == price.length) {
			for (int i = 0; i < price.length; i++) {
				System.out.println((i + 1) + ") " + products[i] + " - " + price[i]);
			}
		}
	}

	public static void request(double[] priceMas) {
		double result = 0;

		while (true) {
			System.out.print("product: ");
			int product = scanInt();
			if (product == 0) {
				break;
			}
			System.out.print("amount: ");
			float amount = scanFloat();

			result = result + priceMas[product] * amount;
		}
		
		System.out.println("Itogo: " + result);
	}

	public static int scanInt() {
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			System.out.println("Error!");
			sc.next();
		}
		int a = sc.nextInt();
		return a;
	}

	public static float scanFloat() {
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextFloat()) {
			System.out.println("Error! !@#");
			sc.next();
		}
		float a = sc.nextFloat();
		return a;
	}
}
