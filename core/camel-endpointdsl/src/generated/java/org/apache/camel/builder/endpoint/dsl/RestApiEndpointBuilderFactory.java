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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Expose OpenAPI Specification of the REST services defined using Camel REST
 * DSL.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestApiEndpointBuilderFactory {


    /**
     * Builder for endpoint for the REST API component.
     */
    public interface RestApiEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedRestApiEndpointBuilder advanced() {
            return (AdvancedRestApiEndpointBuilder) this;
        }
        /**
         * The Camel Rest API component to use for generating the API of the
         * REST services, such as openapi.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default RestApiEndpointBuilder apiComponentName(String apiComponentName) {
            doSetProperty("apiComponentName", apiComponentName);
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
        default RestApiEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default RestApiEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The Camel Rest component to use for (consumer) the REST transport,
         * such as jetty, servlet, undertow. If no component has been explicit
         * configured, then Camel will lookup if there is a Camel component that
         * integrates with the Rest DSL, or if a
         * org.apache.camel.spi.RestConsumerFactory is registered in the
         * registry. If either one is found, then that is being used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default RestApiEndpointBuilder consumerComponentName(
                String consumerComponentName) {
            doSetProperty("consumerComponentName", consumerComponentName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the REST API component.
     */
    public interface AdvancedRestApiEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default RestApiEndpointBuilder basic() {
            return (RestApiEndpointBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRestApiEndpointBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRestApiEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRestApiEndpointBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRestApiEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestApiEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestApiEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface RestApiBuilders {
        /**
         * REST API (camel-rest)
         * Expose OpenAPI Specification of the REST services defined using Camel
         * REST DSL.
         * 
         * Category: core,rest
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-rest
         * 
         * Syntax: <code>rest-api:path/contextIdPattern</code>
         * 
         * Path parameter: path (required)
         * The base path
         * 
         * Path parameter: contextIdPattern
         * Optional CamelContext id pattern to only allow Rest APIs from rest
         * services within CamelContext's which name matches the pattern.
         * 
         * @param path path/contextIdPattern
         */
        default RestApiEndpointBuilder restApi(String path) {
            return RestApiEndpointBuilderFactory.endpointBuilder("rest-api", path);
        }
        /**
         * REST API (camel-rest)
         * Expose OpenAPI Specification of the REST services defined using Camel
         * REST DSL.
         * 
         * Category: core,rest
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-rest
         * 
         * Syntax: <code>rest-api:path/contextIdPattern</code>
         * 
         * Path parameter: path (required)
         * The base path
         * 
         * Path parameter: contextIdPattern
         * Optional CamelContext id pattern to only allow Rest APIs from rest
         * services within CamelContext's which name matches the pattern.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path path/contextIdPattern
         */
        default RestApiEndpointBuilder restApi(String componentName, String path) {
            return RestApiEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static RestApiEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class RestApiEndpointBuilderImpl extends AbstractEndpointBuilder implements RestApiEndpointBuilder, AdvancedRestApiEndpointBuilder {
            public RestApiEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new RestApiEndpointBuilderImpl(path);
    }
}