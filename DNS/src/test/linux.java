package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.junit.Test;

import Linux.Auxiliary.Shell;
import Linux.Auxiliary.namedString;

public class linux {
	public static String namedpath="C:\\Users\\Ideaility\\Desktop\\linux\\named.conf";
	@Test
	public void test() {
		File file = new File("C:\\Users\\Ideaility\\Desktop\\named.con");  
        Reader reader = null;  
        try {  
            System.out.println("���ַ�Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���ֽڣ�");  
            // һ�ζ�һ���ַ�  
            reader = new InputStreamReader(new FileInputStream(file));  
            int tempchar;  
            while ((tempchar = reader.read()) != -1) {   
                if (((char) tempchar) != '\r') {  
                    System.out.print((char) tempchar);  
                }  
            }  
            reader.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
	}
	@Test
	public void duqv() throws Exception
	{
		Shell shell=new Shell();
		System.out.println(shell.zhixing("stop-all.sh"));
	}
	@Test
	public void tesy1() throws Exception
	{
		FileOutputStream out=new FileOutputStream(new File(namedpath),false);
		out.write(new namedString().toString().getBytes());
		out.close();
	}
	@Test
	public void tesy2() throws Exception
	{
		String s = new String("1.168.192");   
      String a[] = s.split("\\.");  
        System.out.println(a[2]+a[1]+a[0]);
	}
}
