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
import org.apache.camel.component.disruptor.vm.DisruptorVmComponent;

/**
 * Provides asynchronous SEDA behavior using LMAX Disruptor.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface DisruptorVmComponentBuilderFactory {

    /**
     * Disruptor VM (camel-disruptor)
     * Provides asynchronous SEDA behavior using LMAX Disruptor.
     * 
     * Category: endpoint
     * Since: 2.12
     * Maven coordinates: org.apache.camel:camel-disruptor
     */
    static DisruptorVmComponentBuilder disruptorVm() {
        return new DisruptorVmComponentBuilderImpl();
    }

    /**
     * Builder for the Disruptor VM component.
     */
    interface DisruptorVmComponentBuilder
            extends
                ComponentBuilder<DisruptorVmComponent> {
        /**
         * To configure the ring buffer size.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1024
         * Group: common
         */
        default DisruptorVmComponentBuilder bufferSize(int bufferSize) {
            doSetProperty("bufferSize", bufferSize);
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
        default DisruptorVmComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To configure the default number of concurrent consumers.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default DisruptorVmComponentBuilder defaultConcurrentConsumers(
                int defaultConcurrentConsumers) {
            doSetProperty("defaultConcurrentConsumers", defaultConcurrentConsumers);
            return this;
        }
        /**
         * To configure the default value for multiple consumers.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default DisruptorVmComponentBuilder defaultMultipleConsumers(
                boolean defaultMultipleConsumers) {
            doSetProperty("defaultMultipleConsumers", defaultMultipleConsumers);
            return this;
        }
        /**
         * To configure the default value for DisruptorWaitStrategy The default
         * value is Blocking.
         * 
         * The option is a:
         * <code>org.apache.camel.component.disruptor.DisruptorWaitStrategy</code> type.
         * 
         * Default: Blocking
         * Group: consumer
         */
        default DisruptorVmComponentBuilder defaultWaitStrategy(
                org.apache.camel.component.disruptor.DisruptorWaitStrategy defaultWaitStrategy) {
            doSetProperty("defaultWaitStrategy", defaultWaitStrategy);
            return this;
        }
        /**
         * To configure the default value for block when full The default value
         * is true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default DisruptorVmComponentBuilder defaultBlockWhenFull(
                boolean defaultBlockWhenFull) {
            doSetProperty("defaultBlockWhenFull", defaultBlockWhenFull);
            return this;
        }
        /**
         * To configure the default value for DisruptorProducerType The default
         * value is Multi.
         * 
         * The option is a:
         * <code>org.apache.camel.component.disruptor.DisruptorProducerType</code> type.
         * 
         * Default: Multi
         * Group: producer
         */
        default DisruptorVmComponentBuilder defaultProducerType(
                org.apache.camel.component.disruptor.DisruptorProducerType defaultProducerType) {
            doSetProperty("defaultProducerType", defaultProducerType);
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
        default DisruptorVmComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default DisruptorVmComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class DisruptorVmComponentBuilderImpl
            extends
                AbstractComponentBuilder<DisruptorVmComponent>
            implements
                DisruptorVmComponentBuilder {
        @Override
        protected DisruptorVmComponent buildConcreteComponent() {
            return new DisruptorVmComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bufferSize": ((DisruptorVmComponent) component).setBufferSize((int) value); return true;
            case "bridgeErrorHandler": ((DisruptorVmComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "defaultConcurrentConsumers": ((DisruptorVmComponent) component).setDefaultConcurrentConsumers((int) value); return true;
            case "defaultMultipleConsumers": ((DisruptorVmComponent) component).setDefaultMultipleConsumers((boolean) value); return true;
            case "defaultWaitStrategy": ((DisruptorVmComponent) component).setDefaultWaitStrategy((org.apache.camel.component.disruptor.DisruptorWaitStrategy) value); return true;
            case "defaultBlockWhenFull": ((DisruptorVmComponent) component).setDefaultBlockWhenFull((boolean) value); return true;
            case "defaultProducerType": ((DisruptorVmComponent) component).setDefaultProducerType((org.apache.camel.component.disruptor.DisruptorProducerType) value); return true;
            case "lazyStartProducer": ((DisruptorVmComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((DisruptorVmComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}