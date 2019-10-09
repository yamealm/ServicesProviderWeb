package com.alodiga.services.provider.commons.ejbs;

import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import java.util.Date;
import javax.ejb.Local;
import javax.ejb.Timer;

@SuppressWarnings(value = {"all"})
@Local
public interface AutomaticProcessControlTimerEJBLocal extends SPGenericEJB {

    public void execute(Timer timer);

    public void forceExecution() throws Exception;

    public void forceTimeout() throws Exception;

    public Date getNextExecutionDate();

    public void restart() throws Exception;

    public void start() throws Exception;

    public void stop() throws Exception;

    public Long getTimeoutInterval();
}
