package cn.htu.interceptor;

import java.util.Map;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthInterceptor extends AbstractInterceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3809733495614496723L;

	@Override
	@SuppressWarnings("unchecked")
	public String intercept(ActionInvocation invocation) throws Exception {
		Map map = invocation.getInvocationContext().getSession();// jsp��¼ҳ�潫�û���¼����Ϣ����һ��session��

		if (map.get("usercode") == null) // �ж�session����û���û���¼����Ϣ��û�оͷ���login
		{
			return Action.LOGIN;
		} 
		
		if (map.get("pre") != "1") {
			
			return "NoPre";
		} 
		return invocation.invoke(); // ���е�¼��Ϣ�ͼ���ִ�������������Ĵ���
	}
}