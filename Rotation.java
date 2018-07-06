
public class Rotation 
{
public static void main(String args[])
{
	String T = "thejaswik";
	String Y;
	if(T.length()%2 == 0)
	{
	System.out.println("Clockwise Rotation");
	System.out.print(T.substring(T.length()-1));
	Y = T.substring(0,T.length()-1);
	System.out.print(Y);
	}
	else
	{
		System.out.println("Anticlockwise Rotation");
		Y = T.substring(1,T.length());
		System.out.print(Y);
		System.out.print(T.substring(0,1));
	}
	
	
			
}
}
