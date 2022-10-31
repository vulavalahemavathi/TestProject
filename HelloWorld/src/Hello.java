import java.util.*;
public class Hello {
	public static void main(String ss[])
	{
		try (Scanner ob = new Scanner(System.in)) {
			String s=ob.next();
			   String str1="";
			   int x=0,y=0,z=1;
			   for(int i=0;i<s.length();i++)
			   {
				   str1+=s.charAt(i)+z;
				   x=y;
				   y=z;
				   z=x+y;
			   }
			   str1=str1.length()+str1;
		}
	}
}

