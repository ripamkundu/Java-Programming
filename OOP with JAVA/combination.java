import java.io.*;
public class combination
{
	public static void main (String [] arg)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, j, k;
		for (i = 1; i<=3; i++)
		{
			for(j = 1; j<=3; j++)
			{
				for(k=1; k<=3; k++)
				{
					System.out.println("" +i+j+k);
					if(i!= j && i!= k && j!= k)
					{
						System.out.println(" "+i+j+k);
					}
				}
			}
		}
	}		
}