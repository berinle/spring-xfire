package com.jrock.springxfire.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Event {

	private String type;
	private Foo foo;
	private Baz baz;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Foo getFoo() {
		return foo;
	}
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	public Baz getBaz() {
		return baz;
	}
	public void setBaz(Baz baz) {
		this.baz = baz;
	}
	
	public String toString(){
		return new ToStringBuilder(this)
		.append("type", type)
		.append("foo", foo)
		.append("baz", baz)
		.toString();
	}
	
}
