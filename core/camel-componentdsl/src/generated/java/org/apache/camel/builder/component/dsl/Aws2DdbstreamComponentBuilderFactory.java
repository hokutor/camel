/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.ddbstream.Ddb2StreamComponent;

/**
 * Receive messages from AWS DynamoDB Stream service using AWS SDK version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2DdbstreamComponentBuilderFactory {

    /**
     * AWS 2 DynamoDB Streams (camel-aws2-ddb)
     * Receive messages from AWS DynamoDB Stream service using AWS SDK version
     * 2.x.
     * 
     * Category: cloud,messaging,streams
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-ddb
     */
    static Aws2DdbstreamComponentBuilder aws2Ddbstream() {
        return new Aws2DdbstreamComponentBuilderImpl();
    }

    /**
     * Builder for the AWS 2 DynamoDB Streams component.
     */
    interface Aws2DdbstreamComponentBuilder
            extends
                ComponentBuilder<Ddb2StreamComponent> {
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default Aws2DdbstreamComponentBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Amazon DynamoDB client to use for all requests for this endpoint.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient</code> type.
         * 
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder amazonDynamoDbStreamsClient(
                software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient amazonDynamoDbStreamsClient) {
            doSetProperty("amazonDynamoDbStreamsClient", amazonDynamoDbStreamsClient);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration</code> type.
         * 
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder configuration(
                org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Defines where in the DynaboDB stream to start getting records. Note
         * that using TRIM_HORIZON can cause a significant delay before the
         * stream has caught up to real-time. if {AT,AFTER}_SEQUENCE_NUMBER are
         * used, then a sequenceNumberProvider MUST be supplied.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.dynamodb.model.ShardIteratorType</code> type.
         * 
         * Default: LATEST
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder iteratorType(
                software.amazon.awssdk.services.dynamodb.model.ShardIteratorType iteratorType) {
            doSetProperty("iteratorType", iteratorType);
            return this;
        }
        /**
         * Maximum number of records that will be fetched in each poll.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder maxResultsPerRequest(
                int maxResultsPerRequest) {
            doSetProperty("maxResultsPerRequest", maxResultsPerRequest);
            return this;
        }
        /**
         * To define a proxy host when instantiating the DDBStreams client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder proxyHost(
                java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the DDBStreams client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder proxyPort(
                java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the DDBStreams client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which DDBStreams client needs to work.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Provider for the sequence number when using one of the two
         * ShardIteratorType.{AT,AFTER}_SEQUENCE_NUMBER iterator types. Can be a
         * registry reference or a literal sequence number.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.ddbstream.SequenceNumberProvider</code> type.
         * 
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder sequenceNumberProvider(
                org.apache.camel.component.aws2.ddbstream.SequenceNumberProvider sequenceNumberProvider) {
            doSetProperty("sequenceNumberProvider", sequenceNumberProvider);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default Aws2DdbstreamComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default Aws2DdbstreamComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2DdbstreamComponentBuilder accessKey(
                java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2DdbstreamComponentBuilder secretKey(
                java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2DdbstreamComponentBuilderImpl
            extends
                AbstractComponentBuilder<Ddb2StreamComponent>
            implements
                Aws2DdbstreamComponentBuilder {
        @Override
        protected Ddb2StreamComponent buildConcreteComponent() {
            return new Ddb2StreamComponent();
        }
        private org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws2.ddbstream.Ddb2StreamComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autoDiscoverClient": getOrCreateConfiguration((Ddb2StreamComponent) component).setAutoDiscoverClient((boolean) value); return true;
            case "amazonDynamoDbStreamsClient": getOrCreateConfiguration((Ddb2StreamComponent) component).setAmazonDynamoDbStreamsClient((software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient) value); return true;
            case "bridgeErrorHandler": ((Ddb2StreamComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "configuration": ((Ddb2StreamComponent) component).setConfiguration((org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration) value); return true;
            case "iteratorType": getOrCreateConfiguration((Ddb2StreamComponent) component).setIteratorType((software.amazon.awssdk.services.dynamodb.model.ShardIteratorType) value); return true;
            case "maxResultsPerRequest": getOrCreateConfiguration((Ddb2StreamComponent) component).setMaxResultsPerRequest((int) value); return true;
            case "proxyHost": getOrCreateConfiguration((Ddb2StreamComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((Ddb2StreamComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((Ddb2StreamComponent) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "region": getOrCreateConfiguration((Ddb2StreamComponent) component).setRegion((java.lang.String) value); return true;
            case "sequenceNumberProvider": getOrCreateConfiguration((Ddb2StreamComponent) component).setSequenceNumberProvider((org.apache.camel.component.aws2.ddbstream.SequenceNumberProvider) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((Ddb2StreamComponent) component).setTrustAllCertificates((boolean) value); return true;
            case "autowiredEnabled": ((Ddb2StreamComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((Ddb2StreamComponent) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((Ddb2StreamComponent) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}