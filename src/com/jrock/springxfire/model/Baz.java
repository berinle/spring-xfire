package com.jrock.springxfire.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Baz {

	private String name;
	
	public String toString(){
		return new ToStringBuilder(this).append("name", name).toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
