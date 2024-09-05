package com.max.quest5;


public class Mobilemain {
	public static void main(String[] args) {
		
	
	
	Mobile mobile1 = new Mobile("M-8","lenovo","black");
	Mobile mobile2 = new Mobile("M-5","MI","white");
	Mobile mobile3 = new Mobile("S-6","Samsung","red");
	Mobile mobile4 = new Mobile("M-5","Apple","black");
	Mobile mobile5 = new Mobile("M-6","Redmi","red");
	
	Mobile[] mobile = new Mobile[5];
	mobile[0] = mobile1;
	mobile[1] = mobile2;
	mobile[2] = mobile3;
	mobile[3] = mobile4;
	mobile[4] = mobile5;
	
	for (Mobile mobilea : mobile) {
		mobilea.getDetails();
	}
	
	for (Mobile mobileb : mobile) {
		if(mobileb.brand.equals("Samsung")) {
			mobileb.getDetails();
		}
	}

}}
