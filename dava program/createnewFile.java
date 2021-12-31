import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
class NewFile
{

	public static void main(String gg[])
	{	
		//code to create new file
	/*
		File f=new File("E:\\Demo.txt\\");
		try
		{
		f.createNewFile();
		}
		catch(Exception e)
		{	System.out.println("unable to create this file");
			e.printStackTrace();
		}
		
         //code  write to file 
		try
		{
		  FileWriter f=new FileWriter("E:\\Demo.txt\\");
		
			f.write("this is our file ");
			f.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		} 

			
		// code to reading the file
		File f=new File("E:\\Demo.txt\\");
		try
		{
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		*/
		// code for delete the file
		File f=new File("E:\\Demo.txt\\");
		if(f.delete())
		{
			System.out.println("i have deleted my file :"+  f.getName());
			
		}
		else
		{
			System.out.println("some problem occur while deleting the file ");
		}
	
	}
}