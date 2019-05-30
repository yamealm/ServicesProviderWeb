package com.alodiga.services.provider.commons.models;

public enum EventTypeEnum {

    CREATE(1l),
    READ(2l),
    UPDATE(3l),
    DELETE(4l),
    WEB_SERVICE_CALL(5l);
    private Long value;

    private EventTypeEnum(Long value) {
	this.value = value;
    }

    public Long getValue() {
	return value;
    }
}
