package com.test.conn.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class QpidProducer implements CommandLineRunner{

	@Autowired 
	JmsTemplate configTemplate;

	@Override
	public void run(String... arg0) throws Exception {
		configTemplate.convertAndSend("Hello in to the queue from dev");
	}	
}
