import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Hello {
	public static void main(String ss[])
	{
		Scanner ob=new Scanner(System.in);
		Queue<String> q=new LinkedList<String>();
		Stack<String> A=new Stack<String>();
		Stack<String> B=new Stack<String>();
		Stack<String> C=new Stack<String>();
		char c,k;
		int n=1;
		for(int i=0;;i++)
		{
			String s=ob.nextLine();
			if(s.charAt(0)=='D')
				break;
			else
			{
				if(s.charAt(0)=='R')
				{
					q.add(s.substring(5,s.length()));
				}
				else if(s.charAt(0)=='L')
				{
					c=s.charAt(5);
					if(c=='A')
						A.push(q.remove());
					else if(c=='B')
					{
						B.push(q.remove());
					}
					else
						C.push(q.remove());
				}
				else if(s.charAt(0)=='X')
				{
					c=s.charAt(5);
					k=s.charAt(7);
					if(c=='A')
					{
						if(k=='B')
							B.push(A.pop());
						else
							C.push(A.pop());
					}
					else if(c=='B')
					{
						if(k=='A')
							A.push(B.pop());
						else
							C.push(B.pop());
					}
					else
					{
						if(c=='A')
							A.push(C.pop());
						else
							B.push(C.pop());
					}
				}
				else if(s.charAt(0)=='S')
				{
					c=s.charAt(5);
					System.out.println("VACTRAIN"+" "+n++);
					if(c=='A')
					{
						for(int j=0;j<A.size();j++)
						{	
							System.out.println(A.pop());
						}
					}
					else if(c=='B')
					{
						for(int j=0;j<B.size();)
						{	
							System.out.println(B.pop());
						}
					}
					else
					{
						for(int j=0;j<C.size();)
						{	
							System.out.println(C.pop());
						}
					}
				}
			}
		}
	}
}

