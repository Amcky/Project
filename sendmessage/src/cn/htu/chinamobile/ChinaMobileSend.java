package cn.htu.chinamobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.axis.AxisFault;

import cn.htu.util.CharacterUtils;

public class ChinaMobileSend {


	@SuppressWarnings("unchecked")
	public static void sendMobile(String JSHM[], String DXNR) {

		String resource = "/chinamobile.properties";
		Properties props = new CharacterUtils().getConfig(resource);

		SMSServiceSoapStub ss = null;

		String end = props.getProperty("endPoint").toString();
		URL url = null;
		try {
			url = new URL(end);
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}

		try {
			ss = new SMSServiceSoapStub(url, null);
		} catch (AxisFault e) {
			e.printStackTrace();
		}

		try {
			String LoginName = props.getProperty("loginName").toString();
			String LoginPwd = props.getProperty("loginPwd").toString();
			int Return = 0;
			if (JSHM != null && JSHM.length > 0) {
				for (int i = 0; i < JSHM.length; i++) {
					String r = ss.smsSend(JSHM[i], DXNR, Return, LoginName,
							LoginPwd);
					System.out.println(r);
				}
			}

		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		sendMobile(new String[]{"15090379615"},"我的爱就像沙中灰葬泪滑落的伤悲怎么也擦不断心碎相思一寸香味");

	}
}