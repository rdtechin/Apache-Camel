package com.rdtech.in.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class camelproducer extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		from("file:files/json")
		.log("${body}")
		.to("kafka:KafkaTopic");
		
	}

}
