package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut(value="execution(* com.psl.aop.Performer.perform(..))")
	public void dummy(){}
	
	@Before(value="dummy()")
	public void audienceTakeSeats(){
		System.out.println("audience take Seats");
	}
	
	@Before(value="dummy()")
	public void switchOffPhones(){
		System.out.println("audience switch off Phones");
	}
	
	@AfterThrowing(value="dummy()")
	public void demandRefund(){
		System.out.println("Boo !! .. audience demands Refund");
	}
	
	public void applaud(){
		System.out.println("audience applaud .... CLAP CLAP");
	}
	
	public void goHome(){
		System.out.println("audience go Home");
	}
	
	public void watchPerformance(ProceedingJoinPoint jp){
		System.out.println("audience take Seats");
		System.out.println("audience switch off Phones");
		System.out.println();
		
		//start stop watch
		try {
			jp.proceed();        //gives control to point cut method
		} catch (Throwable e) {
			System.out.println(e.getLocalizedMessage() +" Boo !! .. audience demands Refund");
		}  
		//stop the stopwatch
		System.out.println("audience applaud .... CLAP CLAP");
		System.out.println("audience go Home");
	}

}
