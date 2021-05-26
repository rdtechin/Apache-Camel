package com.rdtech.in.Processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.rdtech.in.bean.responsebean1;

public class numbergenerator  implements Processor {
	
	responsebean1 ob= new responsebean1();
	 
	int gen=1;
	
	 @Override
		public void process(Exchange exchange) throws Exception {
			
	        gen= (int)(Math.random()*10);
	        
	        System.out.println("gen="+gen);
	
		}

}
