
public class Index_ASCII
{
public static void main(String args[])
{
	String T = "THEJASWI";
	char a[] = T.toCharArray();
	int c = 0;int age;
	int k;int temp = 64;
	k = (int)a[a.length-1];
	if(k>=65 && k<90)
	c = (k-temp);
	if(c<0)
		c = c*-1;
	System.out.print(c);
	age = T.length()+c;
	System.out.println("age:" +age);
	
	
	
}
}
