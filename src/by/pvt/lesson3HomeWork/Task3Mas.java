package by.pvt.lesson3HomeWork;

/*«адача
 *«аданы три числа, которые обозначают число, мес€ц, год. Ќайти пор€дковый номер даты, начина€ отсчет с начала года.
 */

public class Task3Mas {

	public static void main(String[] args) {
		int[] daysOfMonths = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int day = 14;
		int month = 5;
		int year = 2000;

		int result = 0;

		for (int i = 0; i < month; i++) {
			result += daysOfMonths[i];
		}
		result += day;
		if (month == 2) {
			if (leapYear(year)) {
				result++;
			}
		}

		System.out.println(result);
	}

	public static boolean leapYear(int year) {

		if (year % 4 != 0) {
			return false;
		} else {
			if (year % 100 != 0 && year % 4 == 0) {
				return true;
			} else {
				if (year % 100 == 0 && year % 400 != 0 && year % 4 == 0) {
					return false;
				} else {
					return true;
				}
			}
		}
	}
}
