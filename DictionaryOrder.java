import java.util.Arrays;

public class DictionaryOrder 
{
	public static void main(String args[])
	{
String T = "abap abs also ab aa english egg french disc  enemy";
String x[] = T.split(" ");

String temp;
  for (int i =0; i<x.length;i++)
  System.out.println(x[i]);
  for (int i = 0; i < x.length; i++) 
  {
      for (int j = i + 1; j < x.length; j++) 
      {
          if (x[i].compareTo(x[j])>0) 
          {
              temp = x[i];
              x[i] = x[j];
              x[j] = temp;
          }
      }
}

  Arrays.sort(x);
  System.out.print("Names in Sorted Order:");
  for (int i = 0; i < x.length; i++) 
  {
      System.out.print(x[i] + ",");
  }

  
}
}
