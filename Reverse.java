
public class Reverse 
{
public static void main(String args[])
{
	String S = "Wipro";
	String S1 = "Wipro";
	if(S.equalsIgnoreCase(S1))
	{
		char a[] = S.toCharArray();
	    for (int i = a.length-1; i>=0; i--)
            System.out.print(a[i]);
		
	}
	else 
	{
		System.out.println("Reverse Not Supported");
	}
}
}
