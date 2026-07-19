package com.exceptionHandling;

public class NationalityClass {
	
	public void Nationality(String country) throws InvalidCountryException
	{
		if(!country.equals("india"))
		{
			try
			{	
				throw new InvalidCountryException("Can't procide !!user should be indian citizen.");
			}
			catch(InvalidCountryException e)
			{	
				System.out.println( e.getMessage());
			}
			
		}
		else 
		{
			System.out.println("you can procede..!!");
		}
	}
}
