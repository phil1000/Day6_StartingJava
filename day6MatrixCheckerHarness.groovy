// Simple groovy program that executes my own java classes - executed from the same directory
print("This first program does matrix checking");

int x, updateRow, updateCol;
int y;
String updateString;

print("\nPlease enter the number of rows, x\t");
x=Integer.parseInt(System.console().readLine());

print("\nPlease enter the number of columns, y\t");
y=Integer.parseInt(System.console().readLine());

// initialise a Matrix class
MatrixChecker myMatrixChecker = new MatrixChecker(x,y);

print("Now enter the values you want to insert\n");
print("Use commas to separate values in a single row and\n");
print("a Semi Colon to denote a new row of values\n");

updateString=System.console().readLine();

// populate the matrix with the string

myMatrixChecker.setMatrix(updateString);
myMatrixChecker.printMatrix();

//Now test if the matrix is symmetrical 

if (x==y) {
	if (myMatrixChecker.isSymmetrical()) {
		print("Symmetrical\n");
	}
	else {
		print("Asymmetrical\n");
	};
}
else {
	print("cannot be symmetrical as different number of rows and columns\n");
}