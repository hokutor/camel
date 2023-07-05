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
package org.apache.camel.component.huaweicloud.eg;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.eg.v1.EgClient;
import com.huaweicloud.sdk.eg.v1.region.EgRegion;
import org.apache.camel.Category;
import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.apache.camel.support.DefaultEndpoint;
import org.apache.camel.util.ObjectHelper;

/**
 * EventGrid component which does bla bla.
 *
 * TODO: Update one line description above what the component does, and update Category.
 */
@UriEndpoint(firstVersion = "4.0.0", scheme = "hwcloud-eg", title = "Huawei EventGrid",
             syntax = "hwcloud-eg:operation", category = { Category.CLOUD, Category.MANAGEMENT })
public class EventGridEndpoint extends DefaultEndpoint {
    @UriParam
    private EventGridConfiguration configuration;

    public EventGridEndpoint(String uri, EventGridComponent component, EventGridConfiguration configuration) {
        super(uri, component);
        this.configuration = configuration;
    }

    @Override
    public Producer createProducer() throws Exception {
        return new EventGridProducer(this);
    }

    @Override
    public Consumer createConsumer(Processor processor) throws Exception {
        Consumer consumer = new EventGridConsumer(this, processor);
        configureConsumer(consumer);
        return consumer;
    }

    public EgClient initClient() {
        // check for mandatory AK/SK in ServiceKeys object or in endpoint
        if (ObjectHelper.isEmpty(configuration.getServiceKeys()) && ObjectHelper.isEmpty(configuration.getAccessKey())) {
            throw new IllegalArgumentException("Authentication parameter 'access key (AK)' not found");
        }
        if (ObjectHelper.isEmpty(configuration.getServiceKeys()) && ObjectHelper.isEmpty(configuration.getSecretKey())) {
            throw new IllegalArgumentException("Authentication parameter 'secret key (SK)' not found");
        }

        // setup AK/SK credential information. AK/SK provided through ServiceKeys overrides the AK/SK passed through the endpoint
        BasicCredentials auth = new BasicCredentials()
                .withAk(configuration.getServiceKeys() != null
                        ? configuration.getServiceKeys().getAccessKey()
                        : configuration.getAccessKey())
                .withSk(configuration.getServiceKeys() != null
                        ? configuration.getServiceKeys().getSecretKey()
                        : configuration.getSecretKey())
                .withProjectId(configuration.getProjectId());

        // setup http information (including proxy information if provided)
        HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig();
        httpConfig.withIgnoreSSLVerification(configuration.isIgnoreSslVerification());
        if (ObjectHelper.isNotEmpty(configuration.getProxyHost())
                && ObjectHelper.isNotEmpty(configuration.getProxyPort())) {
            httpConfig.withProxyHost(configuration.getProxyHost())
                    .withProxyPort(configuration.getProxyPort());

            if (ObjectHelper.isNotEmpty(configuration.getProxyUser())) {
                httpConfig.withProxyUsername(configuration.getProxyUser());
                if (ObjectHelper.isNotEmpty(configuration.getProxyPassword())) {
                    httpConfig.withProxyPassword(configuration.getProxyPassword());
                }
            }
        }

        return EgClient.newBuilder()
                .withCredential(auth)
                .withHttpConfig(httpConfig)
                .withRegion(EgRegion.valueOf(configuration.getRegion()))
                .build();
    }

    public EventGridConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(EventGridConfiguration configuration) {
        this.configuration = configuration;
    }
}
