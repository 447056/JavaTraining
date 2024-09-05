package com.max.Inherit3;

public class SMSCommunication extends Communication  {

	@Override
	void sendMessage() {
			System.out.println("short messages of up to 160 characters ");
		}
}
