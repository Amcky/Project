package lty.clubServices.luntan.Interceptor;

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
		int id =  (int) session.get("uid");
		String uid=String.valueOf(id);
		if (uid == null || "".equals(uid))
		{
			return Action.LOGIN;
		} else
		{
			return invocation.invoke();
		}
	}

}
