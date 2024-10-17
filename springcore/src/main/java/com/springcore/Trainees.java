package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component("t2")
public class Trainees {
	
	@Autowired
	private TrainerInterface ti;
	
	
	//adapter
/*	public void setTi(TrainerInterface ti) {
		this.ti = ti;
	}
*/
	public void useTrainer() {
		ti.teach();
	}

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("abc.xml");
		
		Trainees tt=(Trainees)ctx.getBean("t2");
		
		//TrainerInterface t1=new Trainer();
		//tt.setTi(t1);                       // dependency injection
		
		tt.useTrainer();

	}

}
