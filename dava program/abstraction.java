abstract class Rbi
{
	final void rules()
	{
		System.out.println("rules by rbi");
	}
	abstract void deposit();
}
class Sbi extends Rbi
{
	void deposit()
	{
		System.out.println("you can deposite in Sbi");
	}
}
class Demo
{
	public static void main(String gg[])
		{
			//Rbi r=new Rbi();//error
			Sbi s=new Sbi();
			s.rules();
			s.deposit();
			Rbi r=new Sbi();//upcasting
			r.rules();
			r.deposit();
		}
}