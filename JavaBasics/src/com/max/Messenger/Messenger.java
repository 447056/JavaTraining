package com.max.Messenger;

public class Messenger {

	void sendMail(String message) {
		
		System.out.println("Message "+message);
		
	}
	
    void sendMail(String toUserName, String message) {
		
		System.out.println("UserName "+toUserName+" Message "+message);
		
	}
   void sendMail(String toUserName, String subject, String message) {
		
		System.out.println("UserName "+toUserName+" Subject "+subject+" Message "+message);
		
	}
}
