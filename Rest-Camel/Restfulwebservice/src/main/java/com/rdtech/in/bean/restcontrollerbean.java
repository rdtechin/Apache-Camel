package com.rdtech.in.bean;

public class restcontrollerbean {

	private String sourcekeyType;
	private String sourceKey;
	private String sourceSys;
	
	public restcontrollerbean() {
		
	}
	
	public restcontrollerbean(String sourcekeyType, String sourceKey, String sourceSys) {
		super();
		this.sourcekeyType = sourcekeyType;
		this.sourceKey = sourceKey;
		this.sourceSys = sourceSys;
	}
	public String getSourcekeyType() {
		return sourcekeyType;
	}
	
	public void setSourcekeyType(String sourcekeyType) {
		this.sourcekeyType = sourcekeyType;
	}
	public String getSourceKey() {
		return sourceKey;
	}
	public void setSourceKey(String sourceKey) {
		this.sourceKey = sourceKey;
	}
	public String getSourceSys() {
		return sourceSys;
	}
	public void setSourceSys(String sourceSys) {
		this.sourceSys = sourceSys;
	}
	
	
	@Override
	public String toString() {
		return "restcontrollerbean [sourcekeyType=" + sourcekeyType + ", sourceKey=" + sourceKey + ", sourceSys="
				+ sourceSys + "]";
	}
	
}
