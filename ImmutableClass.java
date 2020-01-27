package com.hSingh;

import java.util.Date;

//1.make class final so that it cannot be extended
public final class ImmutableClass {
	
	//2. make private final instance variables
	private final Integer Immutablefield1;
	private final String Immutablefield2;
	private final Date mutablefield1;
	
	public ImmutableClass(Integer immutablefield1, String immutablefield2, Date date) {
		super();
		this.Immutablefield1 = immutablefield1;
		this.Immutablefield2 = immutablefield2;
		this.mutablefield1 = new Date(date.getTime());//Always create new instance for mutable java class
	}
	
	//3. make only getter fields
	public Integer getImmutablefield1() {
		return Immutablefield1;
	}
	public String getImmutablefield2() {
		return Immutablefield2;
	}

	public Date getMutablefield1() {
		return new Date(mutablefield1.getTime());//to prevent client change the state
	}
	
	
	

}
