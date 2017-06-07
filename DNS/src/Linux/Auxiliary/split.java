package Linux.Auxiliary;

public class split {

	public String split(String str)
	{
		String a[]=str.split("\\.");
		return a[2]+"."+a[1]+"."+a[0];
		
	}

}
