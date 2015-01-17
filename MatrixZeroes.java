package DataStructures;

import java.util.*;

public class MatrixZeroes{
	public static void main(String[] args)
	{
		int[][] matrix = new int[4][4];
		int[] row = new int[4];
		int[] col = new int[4];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				matrix[i][j]=in.nextInt();
			}
		}
		System.out.println("The input matrix is as follows: ");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(matrix[i][j] == 0)
				{
				   row[i] = 1;
				   col[j] = 1;
				}
			}
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(row[i] == 1 || col[j] == 1)
				{
					   matrix[i][j] = 0;
				}
			}
		}
		System.out.println("The output matrix is as follows: ");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
