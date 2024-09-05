package com.max.Messenger;

public class MessengerMain {
	public static void main(String[] args) {
		
		Messenger messenger = new Messenger();
		messenger.sendMail("Hello");
		messenger.sendMail("Subash@gmail.com", "Hello");
		messenger.sendMail("Subash@gmail.com","Enquiry", "Hello");
	}

}
