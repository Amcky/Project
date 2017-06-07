package cn.htu.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class Identify {

	public Properties getConfig(String resource) {
		Properties props = new Properties();
		InputStream is = this.getClass().getResourceAsStream(resource);

		try {

			props.load(is);

		} catch (IOException e) {

			System.out.println("��ȡ������Ϣ����");
			e.printStackTrace();
		}
		return props;
	}

	String getValueNum7(String number) {

		String num = number.trim();
		int i = num.indexOf("1");
		num = num.substring(i, i + 7);

		return num;
	}

	String getValueNum3(String number) {

		String num = number.trim();
		int i = num.indexOf("1");
		num = num.substring(i, i + 3);

		return num;
	}

	public int identifyNum(String num) {

		// �ƶ� 1����ͨ 2��������ͨ 3�� ����4

		String resource = "/telnumber.properties";
		Properties props = new Identify().getConfig(resource);
		String hnlt = props.getProperty("hnlt").toString();
		String zgyd = props.getProperty("zgyd").toString();
		String zglt = props.getProperty("zglt").toString();

		String valueNum3 = getValueNum3(num);
		String valueNum7 = getValueNum7(num);

		int i = zgyd.indexOf(valueNum3); // -1ʱΪ�Ҳ���
		if (i != -1) {
			return 1; // ���ء�1��˵�����й��ƶ�
		}
		
		
	
		
		int k = zglt.indexOf(valueNum3);
		int j = hnlt.indexOf(valueNum7);

		
		if (k == -1)
			return 4;// ����
		else if (j == -1) {
			return 2;
		}// ���ء�2��˵�����й���ͨ
		else {
			return 3;
		}// ���ء�3��˵���Ǻ�����ͨ

	}

	public static void main(String[] args) {
	long t1 = new Date().getTime();
		
		System.out.println(new Identify().identifyNum("8618639950000"));
		
		long t2 = new Date().getTime();
		
		System.out.println(t2-t1);
	}

}
