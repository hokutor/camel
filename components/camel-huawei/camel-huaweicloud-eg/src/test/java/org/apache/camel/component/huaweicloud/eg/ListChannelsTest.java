package org.apache.camel.component.huaweicloud.eg;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListChannelsTest extends CamelTestSupport {
    TestConfiguration testConfiguration = new TestConfiguration();

    @BindToRegistry("egClient")
    EgMockClient mockClient = new EgMockClient(null);

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:list_channels")
                    .to("hwcloud-eg:listChannels?" +
                        "accessKey=" + testConfiguration.getProperty("accessKey") +
                        "&secretKey=" + testConfiguration.getProperty("secretKey") +
                        "&region=" + testConfiguration.getProperty("region") +
                        "&projectId=" + testConfiguration.getProperty("projectId") +
                        "&proxyHost=" + testConfiguration.getProperty("proxyHost") +
                        "&proxyPort=" + testConfiguration.getProperty("proxyPort") +
                        "&proxyUser=" + testConfiguration.getProperty("proxyUser") +
                        "&proxyPassword=" + testConfiguration.getProperty("proxyPassword") +
                        "&ignoreSslVerification=true")
                    .log("List channels successful")
                    .to("mock:list_channels_result");
            }
        };
    }

    @Test
    public void testListChannels() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:list_channels_result");
        mock.expectedMinimumMessageCount(1);
        template.sendBody("direct:list_channels", "sample_body");
        Exchange responseExchange = mock.getExchanges().get(0);

        mock.assertIsSatisfied();

        assertEquals("{\"total\":1,\"size\":1,\"items\":[{\"id\":\"32713eca-5d05-4308-9494-6614d6914afc\",\"name\":\"default\",\"description\":\"default event channel\",\"providerType\":{\"value\":\"OFFICIAL\"},\"createdTime\":\"2022-09-19T01:54:35Z\",\"updatedTime\":\"2022-09-19T01:54:35Z\"}],\"httpStatusCode\":200}",
            responseExchange.getIn().getBody(String.class));
    }
}
