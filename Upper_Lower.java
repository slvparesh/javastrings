
public class Upper_Lower 
{
	public static void main(String args[])
	{
		String T = "ThejaswI";
		//char a[] = T.toCharArray();
		char ch;
		
		
		for(int i = 0; i<T.length();i++)
		{   
			ch = T.charAt(i);
		 if(Character.isUpperCase(T.charAt(i)))
			
		ch = Character.toLowerCase(T.charAt(i));
			
	     else if(Character.isLowerCase(T.charAt(i)))
			 
	     ch = Character.toUpperCase(T.charAt(i));
			
		
		System.out.print(ch);
	}
		
}
}
