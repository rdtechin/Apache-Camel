package com.rdtech.in.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.rdtech.in.Processor.numbergenerator;
import com.rdtech.in.bean.responsebean;
import com.rdtech.in.splitter.JsonArraySplitter;

@Component
public class Kafkacamelconsumer  extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("kafka:KafkaTopic")
		//.to("log:received-message-from-kafka");
		.log("Message received from Kafka : ${body}")
		//.to("file:files/output");
		.split(method(JsonArraySplitter.class))
		// .process(new numbergenerator())
		.unmarshal().json(JsonLibrary.Jackson,responsebean.class)
       .log("${body}");

	}

	
}
