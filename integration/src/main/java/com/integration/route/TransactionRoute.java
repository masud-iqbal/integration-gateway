package com.integration.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TransactionRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:test")
                .routeId("transaction-test-route")
                .log("Transaction received: ${body}")
                .to("log:transaction");
    }
}
