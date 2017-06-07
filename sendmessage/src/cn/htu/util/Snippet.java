package cn.htu.util;

import java.util.regex.Pattern;

public class Snippet {
	static String reg = "(?:')|(?:--)|(/\\*(?:.|[\\n\\r])*?\\*/)|"
			+ "(\\b(select|update|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute)\\b)";

	static Pattern sqlPattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);

	public static boolean isValid(String str) {

		if (sqlPattern.matcher(str).find()) {

			System.out.println("未能通过过滤器");

			return false;
		}
		return true;
	}

	private static String rp(String str) {
		
		return str.replaceAll(reg, "");
	}

	public static void main(String[] args) {
		System.out.println(rp("select * from "));
	}
}
