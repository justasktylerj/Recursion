package model;

public class RecursionTool 
{
	public int getFibNumber(int position)
	{
		int calculatedFib = 0;
		
		//defensive code against evil
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		//base case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else //recursive code
		{
			return getFibNumber(position -1) + getFibNumber(position -2);
		}
	}
		public int getFactorialNumber(int position)
		{
			if(position < 0)
			{
				return Integer.MIN_VALUE;
			}
			if(position == 0)
			{
				return 1;
			}
			else
			{
				return position * getFactorialNumber(position -1);
			}
		}
		
}
