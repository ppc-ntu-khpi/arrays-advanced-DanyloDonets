package arrays;

import java.util.Scanner;

/**
 * ����� ������ ���� �� �����������.
 * ������ ��������� ���������� ������ main().
 *
 * @author ������ ������
 * @version 1.0
 * @see Main#main
 */

public class Main {
	 /**
     * ��'��� ����� {@linkplain main}.����� ������ ������ ������� ��������� ������ ����������� �� ����������.
     */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Write number of square matrix rows:");
		int n = console.nextInt();
		
		
		
			arrays.automatically(n);
		
		
	}
}
