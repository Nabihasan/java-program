//list with forward and backword 
import java.util.ArrayList;
import java.util.ListIterator;
class Demo
{

	public static void main(String gg[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("aa");
		al.add("ccc");
		al.add("bbbb");
		al.add("aaaaa");
		ListIterator it=al.listIterator();
		System.out.println(">>>>>>>>>>>>>");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("<<<<<<<<<<<<<");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
}
}