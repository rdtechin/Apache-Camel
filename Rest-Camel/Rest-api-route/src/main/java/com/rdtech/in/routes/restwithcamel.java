package com.rdtech.in.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.rdtech.in.bean.responsebean1;
import com.rdtech.in.splitter.JsonArraySplitter;

@Component
public class restwithcamel extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		restConfiguration().host("localhost").port(8008);
		

		from("timer:rest-api-consumer?repeatCount=1&delay=100")
		.log("${body}")
		.to("rest:get:/service")
		.convertBodyTo(String.class)
		.log("this is my message : ${body}")
		.split(method(JsonArraySplitter.class))
		// .process(new numbergenerator())
		.unmarshal().json(JsonLibrary.Jackson,responsebean1.class)
       .log("${body}");
	}

}
