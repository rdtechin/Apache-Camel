package com.rdtech.in.splitter;
import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Message;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.Collection;


public class JsonArraySplitter {

    @Handler
    public Collection<String> processMessage(Exchange exchange) {

        Collection<String> messageList = new ArrayList<>();

        Message message = exchange.getIn();
        String msg = message.getBody(String.class);

        JSONArray jsonArray = (JSONArray) JSONValue.parse(msg);

        for (Object o : jsonArray) {
            messageList.add(o.toString());
        }

        return messageList;

    }

}