import java.util.HashMap;
import java.util.Map;


abstract class phone implements Cloneable
{
	
	protected String phonename;
	
	abstract void addOS();
	
	public Object clone()
	{
		Object clone = null;
		try
		{
			clone = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clone;
	}
}

class Samsung extends phone
{
	public Samsung()
	{
		this.phonename = "S23";
	}

	@Override
	void addOS()
	{
		System.out.println("S23 added");
	}
	
}

class Iphone extends phone{

	public Iphone()
	{
		this.phonename = "Iphone 13";
	}

	@Override
	void addOS()
	{
		System.out.println("Iphone 13 added");
	}
}

class TataCliq {

	private static Map<String, phone> phonemap = new HashMap<String, phone>();
	
	static
	{
		phonemap.put("S23", new Samsung());
		phonemap.put("Iphone 13", new Iphone());
	}
	
	public static phone getPhone(String phoneName)
	{
		return (phone) phonemap.get(phoneName).clone();
	}
}


// Driver class
class prototype
{
	public static void main (String[] args)
	{
		TataCliq.getPhone("S23").addOS();
		TataCliq.getPhone("Iphone 13").addOS();
		TataCliq.getPhone("S23").addOS();
		TataCliq.getPhone("Iphone 13").addOS();
	}
}
