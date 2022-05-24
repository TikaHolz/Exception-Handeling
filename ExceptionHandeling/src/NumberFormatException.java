
public class NumberFormatException
	{
	public static void NumberFormat()
		{
		String t = "";
		try
			{
			for(t = 10; t < 20; t++)	
				{
				System.out.println(t);	
				}
			//t = 10;
			
			}
		catch (NumberFormatException exc)
			{
			System.out.println("You changed a string to an int dummy");	
			}
		}
	}
