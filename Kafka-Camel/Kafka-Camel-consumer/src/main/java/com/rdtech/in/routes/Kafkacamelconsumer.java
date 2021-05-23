package com.rdtech.in.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Kafkacamelconsumer  extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("kafka:KafkaTopic")
		//.to("log:received-message-from-kafka");
		.log("Message received from Kafka : ${body}")
		.to("file:files/output");
		

	}

	
}
