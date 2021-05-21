package com.rdtech.in.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.rdtech.in.processor.jsonobjectlistprocessor;
import com.rdtech.in.splitter.JsonArraySplitter;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;

import org.apache.camel.support.DefaultExchange;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class Thirdroute extends RouteBuilder {
	
	@Autowired
	CamelContext camelContext;

	@Override
    public void configure() throws Exception {
    	
    	Exchange exchange = new DefaultExchange(camelContext);
    	
    	camelContext.setMessageHistory(true);
    	
        from("file:files/input")
        .split(method(JsonArraySplitter.class))
        .setProperty("number").jsonpath("$.value.claim.number").log("number : ${exchangeProperty.number} ")
        .process(new jsonobjectlistprocessor());
      //  .log("${body}");
       
      
       
       
    }
}
