import java.util.ArrayList;
import java.util.Iterator;
class Demo
{

	public static void main(String gg[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("aa");
		al.add("ccc");
		al.add("bbbb");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

}
}