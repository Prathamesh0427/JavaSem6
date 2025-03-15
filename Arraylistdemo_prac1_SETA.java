import java.util.*;
import java.io.*;

public class Arraylistdemo_prac1_SETA {
	public static void main(String args[]) throws Exception
	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ArrayList al = new ArrayList();
			System.out.println("How many Cities?");
			int n = Integer.parseInt(br.readLine());
			System.out.println("Enter Cities");
			for(int i = 0 ;i<n;i++)
			{
				al.add(br.readLine());
			}
			System.out.println("Entered Cities are:"+al);
			al.removeAll(al);
			System.out.println("All cities are removed from the ArrayList"+al);
	}	
}
