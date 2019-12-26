package com.sample.camel.kafka.routes;

import com.sample.camel.kafka.process.PrintMessageBody;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KafkaCat extends RouteBuilder {
    @Autowired
    PrintMessageBody printMessageBody;
    @Override
    public void configure() throws Exception {
        from("{{camel.route.kafka.topic}}")
            .process(printMessageBody);
    }
}
