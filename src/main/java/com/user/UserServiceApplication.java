package com.user;

import org.out.OutPackageBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "org.out")
public class UserServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(UserServiceApplication.class, args);
		//System.out.println(ctx.getClass().getName());
//		SpringBean sb = ctx.getBean(SpringBean.class);
//		sb.print();
		
		OutPackageBean sb = ctx.getBean(OutPackageBean.class);
		sb.print();
	}

}
