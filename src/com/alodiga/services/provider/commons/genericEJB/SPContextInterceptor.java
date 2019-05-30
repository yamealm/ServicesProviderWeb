package com.alodiga.services.provider.commons.genericEJB;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import org.apache.log4j.Logger;

import com.alodiga.services.provider.commons.utils.EjbConstants;
import com.alodiga.services.provider.commons.utils.MessageFormatHelper;

public class SPContextInterceptor
{
	private MessageFormatHelper sysMessage = new MessageFormatHelper(EjbConstants.MESSAGE_FILE_NAME);
	
	@AroundInvoke
	public Object configData(InvocationContext ctx) throws Exception
	{
		return ctx.proceed();
	}
	
	
	
	
	

}
