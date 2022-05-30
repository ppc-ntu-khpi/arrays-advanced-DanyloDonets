package arrays;

import java.util.Random;
import java.util.Scanner;
/**
 * ¬≥дпов≥даЇ за роботу з матрицею.
 *
 * @author ƒанило ƒонець
 * @version 1.0
 * @see arrays#arrays
 */
public class arrays {
	 
			/**
			 * 
			 * ќб'Їкт класу {@linkplain arrays}. ≤н≥ц≥ал≥зац≥€ та заповленн€ рандомничи числами в≥д 1 до 100 матриц≥ за вказаними розд≥лами
			 * @param n Ц розм≥р матриц≥ 
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
			 * ќб'Їкт класу {@linkplain arrays}. —ортуванн€ матрицы за зростанн€м зл≥ва-направо зверху-вниз
			 * @param n Ц розм≥р матриц≥ 
			 * @param matrix Ц матриц€
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
			 * ќб'Їкт класу {@linkplain arrays}. ¬иводить матрицю в консоль
			 * @param n Ц розм≥р матриц≥ 
			 * @param matrix Ц матриц€
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
