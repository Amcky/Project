package com.sms.domains;
/**
 * 
 * @author handong
 * @description  所有SGIP命令格式及长度的定义
 */
public class SGIPCommandDefine {

	public final static byte[] SGIP_BIND = { 0, 0, 0, 1 }; // 0x1
	public final static byte[] SGIP_BIND_RESP = { -128, 0, 0, 1 }; // 0x80000001
	public final static byte[] SGIP_UNBIND = { 0, 0, 0, 2 }; // 0x2
	public final static byte[] SGIP_UNBIND_RESP = { -128, 0, 0, 2 }; // 0x80000002
	public final static byte[] SGIP_SUBMIT = { 0, 0, 0, 3 }; // 0x3
	public final static byte[] SGIP_SUBMIT_RESP = { -128, 0, 0, 3 }; // 0x80000003
	public final static byte[] SGIP_DELIVER = { 0, 0, 0, 4 }; // 0x4
	public final static byte[] SGIP_DELIVER_RESP = { -128, 0, 0, 4 }; // 0x80000004
	public final static byte[] SGIP_REPORT = { 0, 0, 0, 5 }; // 0x5
	public final static byte[] SGIP_REPORT_RESP = { -128, 0, 0, 5 }; // 0x80000005
	public final static byte[] SGIP_ADDSP = { 0, 0, 0, 6 }; // 0x6
	public final static byte[] SGIP_ADDSP_RESP = { -128, 0, 0, 6 }; // 0x80000006
	public final static byte[] SGIP_MODIFYSP = { 0, 0, 0, 7 }; // 0x7
	public final static byte[] SGIP_MODIFYSP_RESP = { -128, 0, 0, 7 }; // 0x80000007
	public final static byte[] SGIP_DELETESP = { 0, 0, 0, 8 }; // 0x8
	public final static byte[] SGIP_DELETESP_RESP = { -128, 0, 0, 8 }; // 0x80000008
	public final static byte[] SGIP_QUERYROUTE = { 0, 0, 0, 9 }; // 0x9
	public final static byte[] SGIP_QUERYROUTE_RESP = { -128, 0, 0, 9 }; // 0x80000009
	public final static byte[] SGIP_ADDTELESEG = { 0, 0, 0, 10 }; // 0xa
	public final static byte[] SGIP_ADDTELESEG_RESP = { -128, 0, 0, 10 }; // 0x8000000a
	public final static byte[] SGIP_MODIFYTELESEG = { 0, 0, 0, 11 }; // 0xb
	public final static byte[] SGIP_MODIFYTELESEG_RESP = { -128, 0, 0, 11 }; // 0x8000000b
	public final static byte[] SGIP_DELETETELESEG = { 0, 0, 0, 12 }; // 0xc
	public final static byte[] SGIP_DELETETELESEG_RESP = { -128, 0, 0, 12 }; // 0x8000000c
	public final static byte[] SGIP_ADDSMG = { 0, 0, 0, 13 }; // 0xd
	public final static byte[] SGIP_ADDSMG_RESP = { -128, 0, 0, 13 }; // 0x8000000d
	public final static byte[] SGIP_MODIFYSMG = { 0, 0, 0, 14 }; // 0xe
	public final static byte[] SGIP_MODIFYSMG_RESP = { -128, 0, 0, 14 }; // 0x0000000e
	public final static byte[] SGIP_DELETESMG = { 0, 0, 0, 15 }; // 0xf
	public final static byte[] SGIP_DELETESMG_RESP = { -128, 0, 0, 15 }; // 0x8000000f
	public final static byte[] SGIP_CHECKUSER = { 0, 0, 0, 16 }; // 0x10
	public final static byte[] SGIP_CHECKUSER_RESP = { -128, 0, 0, 16 }; // 0x80000010
	public final static byte[] SGIP_USERRPT = { 0, 0, 0, 17 }; // 0x11
	public final static byte[] SGIP_USERRPT_RESP = { -128, 0, 0, 17 }; // 0x80000011
	public final static byte[] SGIP_TRACE = { 0, 0, 16, 0 }; // 0x1000
	public final static byte[] SGIP_TRACE_RESP = { -128, 0, 16, 0 }; // 0x80001000

	public static final int LEN_SGIP_HEADER = 20;
	public static final int LEN_SGIP_BIND = 41;
	public static final int LEN_SGIP_BIND_RESP = 9;
	public static final int LEN_SGIP_UNBIND = 0;
	public static final int LEN_SGIP_UNBIND_RESP = 0;
	public static final int LEN_SGIP_SUBMIT = 123;
	public static final int LEN_SGIP_SUBMIT_RESP = 9;
	public static final int LEN_SGIP_DELIVER = 57;
	public static final int LEN_SGIP_DELIVER_RESP = 9;
	public static final int LEN_SGIP_REPORT = 44;
	public static final int LEN_SGIP_REPORT_RESP = 9;
	public static final int LEN_SGIP_USERRPT = 51;
	public static final int LEN_SGIP_USERRPT_RESP = 9;
	public static final int LEN_SGIP_TRACE = 41;
	public static final int LEN_SGIP_TRACE_RESP = 48;
	
	/**
	 * 获得对应的命令的名称
	 * @param commandId
	 * @return String 命令的名称
	 */
	public final static String getCommandName(byte[] commandId) {
		switch (SGIPCommand.Bytes4ToInt(commandId)) {
		case 0x1: // 绑定命令
			return "Bind";
		case 0x80000001: // 绑定响应
			return "Bind_Resp";
		case 0x2: // 注销绑定命令
			return "Unbind";
		case 0x80000002: // 注销绑定响应
			return "Unbind_Resp";
		case 0x3:
			return "Submit";
		case 0x80000003: // Submit响应
			return "Submit_Resp";
		case 0x4: // MO命令
			return "Deliver";
		case 0x80000004:
			return "Deliver_Resp";
		case 0x5:
			return "Report";
		case 0x80000005:
			return "Report_Resp";
		case 0x11:
			 return "UserRpt";
		case 0x80000011:
			return "UserRpt_Resp";
		}
		return null;
	}
}
