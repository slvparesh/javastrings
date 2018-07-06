
public class Split 
{
public static void main(String args[])
{   
	String T = " good morning to q  ";
     String x[] = T.split(" ");
     String str = new String();
     for(int i = 0;i<x.length;i++)
     {
	System.out.println(x[i]);
     }
     for(int i=0;i<x.length;i++)
     {
    for(int j=i+1;j<x.length;j++)
    {
    	if(x[i].length()<x[j].length())
    	str = x[i];	
    	else
    	str = x[j];
    }}
    		System.out.println("Smallest word is "+str);
    
}
}

