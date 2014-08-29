//Filename NumberNegativeException.java
//Written by Mike Zavatta-MacDonald
//Written on 8/27/2014
public class NumberNegativeException extends NumberLowException 
	{
 // creates exception object with no message
 // null message in superclass
	public NumberNegativeException()
	{ }
 // str used for exception message 
 // explicitly invokes superclass constructor   
 public NumberNegativeException(String str) 
	{ 
	super(str); 
	}

public String toString() 
	{	 
	return "NumberNegativeException"; 
	}
}
