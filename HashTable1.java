import java.util.*;
import java.io.*;

public class HashTable1{
	public static void main(String args[])
	{
		Hashtable ht = new Hashtable();
		Enumeration names;
		String str;
		ht.put("Amar",9403779202L);
		ht.put("Sahil",34874242647L);
		ht.put("Soham",43278947234L);
		ht.put("Kiran",4298479280L);
		names = ht.keys();
		while(names.hasMoreElements())
		{
			str = (String)names.nextElement();
			System.out.println(str+":"+ht.get(str));
		}
	}
}
