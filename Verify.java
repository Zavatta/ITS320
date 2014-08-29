//Filename Verify.java
//Written by Mike Zavatta-MacDonald
//Written on 8/2/2014

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Verify
{
int min,max;
public Verify(int min,int max)
{
this.min = min;
this.max = max;
}
public void Validate(int number) throws Exception
{

if(number > 0 && number < min)
{
throw new NumberLowException("NumberLowException: number < 10");
//throw NumberLowException
}

if(number > max)
{
throw new NumberHighException("NumberHighException: number > 100");
//throw NumberHighException
}

if(number < 0)
{
throw new NumberNegativeException("NumberNegativeException: number < 0");
//Throw NumberNegativeException
}


if(number >= min && number <= max)
{
System.out.println("is a valid number");
//if not exception print valid number
}

}
}	
