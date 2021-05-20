package com.rdtech.in.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.rdtech.in.exception.CamelCustomException;

public class MyProcessor implements Processor {

    public static int count = 1;

    public void process(Exchange exchange) throws Exception {
        System.out.println("Exception Thrown");
        throw new CamelCustomException();
    }

}