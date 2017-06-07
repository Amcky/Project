package cn.htu.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

public class CharacterUtils {

	/**
	 * @param args
	 */
	
	
	public  Properties getConfig(String resource) {
		//String resource = "/DB.properties"; // 数据源配置
		Properties props = new Properties();
		InputStream is = this.getClass().getResourceAsStream(resource);

		try {

			props.load(is);

		} catch (IOException e) {

			System.out.println("读取配置信息出错");
			e.printStackTrace();
		}
		return props;
	}
	
	
	
	
	
	public static String getRandomString(int length) {

		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(62);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}

	public static String getRandomString2(int length) {

		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		long result = 0;
		for (int i = 0; i < length; i++) {

			int number = random.nextInt(3);

			switch (number) {

			case 0:
				result = Math.round(Math.random() * 25 + 65);
				sb.append(String.valueOf((char) result));
				break;

			case 1:
				result = Math.round(Math.random() * 25 + 97);
				sb.append((char) result);
				break;

			case 2:
				
				sb.append(new Random().nextInt(10));
				break;
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getRandomString(10));
		System.out.println(getRandomString2(102));

	}

}
