package arrays;

import java.util.Random;
import java.util.Scanner;

public class arrays {
	 

			public static void automatically(int m) {
				int [][] matrix = new int[m][m];
				Random random = new Random();
				
				for(int i=0; i< m;i++) {
					for(int j=0;j<m;j++) {
						matrix[i][j] = random.ints(0, 100).findFirst().getAsInt();
					}
				}
				System.out.println("Your matrix:");
				see_matrix(matrix,m);
				System.out.println("Your sorted matrix:");
				matrix=sort(matrix,m);
				see_matrix(matrix,m);
				
			}
			
			
			public static int [][] sort(int matrix [][], int m){
				int buff = 0;
				for(int i=0; i< m;i++) {
					for(int j=0;j<m;j++) {
						for(int k =0;  k<m;k++) {
							for(int p = 0;p<m;p++) {
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
			
			public static void see_matrix(int matrix[][],int m) {
				for(int i=0; i< m;i++) {
					for(int j=0;j<m;j++) {
						System.out.print("["+matrix[i][j]+"]");
					}
					System.out.print("\n");
				}
			}
			
			
			
}
