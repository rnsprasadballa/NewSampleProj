package com.prasad.jms.example.receiver;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class JmsReceiver implements MessageListener{

	public void onMessage(final Message message) {
		TextMessage textMesg = (TextMessage)message;
		try {
			System.out.println("Message received: " + textMesg.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
