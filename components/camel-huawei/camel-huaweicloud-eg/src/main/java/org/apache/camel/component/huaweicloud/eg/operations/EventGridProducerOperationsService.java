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
package org.apache.camel.component.huaweicloud.eg.operations;

import java.util.Locale;
import com.google.gson.Gson;
import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.RequestTimeoutException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.eg.v1.EgClient;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.ListChannelsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListChannelsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventSourcesRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventSourcesResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.ListSubscriptionsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListSubscriptionsResponse;
import org.apache.camel.Exchange;
import org.apache.camel.component.huaweicloud.eg.EventGridConfiguration;
import org.apache.camel.component.huaweicloud.eg.constants.EventGridProducerOperations;
import org.apache.camel.util.ObjectHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EventGridProducerOperationsService {
    private static final Logger LOG = LoggerFactory.getLogger(EventGridProducerOperationsService.class);

    private final EgClient producerClient;

    private EventGridConfiguration configuration;

    private Gson gson = new Gson();

    public EventGridProducerOperationsService(EgClient producerClient, EventGridConfiguration configuration) {
        ObjectHelper.notNull(producerClient, "client cannot be null");
        this.producerClient = producerClient;
        this.configuration = configuration;
    }

    public void sendEvents(final Exchange exchange) {
        ObjectHelper.notNull(exchange, "exchange cannot be null");

        switch (this.configuration.getOperation()) {
            case EventGridProducerOperations.LIST_SUBSCRIPTIONS -> listSubscriptionsOperation(exchange);
            case EventGridProducerOperations.DELETE_SUBSCRIPTION -> DeleteSubscriptionOperation(exchange);
            case EventGridProducerOperations.LIST_CHANNELS -> listChannelsOperation(exchange);
            case EventGridProducerOperations.LIST_EVENT_SOURCES -> listEventSourcesOperation(exchange);
            case EventGridProducerOperations.LIST_EVENT_TARGET -> listEventTargetOperation(exchange);
        }
    }

    private void listSubscriptionsOperation(Exchange exchange) {
        ListSubscriptionsRequest request = new ListSubscriptionsRequest();
        if (ObjectHelper.isNotEmpty(this.configuration.getChannelId()))
            request.setChannelId(this.configuration.getChannelId());
        if (ObjectHelper.isNotEmpty(this.configuration.getOffset()))
            request.setOffset(this.configuration.getOffset());
        if (ObjectHelper.isNotEmpty(this.configuration.getLimit()))
            request.setLimit(this.configuration.getLimit());
        if (ObjectHelper.isNotEmpty(this.configuration.getSort()))
            request.setSort(this.configuration.getSort());
        if (ObjectHelper.isNotEmpty(this.configuration.getName()))
            request.setName(this.configuration.getName());
        if (ObjectHelper.isNotEmpty(this.configuration.getFuzzyName()))
            request.setFuzzyName(this.configuration.getFuzzyName());
        try {
            ListSubscriptionsResponse response = producerClient.listSubscriptions(request);
            exchange.getIn().setBody(gson.toJson(response));
        } catch (ConnectionException e) {
            e.printStackTrace();
            LOG.error("Please check if You Have a Stable Internet Connection");
        } catch (RequestTimeoutException e) {
            e.printStackTrace();
            LOG.error("Please check if You Have a Stable Internet Connection");
        } catch (ServiceResponseException e) {
            e.printStackTrace();
        }
    }

    private void DeleteSubscriptionOperation(Exchange exchange) {
        DeleteSubscriptionRequest request = new DeleteSubscriptionRequest();
        if (ObjectHelper.isNotEmpty(this.configuration.getSubscriptionId()))
            request.withSubscriptionId(this.configuration.getSubscriptionId());
        try {
            DeleteSubscriptionResponse response = producerClient.deleteSubscription(request);
            exchange.getIn().setBody(gson.toJson(response));
        } catch (ConnectionException e) {
            e.printStackTrace();
            LOG.error("Please check if You Have a Stable Internet Connection");
        } catch (RequestTimeoutException e) {
            e.printStackTrace();
            LOG.error("Please check if You Have a Stable Internet Connection");
        } catch (ServiceResponseException e) {
            e.printStackTrace();
        }
    }

    private void listChannelsOperation(Exchange exchange) {
        ListChannelsRequest request = new ListChannelsRequest();
        if (ObjectHelper.isNotEmpty(this.configuration.getOffset()))
            request.setOffset(this.configuration.getOffset());
        if (ObjectHelper.isNotEmpty(this.configuration.getLimit()))
            request.setLimit(this.configuration.getLimit());
        if (ObjectHelper.isNotEmpty(this.configuration.getSort()))
            request.setSort(this.configuration.getSort());
        if (ObjectHelper.isNotEmpty(this.configuration.getProviderType()))
            request.setProviderType(
                ListChannelsRequest.ProviderTypeEnum.valueOf(this.configuration.getProviderType().toUpperCase(Locale.US)));
        if (ObjectHelper.isNotEmpty(this.configuration.getName()))
            request.setName(this.configuration.getName());
        if (ObjectHelper.isNotEmpty(this.configuration.getFuzzyName()))
            request.setFuzzyName(this.configuration.getFuzzyName());

        try {
            ListChannelsResponse response = producerClient.listChannels(request);
            exchange.getIn().setBody(gson.toJson(response));
        } catch (ConnectionException e) {
            e.printStackTrace();
            LOG.error("Please check if You Have a Stable Internet Connection");
        } catch (RequestTimeoutException e) {
            e.printStackTrace();
            LOG.error("Please check if You Have a Stable Internet Connection");
        } catch (ServiceResponseException e) {
            e.printStackTrace();
        }
    }

    private void listEventSourcesOperation(Exchange exchange) {
        ListEventSourcesRequest request = new ListEventSourcesRequest();
        if (ObjectHelper.isNotEmpty(this.configuration.getChannelId()))
            request.setChannelId(this.configuration.getChannelId());
        if (ObjectHelper.isNotEmpty(this.configuration.getOffset()))
            request.setOffset(this.configuration.getOffset());
        if (ObjectHelper.isNotEmpty(this.configuration.getLimit()))
            request.setLimit(this.configuration.getLimit());
        if (ObjectHelper.isNotEmpty(this.configuration.getSort()))
            request.setSort(this.configuration.getSort());
        if (ObjectHelper.isNotEmpty(this.configuration.getProviderType()))
            request.setProviderType(
                ListEventSourcesRequest.ProviderTypeEnum.valueOf(this.configuration.getProviderType().toUpperCase(Locale.US)));
        if (ObjectHelper.isNotEmpty(this.configuration.getName()))
            request.setName(this.configuration.getName());
        if (ObjectHelper.isNotEmpty(this.configuration.getFuzzyName()))
            request.setFuzzyName(this.configuration.getFuzzyName());
        if (ObjectHelper.isNotEmpty(this.configuration.getFuzzyLabel()))
            request.setFuzzyLabel(this.configuration.getFuzzyLabel());

        try {
            ListEventSourcesResponse response = producerClient.listEventSources(request);
            exchange.getIn().setBody(gson.toJson(response));
        } catch (ConnectionException e) {
            e.printStackTrace();
            LOG.error("Please check if You Have a Stable Internet Connection");
        } catch (RequestTimeoutException e) {
            e.printStackTrace();
            LOG.error("Please check if You Have a Stable Internet Connection");
        } catch (ServiceResponseException e) {
            e.printStackTrace();
        }
    }

    private void listEventTargetOperation(Exchange exchange) {
        ListEventTargetRequest request = new ListEventTargetRequest();
        if (ObjectHelper.isNotEmpty(this.configuration.getOffset()))
            request.setOffset(this.configuration.getOffset());
        if (ObjectHelper.isNotEmpty(this.configuration.getLimit()))
            request.setLimit(this.configuration.getLimit());
        if (ObjectHelper.isNotEmpty(this.configuration.getSort()))
            request.setSort(this.configuration.getSort());
        if (ObjectHelper.isNotEmpty(this.configuration.getFuzzyLabel()))
            request.setFuzzyLabel(this.configuration.getFuzzyLabel());

        try {
            ListEventTargetResponse response = producerClient.listEventTarget(request);
            exchange.getIn().setBody(gson.toJson(response));
        } catch (ConnectionException e) {
            e.printStackTrace();
            LOG.error("Please check if You Have a Stable Internet Connection");
        } catch (RequestTimeoutException e) {
            e.printStackTrace();
            LOG.error("Please check if You Have a Stable Internet Connection");
        } catch (ServiceResponseException e) {
            e.printStackTrace();
        }
    }
}
