package com.jrock.springxfire.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Bar {

	private String attr;
	
	public String toString(){
		return new ToStringBuilder(this).append("attr", attr).toString();
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}
}
