package com.rdtech.in.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.ValueBuilder;

public class jsonobjectlistprocessor implements Processor{
	String props="";


	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		props   = props + (String) exchange.getProperty("number") + ",";
		
          System.out.println("numbers string : "+props);
          
          
	}

}
