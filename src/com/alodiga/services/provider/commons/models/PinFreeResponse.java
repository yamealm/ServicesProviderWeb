package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.util.Date;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "pinFree")
public class PinFreeResponse implements Serializable {

    private static final long serialVersionUID = 217332512976477547L;
    @Element(name = "codeId", required = false)
    private String codeId;
    @Element(name = "serial", required = false)
    private String serial;
    @Element(name = "ani", required = false)
    private String ani;
    @Element(name = "pinFreeId", required = false)
    private String pinFreeId;
    
    
    public PinFreeResponse() {
        super();
    }

    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getAni() {
        return ani;
    }

    public void setAni(String ani) {
        this.ani = ani;
    }

	public String getPinFreeId() {
		return pinFreeId;
	}

	public void setPinFreeId(String pinFreeId) {
		this.pinFreeId = pinFreeId;
	}
    
    
}
