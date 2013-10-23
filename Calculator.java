public class Calculator {
	private int x;
	private int y;
	private int result;
	private double dblResult;
	
	public Calculator(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public int add()
	{
		result=x+y;
		return result;
	}

	public int subtract()
	{
		result=x-y;
		return result;
	}
	
	public int multiply()
	{
		result=x*y;
		return result;
	}
	
	public double divide()
	{
		dblResult=x/y;
		return dblResult;
	}
	
	public double modulo()
	{
		dblResult=x%y;
		return dblResult;
	}
}