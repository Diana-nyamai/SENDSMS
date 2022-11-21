package com.safaricom.consumer;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SendSmsConsumer extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("jms:sendsms")
                .log("The message sent was => ${body}");
    }
}
