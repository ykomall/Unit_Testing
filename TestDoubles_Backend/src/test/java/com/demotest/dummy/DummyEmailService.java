package com.demotest.dummy;

public class DummyEmailService implements EmailService{

	@Override
	public void sendMail(String mail) {
		
		throw new AssertionError("Method not implemented");
		
	}

}
