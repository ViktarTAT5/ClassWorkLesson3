package by.pvt.lesson3HomeWork;

/*
 * «адача
«аполнить массив случайными числами, вывести его на экран. Ќайти самую длинную 
последовательность чисел, упор€доченную по возрастанию. ¬ывести ее на экран. 
≈сли таких последовательностей несколько (самых длинных с одинаковой длиной), то вывести их все.
 */

public class Task6Mas {
	public static void main(String[] args) {
		int[] mas = new int[] { 0, 4, 1, 5, 7, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4, 5, 6 };
		int lengthSequence = 0;
		int maxLengthSequence = 0;
		int number = 0;
		String maxNumber = "";

		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] < mas[i + 1]) {
				if (lengthSequence == 0) {
					number = i;
				}
				lengthSequence++;

			} else {
				if (maxLengthSequence < lengthSequence) {
					maxLengthSequence = lengthSequence;
					maxNumber = number + "";
				} else {
					if (maxLengthSequence == lengthSequence) {
						maxNumber += "/" + number;
					}
				}
				lengthSequence = 0;
			}
			if (i == mas.length - 2) {
				if (maxLengthSequence < lengthSequence) {
					maxLengthSequence = lengthSequence;
					maxNumber = number + "";
				} else {
					if (maxLengthSequence == lengthSequence) {
						maxNumber += "/" + number;
					}
				}
			}
		}

		String[] tempNumbers = maxNumber.split("/");
		int[] numbers = stToInt(tempNumbers);

		for (int i : numbers) {
			print(mas, i, maxLengthSequence);
		}
	}

	private static int[] stToInt(String[] tempNumbers) {
		int[] numbers = new int[tempNumbers.length];
		for (int i = 0; i < tempNumbers.length; i++) {
			numbers[i] = Integer.parseInt(tempNumbers[i]);
		}
		return numbers;
	}

	public static void print(int[] mas, int number, int sequence) {
		for (int i = number; sequence >= 0; i++, sequence--) {
			System.out.print(mas[i]);
		}
		System.out.println();
	}
}
