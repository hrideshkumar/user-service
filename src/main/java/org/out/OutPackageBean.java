package org.out;

import org.springframework.stereotype.Component;

@Component
public class OutPackageBean {
	
	public void print() {
		System.out.println("SpringBean - print()");
	}
}
