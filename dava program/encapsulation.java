class Emp
{

	private int id;
	private String name;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
}
class Demo
{
	public static void main(String gg[])
	{
		Emp e=new Emp();
		//e.id=101;error
		e.setId(101);
		e.setName("hero");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}
}