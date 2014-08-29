//Filename NumberHighException.java
//Written by Mike Zavatta-MacDonald
//Written on 8/27/2014

public class NumberHighException extends Exception 
	{
 // creates exception object with no message
 // null message in superclass
	public NumberHighException()
	{ }
 // str used for exception message 
 // explicitly invokes superclass constructor   
 public NumberHighException(String str) 
	{ 
	super(str); 
	}

public String toString() 
	{	 
	return "NumberHighException"; 
	}
}
