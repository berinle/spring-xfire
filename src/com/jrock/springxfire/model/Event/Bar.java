package com.jrock.springxfire.model.Event;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Bar {

	private String attr;
	
	public String toString(){
		return new ToStringBuilder(this).toString();
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}
}
