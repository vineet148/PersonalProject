package com.example.algopractice.backtracking;

public class NQueen {


	public static void main(String args[]) {
		int n = 4;
		
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-
		-boolean[][] arr = new boolean[n][n];
		//findNQueen(arr, "", 0);

		rec(10);
	}

	private static  int rec(int n)
	{
		
		if(n==1)
		{
			return 1;
		}
		int x=n*rec(n-1);
		System.out.println(x);
		
		return x;
		
		
	}
	private static void findNQueen(boolean[][] arr, String ansf, int row) {
		// TODO Auto-generated method stub

		if (row == arr.length) {
			System.out.println(ansf);
			return;

		}

		for (int col = 0; col < arr[0].length; col++) {

			if(safeToPlaceQueen(arr,row,col))
			{
				arr[row][col]=true;
			    findNQueen(arr, ansf + row + "-"+ col+ ",", row+1);
			    arr[row][col]=false;
			
			}
			
			
			
		}

	}

	private static boolean safeToPlaceQueen(boolean[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		
		for(int i=row-1,j=col;i>=0;i--)
		{
			if(arr[i][j]==true)
			{
				return false;
			}
		}
	
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
		{
			if(arr[i][col]==true)
			{
				return false;
			}
		}
	
		for(int i=row-1,j=col+1;i>=0 && j< arr.length;i--,j++)
		{
			if(arr[i][col]==true)
			{
				return false;
			}
		}
	return true;
	}

}
