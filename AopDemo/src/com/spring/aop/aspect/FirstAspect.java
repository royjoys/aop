package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class FirstAspect {
	
	//@Before("execution(public String com.spring.aop.model.Circle.getName())")
	//@Before("execution(public String get*())")
	/*@Before("allGetters()")
	public void firstAdvice(){
		System.out.println("First Advice executed");
	}*/
	
	
	/*@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Second Advice executed");
	}
	*/
	
	/*@Before("allCircleMethods()")
	public void thirdAdvice(){
		System.out.println("Third Advice executed");
	}*/
	
	/*@Before("acceptsString()")
	public void fourthAdvice(){
		System.out.println("Fourth Advice executed");
	}*/
	
	/*@Before("args(name)")
	public void fifthAdvice(String name){
		System.out.println("Fifth Advice executed--"+name);
	}*/
	
	/*@Before("allCircleMethods()")
	public void sixthAdvice(JoinPoint jp){
		System.out.println("Sixth Advice executed--"+jp.getTarget());
	}*/
	
	/*@After("args(name)")
	public void FirstAfterAdvice(String name){
		System.out.println("First After Advice executed--"+name);
	}*/
	
	/*@AfterReturning(pointcut="allCircleMethods()", returning ="returnString")
	public void FirstAfterAdvice(String returnString){
		System.out.println("First After Advice executed--"+returnString);
	}
	
	@AfterThrowing(pointcut="allCircleMethods()", throwing ="ex")
	public void AfterThrowingAdvice(Exception ex){
		System.out.println("First After Advice executed--"+ex);
	}*/
	
	@Around("allCircleMethods()")
	public void sixthAdvice(ProceedingJoinPoint pjp){
		System.out.println("Before executed--");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After executed--");
	}
	
	///**********************PointCuts ***************///
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	//It will be applicable for no arg
	@Pointcut("execution(public String com.spring.aop.model.Circle.get*())")
	public void allGettersWithNoArguemetn(){}
	
	//It will be applicable for one arg
	@Pointcut("execution(public String com.spring.aop.model.Circle.get*(*))")
	public void allGettersWithSingleArguemetn(){}
	
	//It will be applicable for no or more arg
	@Pointcut("execution(public String com.spring.aop.model.Circle.get*(..))")
	public void allGettersWithZeroOrMoreArguemetn(){}
	
	
	@Pointcut("within(com.spring.aop.model.Circle)")
	public  void allCircleMethods(){}
	
	@Pointcut("args(String)")
	public void acceptsString(){}
	
	
	

}
