package com.alodiga.services.provider.commons.models;

public enum BannerPosition {

	LEFT_TOP(1L,"LEFT_TOP"),
	LEFT_BOTTOM(2L,"LEFT_BOTTOM"),
	RIGHT_BOTTOM(3L,"RIGHT_BOTTOM"),
	CENTRAL(4L,"CENTRAL"),
	LEFT(5L,"LEFT"),
	RIGHT_TOP(6L,"RIGHT_TOP"),
	RIGHT_MIDDLE(7L,"RIGHT_MIDDLE"),
	CENTRAL_FOOTER(8L,"CENTRAL_FOOTER");
	
	private Long value;
	private String defaultValue;
	
	BannerPosition(Long value, String defaultValue)
	{
		this.value = value;
		this.defaultValue = defaultValue;
	}
	
	public Long getValue() {
		return value;
	}

	public void setValue(String defaultValue) {
		this.defaultValue = defaultValue;
	} 
	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDeafultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	} 
	
	
}
