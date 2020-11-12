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
 * Run compute operations on an Ignite cluster.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteComputeEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Ignite Compute component.
     */
    public interface IgniteComputeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedIgniteComputeEndpointBuilder advanced() {
            return (AdvancedIgniteComputeEndpointBuilder) this;
        }
        /**
         * An expression that returns the Cluster Group for the IgniteCompute
         * instance.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ignite.ClusterGroupExpression</code>
         * type.
         * 
         * Group: producer
         */
        default IgniteComputeEndpointBuilder clusterGroupExpression(
                Object clusterGroupExpression) {
            doSetProperty("clusterGroupExpression", clusterGroupExpression);
            return this;
        }
        /**
         * An expression that returns the Cluster Group for the IgniteCompute
         * instance.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ignite.ClusterGroupExpression</code>
         * type.
         * 
         * Group: producer
         */
        default IgniteComputeEndpointBuilder clusterGroupExpression(
                String clusterGroupExpression) {
            doSetProperty("clusterGroupExpression", clusterGroupExpression);
            return this;
        }
        /**
         * The name of the compute job, which will be set via
         * IgniteCompute#withName(String).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default IgniteComputeEndpointBuilder computeName(String computeName) {
            doSetProperty("computeName", computeName);
            return this;
        }
        /**
         * The compute operation to perform. Possible values: CALL, BROADCAST,
         * APPLY, EXECUTE, RUN, AFFINITY_CALL, AFFINITY_RUN. The component
         * expects different payload types depending on the operation.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ignite.compute.IgniteComputeExecutionType</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default IgniteComputeEndpointBuilder executionType(
                IgniteComputeExecutionType executionType) {
            doSetProperty("executionType", executionType);
            return this;
        }
        /**
         * The compute operation to perform. Possible values: CALL, BROADCAST,
         * APPLY, EXECUTE, RUN, AFFINITY_CALL, AFFINITY_RUN. The component
         * expects different payload types depending on the operation.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ignite.compute.IgniteComputeExecutionType</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default IgniteComputeEndpointBuilder executionType(String executionType) {
            doSetProperty("executionType", executionType);
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
        default IgniteComputeEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
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
        default IgniteComputeEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default IgniteComputeEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default IgniteComputeEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * The task name, only applicable if using the
         * IgniteComputeExecutionType#EXECUTE execution type.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default IgniteComputeEndpointBuilder taskName(String taskName) {
            doSetProperty("taskName", taskName);
            return this;
        }
        /**
         * The timeout interval for triggered jobs, in milliseconds, which will
         * be set via IgniteCompute#withTimeout(long).
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default IgniteComputeEndpointBuilder timeoutMillis(Long timeoutMillis) {
            doSetProperty("timeoutMillis", timeoutMillis);
            return this;
        }
        /**
         * The timeout interval for triggered jobs, in milliseconds, which will
         * be set via IgniteCompute#withTimeout(long).
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default IgniteComputeEndpointBuilder timeoutMillis(String timeoutMillis) {
            doSetProperty("timeoutMillis", timeoutMillis);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default IgniteComputeEndpointBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default IgniteComputeEndpointBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Ignite Compute component.
     */
    public interface AdvancedIgniteComputeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default IgniteComputeEndpointBuilder basic() {
            return (IgniteComputeEndpointBuilder) this;
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
        default AdvancedIgniteComputeEndpointBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedIgniteComputeEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.ignite.compute.IgniteComputeExecutionType</code> enum.
     */
    enum IgniteComputeExecutionType {
        CALL,
        BROADCAST,
        APPLY,
        EXECUTE,
        RUN,
        AFFINITY_CALL,
        AFFINITY_RUN;
    }

    public interface IgniteComputeBuilders {
        /**
         * Ignite Compute (camel-ignite)
         * Run compute operations on an Ignite cluster.
         * 
         * Category: compute
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-compute:endpointId</code>
         * 
         * Path parameter: endpointId (required)
         * The endpoint ID (not used).
         * 
         * @param path endpointId
         */
        default IgniteComputeEndpointBuilder igniteCompute(String path) {
            return IgniteComputeEndpointBuilderFactory.endpointBuilder("ignite-compute", path);
        }
        /**
         * Ignite Compute (camel-ignite)
         * Run compute operations on an Ignite cluster.
         * 
         * Category: compute
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-compute:endpointId</code>
         * 
         * Path parameter: endpointId (required)
         * The endpoint ID (not used).
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path endpointId
         */
        default IgniteComputeEndpointBuilder igniteCompute(
                String componentName,
                String path) {
            return IgniteComputeEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static IgniteComputeEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class IgniteComputeEndpointBuilderImpl extends AbstractEndpointBuilder implements IgniteComputeEndpointBuilder, AdvancedIgniteComputeEndpointBuilder {
            public IgniteComputeEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new IgniteComputeEndpointBuilderImpl(path);
    }
}