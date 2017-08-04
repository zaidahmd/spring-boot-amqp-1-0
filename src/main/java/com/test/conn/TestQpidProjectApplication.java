package com.test.conn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages={"com.test.conn"})
@ImportResource({"classpath:\\META-INF\\spring\\jms\\jms-context.xml"})
public class TestQpidProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestQpidProjectApplication.class, args);
	}
}
