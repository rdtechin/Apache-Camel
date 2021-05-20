package com.rdtech.in.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.rdtech.in.exception.CamelCustomException;
import com.rdtech.in.processor.MyProcessor;


@Component
public class Firstroute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		//onexception block
	    onException(CamelCustomException.class).process(new Processor() {
	    	
	    	

            public void process(Exchange exchange) throws Exception {
                System.out.println("handling exception");
            }
        }).log("Received body ${body}").to("file:files/output").handled(true);
	    
	    
		// TODO Auto-generated method stub
		from("file:files/input")
		.process(new MyProcessor())
		.log("${body}")
		.to("file:files/output");
		
		
		
		
		
		
//		//do try block 
//		from("file:files/input").doTry().process(new MyProcessor()).to("file:files/output")
//        .doCatch(CamelCustomException.class).process(new Processor() {
//
//            public void process(Exchange exchange) throws Exception {
//                System.out.println("handling exception");
//            }
//        }).log("Received body ${body}").to("file:files/output");
//		
	}
}
