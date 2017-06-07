package cn.htu.util;

public class Sqlutil {
	
	
	public static String TransactSQLInjection(String str) 
	{ 
	return str.replaceAll(".*([';]+|(--)+).*", " "); 
	} 

}
