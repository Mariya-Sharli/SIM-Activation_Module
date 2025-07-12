package test;

import java.awt.Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import electronics.Mobile;
import electronics.Airtel;
import electronics.Jio;

public class test {
	public static void main(String[] args)
	{
//		ApplicationContext a=new AnnotationConfigApplicationContext(MyClass.class);
//		System.out.println(a.getBean("mobile"));
		
		Mobile m=new Mobile();//a.getBean("mobile"
		m.setSim(new Jio());
		//Whatever u put at end will be called
		m.setSim(new Airtel());
	
		m.call();
		
	}

}