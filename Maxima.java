
public class Maxima 
{
public static void main(String args[])
{
	int count[] = new int [260];
	String T = "ThejaswiThejjjj";
	int len = T.length();
	for(int i =0; i<len;i++)
	{
	count[T.charAt(i)]++;
	}
	int max = 0;
	char C = ' ';
	for(int i = 0;i<len;i++)
	{
		if(max<count[T.charAt(i)])
		{
			max = count[T.charAt(i)];
			C = T.charAt(i);
		}
	}
	 System.out.println("Maximum occurred char is" +C);
   int min = 9999;
	 for(int i = 0;i<len;i++)
		{
			if(min>count[T.charAt(i)])
			{
				min = count[T.charAt(i)];
				C = T.charAt(i);
			}
		}
		 System.out.println("Minimum occurred char is" +C);
	
}}