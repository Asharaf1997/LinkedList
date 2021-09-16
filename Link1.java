import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Link1s
{

	public static void main(String[] args)
	{
		LinkedList<String> al = new LinkedList<String>();
		al.add("Kalyan");
		al.add("Ganesh");
		al.add("Akshay");
		al.add("Asharaf");
		al.add("Riyaj");
		
		Iterator<String> it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------------------First-----------------------");
		
		Collections.sort(al);
		
		it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--------------------Second-------------------------");
		
		ListIterator<String> li=al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
			
		}
		
		System.out.println("-----------------Previ-------------------------");
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
			
		}
		System.out.println("--------Inhance for-------");
		for(String s:al)
			System.out.println(s);
		
	}
}