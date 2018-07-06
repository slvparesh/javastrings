
public class Merge 
{
	public static void main(String[] args)
		{
			int i;
			String str1 = new String("ABC");
			String str2 = new String("DEFGH");
			String str3 = new String();
			
			if(str1.length()== str2.length())
			for(i=0; i<str1.length();i++)
			{
				
				str3 = str1.charAt(i)+"".concat(str2.charAt(i)+"");
				System.out.print(str3);
			}
			else
				for(i=0; i<str1.length();i++)
				{
					
					str3 = str1.charAt(i)+"".concat(str2.charAt(i)+"");
					System.out.print(str3);
				}
					System.out.print(str2.substring(i, str2.length()));
			
				
			
	        
	}
	}
