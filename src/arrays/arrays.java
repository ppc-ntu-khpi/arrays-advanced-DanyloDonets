package arrays;

import java.util.Random;
import java.util.Scanner;
/**
 * ³������ �� ������ � ��������.
 *
 * @author ������ ������
 * @version 1.0
 * @see arrays#arrays
 */
public class arrays {
	 
			/**
			 * 
			 * ��'��� ����� {@linkplain arrays}. ����������� �� ���������� ���������� ������� �� 1 �� 100 ������� �� ��������� ��������
			 * @param n � ����� ������� 
			 */
			public static void automatically(int n) {
				int [][] matrix = new int[n][n];
				Random random = new Random();
				
				for(int i=0; i< n;i++) {
					for(int j=0;j<n;j++) {
						matrix[i][j] = random.ints(0, 100).findFirst().getAsInt();
					}
				}
				System.out.println("Your matrix:");
				see_matrix(matrix,n);
				System.out.println("Your sorted matrix:");
				matrix=sort(matrix,n);
				see_matrix(matrix,n);
				
			}
			
			/**
			 * 
			 * ��'��� ����� {@linkplain arrays}. ���������� ������� �� ���������� ����-������� ������-����
			 * @param n � ����� ������� 
			 * @param matrix � �������
			 * @return matrix
			 */
			public static int [][] sort(int matrix [][], int n){
				int buff = 0;
				for(int i=0; i< n;i++) {
					for(int j=0;j<n;j++) {
						for(int k =0;  k<n;k++) {
							for(int p = 0;p<n;p++) {
								if (matrix[i][j] < matrix[k][p]) {
									buff = matrix[i][j];
									matrix[i][j] = matrix[k][p];
									matrix[k][p] = buff;
								}
							 }
						}
					}
				}
				
				
				
				return matrix;
			}
			
			/**
			 * 
			 * ��'��� ����� {@linkplain arrays}. �������� ������� � �������
			 * @param n � ����� ������� 
			 * @param matrix � �������
			 */
			
			public static void see_matrix(int matrix[][],int n) {
				for(int i=0; i< n;i++) {
					for(int j=0;j<n;j++) {
						System.out.print("["+matrix[i][j]+"]");
					}
					System.out.print("\n");
				}
			}
			
			
			
}
