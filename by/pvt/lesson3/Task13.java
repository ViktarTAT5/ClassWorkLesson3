package by.pvt.lesson3;

public class Task13 {

	public static void main(String[] args) {

		int[][] matrix ={
				{-9,1,0,2},
				{4,1,1, 0},
				{-2,2,-1, 9}
			};	

		int x = 0;
		int y = 2;
		
		if(matrix.length >= y && matrix.length >= x){
			
			int[] temp = new int [matrix[x].length];
				 
			for(int i = 0; i < matrix[0].length; i++){
				
				temp[i] = matrix[x][i];
				matrix[x][i] = matrix[y][i];
				matrix[y][i] = temp[i];
				
			}
			
		}else{
			System.out.println("X or Y > matrix.length");
		}
		
		
		for(int i = 0; i < matrix.length; i++){
			
			for(int j = 0; j < matrix[0].length; j++){
				
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println("");
		}
		
	}
}


