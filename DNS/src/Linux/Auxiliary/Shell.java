package Linux.Auxiliary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Shell {
	public String shell(String path)
	{
		String result=null;
		 try {  
	            Process ps = Runtime.getRuntime().exec(path);  
	            ps.waitFor();  
	  
	            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));  
	            StringBuffer sb = new StringBuffer();  
	            String line;  
	            while ((line = br.readLine()) != null) {  
	                sb.append(line).append("\n");  
	            }  
	            result = sb.toString();  
	            System.out.println(result);  
	            }   
	        catch (Exception e) {  
	            e.printStackTrace();  
	            }
		return result;  
	    }  

	public String zhixing(String cmd) throws Exception
	{
		Process process = Runtime.getRuntime().exec(cmd);		 
        InputStreamReader ir = new InputStreamReader(process.getInputStream());
        LineNumberReader input = new LineNumberReader(ir);
        String line;
        StringBuffer sb=new StringBuffer();
        while ((line = input.readLine()) != null) {
            sb.append(line); 
            sb.append("\n");
        	}
		return sb.toString();
	}
}
