package com.alodiga.services.provider.commons.genericEJB;

import javax.ejb.Local;

@Local
public interface SPGenericEJBLocal
{
	void init();
    public boolean echo() throws Exception;
}
