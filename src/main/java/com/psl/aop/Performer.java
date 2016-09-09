package com.psl.aop;

public class Performer {
	
	public void getup(){
		System.out.println("Performer gets up");
	}
	
	public void eatsBreakfast(){
		System.out.println("Performer eats Breakfast");
	}
	
	public void addressesAudience(){
		System.out.println("Performer addresses Audience");
	}
	
	public void perform() throws Exception {	
		System.out.println("Performer performs a song...");
		throw new Exception("Raining");
	}
	
	public void givesThanks(){
		System.out.println("Performer thanks Audience");
	}
	
	public void goesHome(){
		System.out.println("Performer goes Home");
	}

}
