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
		Map map = invocation.getInvocationContext().getSession();// jsp登录页面将用户登录的信息存在一个session中

		if (map.get("usercode") == null) // 判断session中有没有用户登录的信息，没有就返回login
		{
			return Action.LOGIN;
		} 
		
		if (map.get("pre") != "1") {
			
			return "NoPre";
		} 
		return invocation.invoke(); // 若有登录信息就继续执行其他拦截器的代码
	}
}