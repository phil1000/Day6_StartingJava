// Simple groovy program that executes my own java classes - executed from the same directory
print("This program plays with arrays of integers");

print("\nPlease enter a list of integers separated by a comma\t");
String userInput=System.console().readLine();

// initialise the Array class
ArrayManager mySrcArray = new ArrayManager();

// now call some funky methods
mySrcArray.arraySetter(userInput); //populate array with user input
int aSize = mySrcArray.arraySize(userInput); // get size of array
println "\rThe size of the array is " + aSize;
mySrcArray.printArray(); //print the array

int[] intArray = mySrcArray.arrayGetter() //populate a new array with the contents of src

//print new array
for (int i=0; i<intArray.length;i++) {
	println "\r cell at " + i + " contains " + intArray[i]
}