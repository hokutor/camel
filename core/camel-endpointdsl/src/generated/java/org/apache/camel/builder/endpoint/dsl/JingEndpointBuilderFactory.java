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
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Validate XML against a RelaxNG schema (XML Syntax or Compact Syntax) using
 * Jing library.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JingEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Jing component.
     */
    public interface JingEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedJingEndpointBuilder advanced() {
            return (AdvancedJingEndpointBuilder) this;
        }
        /**
         * Whether to validate using RelaxNG compact syntax or not. By default
         * this is false for using RelaxNG XML Syntax (rng) And true is for
         * using RelaxNG Compact Syntax (rnc).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default JingEndpointBuilder compactSyntax(boolean compactSyntax) {
            doSetProperty("compactSyntax", compactSyntax);
            return this;
        }
        /**
         * Whether to validate using RelaxNG compact syntax or not. By default
         * this is false for using RelaxNG XML Syntax (rng) And true is for
         * using RelaxNG Compact Syntax (rnc).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default JingEndpointBuilder compactSyntax(String compactSyntax) {
            doSetProperty("compactSyntax", compactSyntax);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default JingEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default JingEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Jing component.
     */
    public interface AdvancedJingEndpointBuilder
            extends
                EndpointProducerBuilder {
        default JingEndpointBuilder basic() {
            return (JingEndpointBuilder) this;
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
        default AdvancedJingEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedJingEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface JingBuilders {
        /**
         * Jing (camel-jing)
         * Validate XML against a RelaxNG schema (XML Syntax or Compact Syntax)
         * using Jing library.
         * 
         * Category: validation
         * Since: 1.1
         * Maven coordinates: org.apache.camel:camel-jing
         * 
         * Syntax: <code>jing:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * URL to a local resource on the classpath or a full URL to a remote
         * resource or resource on the file system which contains the schema to
         * validate against.
         * 
         * @param path resourceUri
         */
        default JingEndpointBuilder jing(String path) {
            return JingEndpointBuilderFactory.endpointBuilder("jing", path);
        }
        /**
         * Jing (camel-jing)
         * Validate XML against a RelaxNG schema (XML Syntax or Compact Syntax)
         * using Jing library.
         * 
         * Category: validation
         * Since: 1.1
         * Maven coordinates: org.apache.camel:camel-jing
         * 
         * Syntax: <code>jing:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * URL to a local resource on the classpath or a full URL to a remote
         * resource or resource on the file system which contains the schema to
         * validate against.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceUri
         */
        default JingEndpointBuilder jing(String componentName, String path) {
            return JingEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static JingEndpointBuilder endpointBuilder(String componentName, String path) {
        class JingEndpointBuilderImpl extends AbstractEndpointBuilder implements JingEndpointBuilder, AdvancedJingEndpointBuilder {
            public JingEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new JingEndpointBuilderImpl(path);
    }
}