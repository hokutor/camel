package org.apache.camel.component.huaweicloud.eg;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListSubscriptionsTest extends CamelTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(ListSubscriptionsTest.class.getName());

    TestConfiguration testConfiguration = new TestConfiguration();

    @BindToRegistry("egClient")
    EgMockClient mockClient = new EgMockClient(null);

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:list_subscriptions")
                        .to("hwcloud-eg:listSubscriptions?" +
                            "accessKey=" + testConfiguration.getProperty("accessKey") +
                            "&secretKey=" + testConfiguration.getProperty("secretKey") +
                            "&region=" + testConfiguration.getProperty("region") +
                            "&projectId=" + testConfiguration.getProperty("projectId") +
                            "&proxyHost=" + testConfiguration.getProperty("proxyHost") +
                            "&proxyPort=" + testConfiguration.getProperty("proxyPort") +
                            "&proxyUser=" + testConfiguration.getProperty("proxyUser") +
                            "&proxyPassword=" + testConfiguration.getProperty("proxyPassword") +
                            "&ignoreSslVerification=true")
                        .log("List subscriptions successful")
                        .to("mock:list_subscriptions_result");
            }
        };
    }

    @Test
    public void testListSubscriptions() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:list_subscriptions_result");
        mock.expectedMinimumMessageCount(1);
        template.sendBody("direct:list_subscriptions", "sample_body");
        Exchange responseExchange = mock.getExchanges().get(0);

        mock.assertIsSatisfied();

        assertEquals("{\"total\":0,\"size\":0,\"items\":[],\"httpStatusCode\":200}",
                responseExchange.getIn().getBody(String.class));
    }
}
