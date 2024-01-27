public class Christmas implements Runnable 
{
    
    public void run() 
	{
       char[][] data=
	   {
        {46,113,103,103,76,32,32,42,32,32,46,103,103,103,114,46,32,32,46,32,32,32,32,32,32,32,32,32,39,32,32,32,32,32,32,32,32,32,32,32,32,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,42,32,32,32,32,32,32,32,32,32,32,32,32,46,32,32,32,32,32,43,32},
        {32,32,80,77,77,76,32,32,46,32,47,124,77,77,32,32,32,32,32,32,32,32,39,46,32,32,32,32,32,32,32,43,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,39,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {32,32,124,33,77,77,44,39,32,47,96,124,77,77,32,32,46,100,47,34,113,44,32,32,113,103,103,59,43,77,108,32,113,103,103,59,43,77,108,32,118,103,103,46,32,46,121,46,32,32,32,32,32,32,32,32,32,32,32,32,86,118,32,32,32,86,118,32,32,32,86,118,32,32,32,86,118},
        {32,32,124,32,89,77,77,44,106,39,32,124,77,77,32,32,77,77,59,46,106,77,108,32,124,77,77,96,32,34,32,32,124,77,77,96,32,34,32,32,32,113,77,124,32,106,96,32,32,32,120,32,32,79,32,32,32,32,32,32,111,44,32,32,32,111,44,32,32,32,111,44,32,32,32,111,44},
        {32,32,124,32,32,113,77,35,39,32,32,124,77,77,32,32,77,77,124,32,32,32,32,32,124,77,77,32,32,43,32,32,124,77,77,32,32,32,32,46,32,32,77,77,103,39,32,32,47,40,95,41,123,45,125,43,45,45,61,61,61,45,45,61,61,61,45,45,61,61,61,45,45,61,61,61},
        {46,106,124,46,32,32,113,70,32,32,46,43,77,77,46,46,39,77,77,98,120,114,96,32,106,77,77,46,32,32,32,32,106,77,77,46,32,32,42,32,32,32,39,77,70,32,32,32,92,61,61,61,61,61,47,32,32,32,62,32,62,32,32,62,32,62,32,32,62,32,62,32,32,62,32,62},
        {32,46,32,32,32,42,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,120,44,32,47},
        {32,32,46,120,47,45,45,92,120,120,108,32,44,120,120,32,32,32,32,32,46,32,32,32,42,32,32,32,32,32,44,103,98,32,32,32,32,32,32,32,118,35,39,32,46,32,32,32,32,32,32,32,32,46,32,39,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,42},
        {46,100,77,84,32,32,32,32,39,113,124,32,124,77,77,32,32,39,32,32,32,32,32,32,32,32,32,32,32,32,39,34,39,32,32,32,32,32,32,32,32,32,46,100,77,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,42},
        {100,77,77,32,32,42,32,32,32,32,96,32,124,77,77,47,100,77,103,44,32,32,113,103,103,59,43,77,108,32,113,103,103,32,32,106,47,34,96,43,32,32,113,77,77,45,46,32,113,103,103,47,100,77,35,44,119,35,77,98,32,32,44,103,39,96,102,103,44,32,106,47,34,96,43},
        {77,77,77,32,32,32,32,46,39,32,32,32,124,77,77,32,32,77,77,124,32,32,124,77,77,96,32,34,32,32,124,77,77,32,32,77,77,98,120,47,32,32,124,77,77,32,32,32,124,77,77,32,32,124,77,124,32,32,77,77,32,32,96,112,39,46,32,77,124,32,77,77,98,120,47},
        {39,77,77,108,32,32,43,32,32,32,46,32,124,77,77,32,32,77,77,124,32,32,124,77,77,32,32,46,32,32,124,77,77,32,32,46,96,118,77,77,108,32,124,77,77,32,32,32,124,77,77,32,32,124,77,124,32,32,77,77,32,32,44,32,44,33,46,32,124,32,46,96,118,77,77,108},
        {32,39,118,77,98,46,46,46,114,47,96,32,106,77,77,46,46,77,77,124,46,32,106,77,77,46,32,32,43,32,106,77,77,46,32,43,44,46,44,80,39,32,39,77,77,120,58,32,106,77,77,46,46,100,77,124,46,46,77,77,44,32,77,32,106,39,116,32,124,32,43,44,46,44,80,39},
        {32,32,32,32,32,34,34,32,32,32,32,32,32,32,32,32,46,39,32,32,32,32,32,32,32,32,42,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,32,32,32,32,32,42,32,32,32,32,32,32,32,32,60,61,45,61,58,58,32,45,61,45,62,32,32,32,46,32,39},
        {45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,32,34,61,105,46,58,32,91,45,39,32,33,33,33,33,33,33},
        {95,47,73,92,95,95,95,95,95,95,95,95,95,95,95,95,95,111,95,95,95,95,95,95,95,95,95,95,95,95,95,95,111,95,95,95,47,73,92,32,32,32,40,40,40,32,42,32,32,46,32,32,47,42,95,95,32,32,39,32,32,32,47,59,58,34,58,46,92,32,32,46,32,32,41,41,41},
        {73,34,34,34,95,95,95,95,95,95,95,95,95,95,95,95,95,124,95,95,95,95,95,95,95,95,95,95,95,95,95,95,124,95,95,95,34,34,34,73,92,32,40,40,40,32,32,32,32,42,47,47,95,124,95,95,124,95,32,32,32,59,125,39,32,32,32,39,40,44,32,32,39,32,41,41,41},
        {32,91,95,95,93,91,95,95,93,91,40,42,42,42,42,42,42,41,95,95,93,91,95,95,93,40,42,42,42,42,42,42,41,91,95,95,93,91,93,32,92,124,40,40,40,92,32,45,45,47,47,45,45,40,111,111,41,45,45,45,45,32,42,32,32,111,32,32,42,32,45,45,45,45,41,41,41},
        {32,91,93,91,95,95,93,91,95,95,40,42,42,42,42,42,42,41,93,91,95,95,93,91,95,40,42,42,42,42,42,42,41,95,93,91,95,95,93,32,124,32,124,124,124,92,92,32,47,47,62,45,40,32,32,32,32,41,45,60,42,32,92,92,32,32,32,32,79,32,42,32,32,32,124,124,124},
        {32,91,95,95,93,91,95,95,93,91,95,124,32,32,32,32,124,91,95,95,93,91,95,95,93,91,124,32,32,32,32,124,93,91,95,95,93,91,93,32,124,32,124,124,124,32,92,92,41,41,46,40,46,32,32,32,32,46,41,32,42,32,32,32,92,92,32,32,32,32,32,42,42,32,124,124,124},
        {32,91,93,91,95,95,93,91,95,95,93,124,32,32,32,46,124,95,93,91,95,95,93,91,95,95,124,32,32,32,46,124,95,95,93,91,95,95,93,32,124,32,124,124,124,32,32,124,124,32,32,32,32,39,39,39,39,32,32,32,42,32,32,32,32,32,92,92,32,32,32,42,32,32,124,124,124},
        {32,91,95,95,93,91,95,95,93,91,47,32,32,32,60,95,41,91,95,95,93,91,95,95,93,47,32,32,32,60,95,41,93,91,95,95,93,91,93,32,124,32,40,40,40,34,32,124,124,32,32,32,42,32,32,32,32,32,32,42,32,32,42,32,32,32,32,32,92,92,32,32,42,32,41,41,41},
        {32,91,93,91,95,95,93,91,32,47,46,46,44,47,93,91,95,95,93,91,95,95,93,91,47,46,46,44,47,95,93,91,95,95,93,91,95,95,93,32,124,32,40,40,40,32,47,32,92,92,32,32,32,32,46,32,32,32,42,42,32,32,32,32,79,32,32,32,32,32,92,92,42,42,41,41,41},
        {32,91,95,95,93,91,95,95,40,95,95,47,95,76,95,76,95,76,95,76,95,76,95,40,95,95,47,95,76,91,95,95,93,91,95,95,93,91,93,32,124,32,40,40,40,95,95,95,95,95,95,95,95,95,95,95,95,95,95,42,92,92,32,32,32,32,32,32,32,42,32,32,42,32,41,41,41},
        {32,91,95,95,93,91,95,95,93,93,32,124,32,32,32,32,32,44,32,32,44,32,46,32,32,32,32,32,32,91,95,95,93,91,95,95,93,91,93,32,124,32,124,124,124,45,45,45,45,45,45,45,45,45,45,45,45,45,42,32,32,32,92,92,32,111,32,32,32,32,32,32,32,42,124,124,124},
        {32,91,93,91,95,95,93,91,95,93,32,124,32,32,32,46,39,105,44,35,39,47,32,44,32,32,32,32,32,91,93,91,95,95,93,91,95,95,93,32,124,32,32,32,62,60,32,32,32,32,32,32,32,32,32,32,42,42,32,32,32,111,32,32,92,92,32,32,32,40,41,32,32,42,42,32},
        {32,91,95,95,93,91,95,95,93,93,32,124,32,32,79,46,39,92,35,47,35,47,44,32,79,32,32,32,32,91,95,95,93,91,95,95,93,91,93,32,124,32,37,37,124,124,37,37,32,32,62,111,60,32,32,42,42,32,32,32,32,32,32,32,32,32,92,92,32,32,32,32,32,32,42,42},
        {95,91,93,91,95,95,93,91,95,93,32,124,95,95,124,61,64,64,64,64,64,64,64,61,124,95,95,95,95,91,93,91,95,95,93,91,95,95,93,32,124,95,61,61,61,61,61,61,95,38,38,38,38,38,95,42,32,32,32,60,62,32,32,32,32,32,111,32,92,92,32,32,79,32,32,42,95},
        {32,91,95,95,93,91,95,95,93,93,47,32,32,47,124,92,45,45,45,45,45,45,45,47,124,92,32,32,32,91,95,95,93,91,95,95,93,91,93,47,32,32,37,37,124,124,37,37,32,38,38,38,38,38,32,32,92,92,32,32,32,32,32,32,42,32,32,32,32,32,32,32,32,32,47,47},
        {32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,95,32,32,32,32,32,32,32,59,45,45,58,45,32,32,32,32,32,32,32,32,32,32,95,95,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,95,95,95,32,32,95,95,45,45,45},
        {32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,99,45,45,85,45,45,45,94,45,45,39,39,95,95,91,95,32,32,111,111,111,95,95,95,32,32,124,32,124,95,33,95,124,124,95,33,95,124,124,95,33,95,124,32,124,32,32,32,124,32,124,95,33},
        {32,32,32,32,32,32,32,32,32,32,32,32,32,32,95,45,45,95,32,32,32,32,32,95,124,45,45,45,45,45,45,45,45,45,45,45,45,39,95,124,44,91,95,95,95,95,95,95,93,44,124,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,124,95,124,44,124,95,95,95,95},
        {32,32,32,32,32,32,32,32,32,32,32,32,32,47,32,32,32,32,92,95,95,32,47,95,95,40,64,41,40,64,41,61,61,40,64,41,40,64,41,32,32,32,40,111,41,94,40,111,41,32,32,32,32,40,111,41,40,111,41,45,45,40,111,41,40,111,41,32,32,32,32,32,32,32,32,40,111},
        {34,124,92,34,34,34,126,34,34,34,126,34,47,32,32,32,32,64,32,32,32,92,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34},
        {32,92,32,92,95,45,45,45,45,45,45,124,32,32,32,32,92,32,32,46,58,124,62,32,32,32,32,32,32,95,95,84,95,61,61,61,61,61,61,61,61,61,61,61,95,95,95,32,32,95,95,95,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,95,95,32,32,95,95,95,45,45,45},
        {32,32,92,32,32,32,32,35,35,35,35,124,32,32,32,32,124,32,92,95,95,47,32,32,32,32,32,32,32,32,124,46,46,124,95,105,95,124,46,124,95,105,95,124,46,46,124,32,32,32,124,32,124,95,33,95,124,124,95,33,95,124,124,95,33,95,124,32,124,32,32,32,124,32,124,95,33},
        {32,32,47,32,32,47,32,32,35,35,32,32,32,32,32,32,32,92,124,32,32,32,32,32,32,32,32,32,124,95,124,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,124,44,124,95,124,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,95,124,44,124,95,124,95,95,95,95},
        {32,47,32,32,47,34,45,95,95,95,95,95,95,45,34,92,32,32,92,32,32,32,32,32,32,32,32,32,32,32,32,32,32,40,111,41,40,111,41,45,40,111,41,40,111,41,32,32,32,32,32,32,32,40,111,41,40,111,41,45,45,40,111,41,40,111,41,32,32,32,32,32,32,32,32,40,111},
        {34,76,95,74,74,34,126,34,34,34,126,34,34,34,126,34,92,95,74,74,34,34,126,34,34,34,126,34,34,34,126,34,34,34,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34,126,34,34,34}
    };
       boolean direction=false;
       for(int i=0;i<data.length;i++)
	   {
           try 
		   {
             direction=!direction; 
             if (direction)
			 {
                for(int x=0;x<data[i].length;x++)
				{               
                   Thread.sleep(10);
                   System.out.print(data[i][x]);
                }
             }
			 else
			 {
                for(int x=data[i].length-1;x>=0;x--)
				{ 
                   for(int y=0;y<x;y++)
				   {
                       System.out.print(" ");
                   } 
                   Thread.sleep(10);
                   System.out.print(data[i][x]+"\r");
                }
             }
             
               System.out.println();
           
           } catch (InterruptedException ex)
		   {
               ex.printStackTrace();
           }
       }
    }
    public static void main(String[] args) 
	{
        new Thread(new Christmas()).start();       
    }
}