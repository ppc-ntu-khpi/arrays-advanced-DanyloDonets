package arrays;

import java.util.Scanner;

/**
 * Зчитує потрібні данні від користувача.
 * Включає реалізацію статичного метода main().
 *
 * @author Данило Донець
 * @version 1.0
 * @see Main#main
 */

public class Main {
	 /**
     * Об'єкт класу {@linkplain main}.Зчитує введені розміри матриці тазапускає скрипт ініціалізації та заповлення.
     */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Write number of square matrix rows:");
		int n = console.nextInt();
		
		
		
			arrays.automatically(n);
		
		
	}
}
