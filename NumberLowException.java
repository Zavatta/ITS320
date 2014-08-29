//Filename NumberLowException.java
//Written by Mike Zavatta-MacDonald
//Written on 8/27/2014
public class NumberLowException extends Exception 
	{
 // creates exception object with no message
 // null message in superclass
	public NumberLowException()
	{ }
 // str used for exception message 
 // explicitly invokes superclass constructor   
 public NumberLowException(String str) 
	{ 
	super(str); 
	}

public String toString() 
	{	 
	return "NumberLowException"; 
	}
}
