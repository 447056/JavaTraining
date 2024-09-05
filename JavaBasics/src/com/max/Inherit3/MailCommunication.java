package com.max.Inherit3;

public class MailCommunication extends Communication {

	@Override
void sendMessage() {
		System.out.println("communication using mail service");
	}
}
