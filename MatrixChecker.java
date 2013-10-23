public class MatrixChecker {
	private int [][] matrix;
	private int result;
	
	public MatrixChecker(int x, int y)
	{		
		int row, column;
		
		matrix= new int[x][y];
		
		for (row=0;row<x; row++) {
			for (column=0;column<y; column++) {
				matrix[row][column] = 1; // populate all rows & columns with 1
			}
		}
		
	}
	
	public void setElement(int x, int y, int value) {
		
		if ((x >= matrix.length) || (y >= matrix[0].length)) {
			System.out.format("Matrix coordinates out of range%n");
		}
		else {
			matrix[x][y]=value;
		}
	}
	
	public void setMatrix(String userInput) {
	
		String rowString = "";
		int rowCount=0;
		for (int i=0; i<userInput.length();i++) {
			if ((userInput.charAt(i) != ';')) {
				rowString=rowString+userInput.charAt(i);
			}
			if ((userInput.charAt(i) == ';') || i==(userInput.length()-1)) {
				if (rowCount>=matrix.length) {
					System.out.format("Too many rows provided and so extra rows ignored%n");
					break;
				}
				else {
					this.setRow(rowCount, rowString);
					rowString="";
					rowCount++;
				}
			}
		}
	}
	
	public void setRow(int x, String userInput) {
		String numberStr;
		int colCount=0;
		
		if (x >= matrix.length) {
			System.out.format("Row coordinates out of range%n");
		}
		else {
			numberStr="0";
			for (int i=0; i<userInput.length();i++) {
				if ((userInput.charAt(i) != ',')) {
					numberStr=numberStr+userInput.charAt(i);
				}
				if ((userInput.charAt(i) == ',') || i==(userInput.length()-1)) {
					if (colCount>=matrix[x].length) {
						System.out.format("Extra column entries ignored%n");
						break;
					}
					else {
						matrix[x][colCount]=Integer.parseInt(numberStr);
						numberStr="";
						colCount++;
					}
				}
			}
			
			if (colCount<matrix[x].length-1) {
				System.out.format("Too few column entries provided%n");
			}
		}
	}
	
	public void setColumn(int y, String userInput) {
		String numberStr;
		int rowCount=0;
		
		if (y >= matrix[0].length) {
			System.out.format("Column coordinates out of range%n");
		}
		else {
			numberStr="0";
			for (int i=0; i<userInput.length();i++) {
				if ((userInput.charAt(i) != ',')) {
					numberStr=numberStr+userInput.charAt(i);
				}
				if ((userInput.charAt(i) == ',') || i==(userInput.length()-1)) {
					if (rowCount>=matrix.length) {
						System.out.format("Extra row entries ignored%n");
						break;
					}
					else {
						matrix[rowCount][y]=Integer.parseInt(numberStr);
						numberStr="";
						rowCount++;
					}
				}
			}
			
			if (rowCount<matrix.length-1) {
				System.out.format("Too few row entries provided%n");
			}
		}
	}
	
	public boolean isSymmetrical() {
		boolean result=true;
		int row, column;
		
		for (row=0; row<matrix.length; row++) {
			for (column=0;column<matrix[row].length; column++) {
				if (matrix[row][column] != matrix[column][row]) {
					result=false;
					break;
				}
			}
		}
		
		return result;
	}
	
	public void printMatrix() {
	
		for (int row=0;row<matrix.length; row++) {
			for (int column=0;column<matrix[row].length; column++) {
				System.out.format("%d\t", matrix[row][column]);
			}
			System.out.format("%n");
		}
		
		System.out.format("Number of rows=matrix.length=%d%n", matrix.length);
		System.out.format("Columns in first row =matrix[value].length=%d%n", matrix[0].length);
	}
}