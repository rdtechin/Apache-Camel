package com.rdtech.in.bean;

public class responsebean {

	private String sourcekeyType;
	private String sourceKey;
	private String sourceSys;
	private int generatedKey;
	
	public responsebean() {
		
	}
	
	
	public responsebean(String sourcekeyType, String sourceKey, String sourceSys) {
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
		this.generatedKey = (int)(Math.random()*100000);
		return "responsebean [sourcekeyType=" + sourcekeyType + ", sourceKey=" + sourceKey + ", sourceSys=" + sourceSys
				+ ",generatedKey="+generatedKey+"]";
	}


	public int getGeneratedKey() {
		return generatedKey;
	}


	
	
	
	
}
