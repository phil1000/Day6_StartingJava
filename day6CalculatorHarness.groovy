// Simple groovy program that executes my own java classes - executed from the same directory
print("This first program does some simple math");

int x;
int y;

print("\nPlease enter your first number, x\t");
x=Integer.parseInt(System.console().readLine());

print("\nPlease enter your second number, y\t");
y=Integer.parseInt(System.console().readLine());

// initialise a Calculator class
Calculator myCalculator = new Calculator(x,y);

// now call some funky methods
print(myCalculator.add() + "\n");
print(myCalculator.subtract() + "\n");
print(myCalculator.multiply() + "\n");
print(myCalculator.divide() + "\n");
print(myCalculator.modulo() + "\n");