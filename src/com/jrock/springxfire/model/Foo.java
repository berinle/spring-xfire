package com.jrock.springxfire.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Foo {

	private Date date;
	private int count;
	private double amt;
	private List<Bar> bars = new ArrayList<Bar>();
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public List<Bar> getBars() {
		return bars;
	}
	public void setBars(List<Bar> bars) {
		this.bars = bars;
	}
	
	public String toString(){
		return new ToStringBuilder(this).toString();
	}
	
}
