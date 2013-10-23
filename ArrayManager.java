public class ArrayManager {
	private int[] src;
	private int result;
	
	public void arraySetter(String userInput)
	{
		int j=0;
		String numberStr;
		int inputLength=0;
		int cellCount=0;
		
		inputLength=userInput.length(); // to save compute cycles as will need to use string length many times
				
		cellCount = this.arraySize(userInput);
		
		// now initialise an int array with valid number of cells - n.b. there is one more number than commas
		src = new int[cellCount];

		//System.out.format("the string length is: %d and number of cells required is %d%n", inputLength,cellCount);
		
		numberStr="";
		for (int i=0; i<inputLength;i++) {
			if ((userInput.charAt(i) != ',')) {
				numberStr=numberStr+userInput.charAt(i);
			}
			if ((userInput.charAt(i) == ',') || i==(inputLength-1)) {
				src[j]=Integer.parseInt(numberStr);
				numberStr="";
				j++;
			}
		}
		// this.printArray(); if I wanted to print from this method ... but I moved printing to calling program
	}
	
	public int arraySize(String userInput)
	{
		int i;
		int commaCount=0;
				
		// first need to setup the array .... first iterate thru using the code to find commas .. use that to set 	
		for (i=0; i<userInput.length(); i++) {
			// n.b. only use one apostrophe for characters - a string assumes a string end character
			if (userInput.charAt(i)==',') {
				commaCount++;
			}
		}
		
		return commaCount+1;
	}
	
	public int[] arrayGetter()
	{
		return src;
	}
	
	public void printArray()
	{
		for (int i=0;i<src.length;i++) {
			System.out.format("the array value at cell %d is: %d%n", i,src[i]);
		}
	}
	
}