// Simple groovy program that executes my own java classes - executed from the same directory
print("This first program does matrix manipulation");

int x, updateRow, updateCol;
int y;
String updateString;

print("\nPlease enter the number of rows, x\t");
x=Integer.parseInt(System.console().readLine());

print("\nPlease enter the number of columns, y\t");
y=Integer.parseInt(System.console().readLine());

// initialise a Matrix class
Matrix myMatrix = new Matrix(x,y);
myMatrix.printMatrix();
myMatrix.setElement(x-1,y-1, 66); // randomnly set an element, needs to be at least 1 less than number of row/columns
myMatrix.printMatrix();
print("Please enter the number of a row you want to update\t");
updateRow=Integer.parseInt(System.console().readLine());
updateRow=updateRow-1; // Arrays start at 0 and so an to update row 2 means sending a row=1 to the method
print("Now enter the values you want to insert, separated by commas\t");
updateString=System.console().readLine();
myMatrix.setRow(updateRow, updateString);
myMatrix.printMatrix();

print("Please enter the number of the column you want to update\t");
updateCol=Integer.parseInt(System.console().readLine());
updateCol=updateCol-1; // Arrays start at 0 and so an to update column 2 means sending a column=1 to the method
print("Now enter the values you want to insert, separated by commas\t");
updateString=System.console().readLine();
myMatrix.setColumn(updateCol, updateString);
myMatrix.printMatrix();