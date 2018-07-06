import java.util.Arrays;

public class Sort 
{
	public static void main(String args[])
	{
		String  T =  "thejaswi";
		int i;
		char a[] = T.toCharArray();
		Arrays.sort(a);
		for( i = 0; i<a.length;i++)
			System.out.println(a[i]);
		for(i = 0; i<a.length;i++)
	if( i%2!= 0)
	{
		System.out.println("Odd positioned characters are " +a[i]);
	}
}
}
