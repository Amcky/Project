package lty.clubServices.Interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UserInterceptor extends AbstractInterceptor
{

	public String intercept(ActionInvocation invocation) throws Exception
	{
		ActionContext context = invocation.getInvocationContext();
		Map session = context.getContext().getSession();
		String username = (String) session.get("username");
		if (username == null || "".equals(username))
		{
			return Action.LOGIN;
		} else
		{
			return invocation.invoke();
		}
	}

}
