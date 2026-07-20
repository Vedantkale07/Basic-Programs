package com.exceptionHandling;

public class OpeationClass {
	
	public void operation(int num,int deno)
	{
		if(deno==0)
		{
			try 
			{
			throw new ConstomizeArithmetichException("numerator shouble be greather than 0");
			
			}
			catch(ConstomizeArithmetichException e)
			{
				System.out.println(e.getMessage());
			}
		}
		else {
			System.out.println("division is: "+num/deno);
		}
	}

}
