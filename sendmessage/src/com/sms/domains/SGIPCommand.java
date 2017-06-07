package com.sms.domains;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

/**
 * 
 * @author handong
 * @description SGIP命令基类，所有sgip命令需要继承此类
 *
 */
public class SGIPCommand {

	public SGIPHeader header = new SGIPHeader(); // ��Ϣͷ
	public byte[] bodybytes = new byte[0]; // ��Ϣ������

	/**
	 * 将该命令全部转换成字节数组
	 * @return byte[] 命令字节
	 */
	public  byte[] getCommandBodybytes() {
		byte[] commandbytes = new byte[SGIPCommandDefine.LEN_SGIP_HEADER+ this.bodybytes.length];
		// 拷贝head字节
		System.arraycopy(header.getCommandHeadBytes(), 0, commandbytes, 0,SGIPCommandDefine.LEN_SGIP_HEADER);
		// 拷贝body字节
		System.arraycopy(bodybytes, 0, commandbytes,SGIPCommandDefine.LEN_SGIP_HEADER, header.getTotalmsglen()- SGIPCommandDefine.LEN_SGIP_HEADER);
		return commandbytes;
	}

	/**
	 * 向联通短信网关发送命令
	 * 
	 * @param out
	 *            与联通网关建立的数据流
	 * @throws IOException
	 */
	public void  write(OutputStream out) {
		// 获得命令体总字节(头+信息体)
		byte[] commandBytes = this.getCommandBodybytes();
		try {
			out.write(commandBytes);
			out.flush();
		} catch (SocketException e) {
			throw new RuntimeException(e);
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}

	public SGIPCommand read(InputStream in) {
		try {
			this.header.readHead(in);
			readDataIntoBody(in);
		} catch (SocketException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		switch (Bytes4ToInt(this.header.getCommandId())) {
		case 0x1: // 绑定命令
			return new Bind(this);
		case 0x80000001: // 绑定响应
			return new BindResp(this);
		case 0x2: // 注销绑定命令
			return new Unbind(this);
		case 0x80000002: // 注销绑定响应
			return new UnbindResp(this);
		case 0x80000003: // Submit响应
			return new SubmitResp(this);
		case 0x4: // MO命令
			return new Deliver(this);
		case 0x5:
			return new Report(this);
		case -2147479552:
			// return new TraceResp(this);
		case 0x11:
			 return new UserRpt(this);
		}
		return null;
	}

	/**
	 * 将包体字节读取bodybytes数组
	 * 
	 * @param in
	 * @throws IOException
	 */
	public void readDataIntoBody(InputStream in) throws IOException {
		this.bodybytes = new byte[this.header.getTotalmsglen()- SGIPCommandDefine.LEN_SGIP_HEADER];
		try {
			in.read(bodybytes);
		} catch (SocketException e) {
			throw new IOException(e);
		}
	}

	public static int ByteToInt(byte mybyte) {
		return mybyte;
	}

	public static byte IntToByte(int i) {
		return (byte) i;
	}

	public static int BytesToInt(byte[] mybytes) {
		return (((0xFF & mybytes[0]) << 8) + mybytes[1]);
	}

	public static byte[] IntToBytes(int i) {
		byte[] mybytes = new byte[2];
		mybytes[1] = (byte) (0xFF & i);
		mybytes[0] = (byte) ((0xFF00 & i) >> 8);
		return mybytes;
	}

	/**
	 * 将int转换为byte数组
	 * @param i 待转换的int变量
	 * @return byte[] 转换后的byte数组
	 */
	public static byte[] IntToBytes4(int i) {
		byte[] mybytes = new byte[4];
		mybytes[3] = (byte) (0xFF & i);
		mybytes[2] = (byte) ((0xFF00 & i) >> 8);
		mybytes[1] = (byte) ((0xFF0000 & i) >> 16);
		mybytes[0] = (byte) ((0xFF000000 & i) >> 24);
		return mybytes;
	}

	public static byte[] LongToBytes4(long i) {
		byte[] mybytes = new byte[4];
		mybytes[3] = (byte) (int) (0xFF & i);
		mybytes[2] = (byte) (int) ((0xFF00 & i) >> 8);
		mybytes[1] = (byte) (int) ((0xFF0000 & i) >> 16);
		mybytes[0] = (byte) (int) ((0xFF000000 & i) >> 24);
		return mybytes;
	}

	public static void LongToBytes4(long i, byte[] mybytes) {
		mybytes[3] = (byte) (int) (0xFF & i);
		mybytes[2] = (byte) (int) ((0xFF00 & i) >> 8);
		mybytes[1] = (byte) (int) ((0xFF0000 & i) >> 16);
		mybytes[0] = (byte) (int) ((0xFF000000 & i) >> 24);
	}

	public static void IntToBytes(int i, byte[] mybytes) {
		mybytes[1] = (byte) (0xFF & i);
		mybytes[0] = (byte) ((0xFF00 & i) >> 8);
	}

	/**
	 * 数byte数组转为十六进制
	 * 
	 * @param byteArray
	 * @return
	 */
	public static final String bytesToHexString(byte[] byteArray) {
		StringBuffer sBuffer = new StringBuffer(byteArray.length);
		String sTemp = "";
		for (int i = 0; i < byteArray.length; i++) {
			sTemp = Integer.toHexString(0xFF & byteArray[i]);
			if (sTemp.length() < 2)
				sBuffer.append(0);
			sBuffer.append(sTemp.toUpperCase());
		}
		return sBuffer.toString();
	}

	/**
	 * 将int类型转换为字节数组，数组长度为4
	 * 
	 * @param i
	 *            准备转换的数据
	 * @param mybytes
	 *            int转换后的byte[]
	 */
	public static void IntToBytes4(int i, byte[] mybytes) {
		mybytes[3] = (byte) (0xFF & i);
		mybytes[2] = (byte) ((0xFF00 & i) >> 8);
		mybytes[1] = (byte) ((0xFF0000 & i) >> 16);
		mybytes[0] = (byte) (int) ((0xFF000000 & i) >> 24);
	}

	/**
	 * 将字节数组转换为int类型
	 * 
	 * @param mybytes
	 * @return int 字节数组转换后int数据
	 */
	public static int Bytes4ToInt(byte[] mybytes) {
		return ((0xFF & mybytes[0]) << 24 | (0xFF & mybytes[1]) << 16
				| (0xFF & mybytes[2]) << 8 | 0xFF & mybytes[3]);
	}

	/**
	 * 将字节数组转换为long类型
	 * 
	 * @param mybytes
	 *            准备转换的数组
	 * @return long 字节数组转换后的long数据
	 */
	public static long Bytes4ToLong(byte[] mybytes) {
		return ((0xFF & mybytes[0]) << 24 | (0xFF & mybytes[1]) << 16
				| (0xFF & mybytes[2]) << 8 | 0xFF & mybytes[3]);
	}

	/**
	 * 数组拷贝
	 * @param source 源数组
	 * @param dest 目标数组　
	 * @param sourcebegin　源开始位置
	 * @param sourceend    源结束位置　
	 * @param destbegin　　目标数组开始位置
	 */
	public static void BytesCopy(byte[] source, byte[] dest, int sourcebegin,
			int sourceend, int destbegin) {
		int j = 0;
		for (int i = sourcebegin; i <= sourceend; ++i) {
			dest[(destbegin + j)] = source[i];
			++j;
		}
	}
}
