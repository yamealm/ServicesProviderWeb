package com.alodiga.services.provider.commons.genericEJB;

import javax.ejb.Remote;

//INTERFAZ DE METODOS NO NECESARIAMENTE REMOTOS
@Remote
public interface SPGenericEJB {

    void init();

    public boolean echo() throws Exception;
}
