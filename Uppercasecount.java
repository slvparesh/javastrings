
public class Uppercasecount 
{
public static void main(String args[])
{
	String T = "Thejaswi KARNAM";
	int a = 0;
	int b = 0;
	for(int i = 0; i<T.length()-1;i++)
	{   
		if(Character.isUpperCase(T.charAt(i)))
		a++;
		else if(Character.isLowerCase(T.charAt(i)))
		b++;
		
	}
	if( a == b)
	{
		System.out.println("Equally distributed");
	}
	else
	{
	System.out.println("Upper Case count = "+a);
	System.out.println("Lower Case count = "+b);
	}
}
}
