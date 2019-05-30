package com.alodiga.services.provider.commons.genericEJB;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import org.apache.log4j.Logger;

import com.alodiga.services.provider.commons.utils.EjbConstants;
import com.alodiga.services.provider.commons.utils.MessageFormatHelper;

public class SPLoggerInterceptor {

    private MessageFormatHelper sysMessage = new MessageFormatHelper(EjbConstants.MESSAGE_FILE_NAME);

    @AroundInvoke
    public Object log(InvocationContext ctx) throws Exception {
        /*Object[] oParams = ctx.getParameters();
        System.out.println("**********Thread id: " + Thread.currentThread().getId());
        System.out.println("**********Thread name: " + Thread.currentThread().getName());
        try {
            Logger logger = Logger.getLogger(ctx.getTarget().getClass());
            String clazz = ctx.getMethod().getDeclaringClass().getName();
            String methodName = ctx.getMethod().getName();
            String params = "";
            params += java.util.Arrays.toString(oParams);
            logger.info(sysMessage.format(EjbConstants.MSG_INIT_INVOCATION_METHOD, methodName, clazz, params));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return ctx.proceed();
    }
}
