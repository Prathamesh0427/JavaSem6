import java.util.*;
import java.io.*;

public class Phone{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Prathamesh\\Desktop\\Sem6\\Java\\record.txt");
			Scanner sc = new Scanner(fis).useDelimiter("\t");
			Hashtable<String,String> ht = new Hashtable<String,String>();
			String [] strarray;
			String a,str;
			while(sc.hasNext())
			{
				a = sc.nextLine();
				strarray = a.split("\t");
				ht.put(strarray[0],strarray[1]);
				
				System.out.println("Hashtable values are:"+strarray[0]+":"+strarray[1]);
			}
			Scanner sd = new Scanner(System.in);
			System.out.println("Enter the name as given in the phonebook");
			str = sd.next();
			if(ht.containsKey(str)) {
				System.out.println("Phone no is:"+ht.get(str));
			}
			else {
				System.out.println("Name is not Matched");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
