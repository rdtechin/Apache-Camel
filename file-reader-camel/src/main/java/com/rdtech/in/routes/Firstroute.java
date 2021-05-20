package com.rdtech.in.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class Firstroute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("file:files/input")
		.log("${body}")
		.to("file:files/output");
	}
}
