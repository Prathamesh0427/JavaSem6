import java.io.*;
import java.util.*;

public class LinkedlistFriends {
	public static void main(String args[]) throws Exception
	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			LinkedList li = new LinkedList();
			System.out.println("How many Names?");
			int n = Integer.parseInt(br.readLine());
			System.out.println("Enter Names of your Friends");
			for(int i = 0 ;i<n;i++)
			{
				li.add(br.readLine());
			}
			System.out.println("Entered Names are:"+li);
			
	}	
}
