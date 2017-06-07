package cn.htu.webservice;

import cn.htu.chinamobile.ChinaMobileSend;
import cn.htu.chinaunicom.ChinaUnicomSend;
import cn.htu.util.Identify;

public class SendMessageImpl implements SendMessage {

	public static String sendSuccess = "鍙戦�佹垚鍔�";
	public static String sendFail = "鍙戦�佸け璐�";

	// 璇ュ嚱鏁颁娇鐢ㄦ潵瀵瑰浣跨敤鍙戦�佺煭淇＄殑鎺ュ彛锛屼緵绗笁鏂硅皟鐢�
	public String mobilesend(String JSHM, String DXNR) {

		int i = new Identify().identifyNum(JSHM);

		switch (i) {
		case 3:
			try {
			//ChinaUnicomSend.sendUnicom(new String[] { JSHM }, DXNR);// 3
			ChinaUnicomSend.sendUnicom(new String[] { JSHM }, "hello world");// 3
			//new ChinaUnicomSend().close();
				// 璇存槑鏄渤鍗楄仈閫�.
				System.out.println("娌冲崡鑱旈��");
			} catch (Exception e) {

				e.printStackTrace();
				return sendFail;
			}
			break;
		case 1:

			try {
				ChinaMobileSend.sendMobile(new String[] { JSHM }, DXNR);
			} catch (Exception e) {
				e.printStackTrace();
				return sendFail;
			}
			break;
		case 2:

			try {
				ChinaMobileSend.sendMobile(new String[] { JSHM }, DXNR);
			} catch (Exception e) {
				e.printStackTrace();
				return sendFail;
			}
			break;
		case 4:

			try {
				ChinaMobileSend.sendMobile(new String[] { JSHM }, DXNR);
			} catch (Exception e) {
				e.printStackTrace();
				return sendFail;
			}
		}
		return sendSuccess;
	}

}
