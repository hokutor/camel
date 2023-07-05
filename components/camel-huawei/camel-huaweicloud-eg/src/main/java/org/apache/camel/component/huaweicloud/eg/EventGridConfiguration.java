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

import com.huaweicloud.sdk.eg.v1.EgClient;
import org.apache.camel.component.huaweicloud.common.models.ServiceKeys;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;
import org.apache.camel.spi.UriPath;

@UriParams
public class EventGridConfiguration implements Cloneable {

    @UriPath(label = "common", description = "Operation to be performed",
             displayName = "Operation")
    @Metadata(required = true)
    private String operation;

    @UriParam(label = "security", description = "Configuration object for cloud service authentication",
              displayName = "Service Configuration",
              secret = true)
    @Metadata(required = false)
    private ServiceKeys serviceKeys;

    @UriParam(label = "security", description = "Access key for the cloud user", displayName = "API access key (AK)",
              secret = true)
    @Metadata(required = true)
    private String accessKey;

    @UriParam(label = "security", description = "Secret key for the cloud user", displayName = "API secret key (SK)",
              secret = true)
    @Metadata(required = true)
    private String secretKey;

    @UriParam(label = "producer",
              description = "EventGrid url. Carries higher precedence than region parameter based client initialization",
              displayName = "Service endpoint", secret = false)
    @Metadata(required = false)
    private String endpoint;

    @UriParam(label = "common", description = "IAM service region", displayName = "Service region", secret = false)
    @Metadata(required = true)
    private String region;

    @UriParam(label = "common", description = "Proxy server ip/hostname", displayName = "Proxy server host", secret = false)
    @Metadata(required = false)
    private String proxyHost;

    @UriParam(label = "common", description = "Proxy server port", displayName = "Proxy server port", secret = false)
    @Metadata(required = false)
    private int proxyPort;

    @UriParam(label = "common", description = "Proxy authentication user", displayName = "Proxy user", secret = true)
    @Metadata(required = false)
    private String proxyUser;

    @UriParam(label = "common", description = "Proxy authentication password", displayName = "Proxy password", secret = true)
    @Metadata(required = false)
    private String proxyPassword;

    @UriParam(label = "common", description = "Ignore SSL verification", displayName = "SSL Verification Ignored",
              secret = false, defaultValue = "false")
    @Metadata(required = false)
    private boolean ignoreSslVerification;

    @UriParam(label = "producer", description = "User project id", displayName = "Project ID", secret = true,
              defaultValue = "false")
    @Metadata(required = true)
    private String projectId;

    @UriParam(label = "producer", description = "Subscription id", displayName = "Subscription ID", secret = false,
              defaultValue = "false")
    @Metadata(required = true)
    private String subscriptionId;

    @UriParam(label = "producer", description = "Event source id", displayName = "Source ID", secret = false,
              defaultValue = "false")
    @Metadata(required = true)
    private String sourceId;

    @UriParam(label = "producer", description = "Event target id", displayName = "Target ID", secret = false,
              defaultValue = "false")
    @Metadata(required = true)
    private String targetId;

    @UriParam(label = "producer", description = "Event channel id", displayName = "Target ID", secret = false,
              defaultValue = "false")
    @Metadata(required = false)
    private String channelId;

    @UriParam(label = "producer",
              description = "Indicates the offset from which the query starts. The offset cannot be less than 0.",
              displayName = "Offset", secret = false,
              defaultValue = "false")
    @Metadata(required = false)
    private Integer offset;

    @UriParam(label = "producer",
              description = "Number of items displayed on each page. The value cannot be less than 1 or greater than 1000.",
              displayName = "Limit", secret = false,
              defaultValue = "false")
    @Metadata(required = false)
    private Integer limit;

    @UriParam(label = "producer", description = "Query Sorting",
              displayName = "Sort", secret = false,
              defaultValue = "false")
    @Metadata(required = false)
    private String sort;

    @UriParam(label = "producer",
              description = "Specifies the name of the event subscription to be queried, which is used for exact matching.",
              displayName = "Name", secret = false,
              defaultValue = "false")
    @Metadata(required = false)
    private String name;

    @UriParam(label = "producer",
              description = "Specifies the name of the event subscription to be queried, which is a fuzzy match.",
              displayName = "Fuzzy Name", secret = false,
              defaultValue = "false")
    @Metadata(required = false)
    private String fuzzyName;

    @UriParam(label = "producer",
        description = "Specifies the tag of the event source to be queried, which is used for fuzzy match.",
        displayName = "Fuzzy Label", secret = false,
        defaultValue = "false")
    @Metadata(required = false)
    private String fuzzyLabel;

    @UriParam(label = "producer", description = "Target connection ID.",
              displayName = "Connection Id", secret = false,
              defaultValue = "false")
    @Metadata(required = false)
    private String connectionId;

    @UriParam(label = "producer", description = "Specifies the type of query provider. 'OFFICIAL' & 'CUSTOM'",
        displayName = "Provider Type", secret = false,
        defaultValue = "false")
    @Metadata(required = false)
    private String providerType;

    @UriParam(label = "producer", description = "EventGrid client object")
    @Metadata(autowired = true)
    private EgClient producerClient;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ServiceKeys getServiceKeys() {
        return serviceKeys;
    }

    public void setServiceKeys(ServiceKeys serviceKeys) {
        this.serviceKeys = serviceKeys;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getProxyUser() {
        return proxyUser;
    }

    public void setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public boolean isIgnoreSslVerification() {
        return ignoreSslVerification;
    }

    public void setIgnoreSslVerification(boolean ignoreSslVerification) {
        this.ignoreSslVerification = ignoreSslVerification;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuzzyName() {
        return fuzzyName;
    }

    public void setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public EgClient getProducerClient() {
        return producerClient;
    }

    public void setProducerClient(EgClient producerClient) {
        this.producerClient = producerClient;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public String getFuzzyLabel() {
        return fuzzyLabel;
    }

    public void setFuzzyLabel(String fuzzyLabel) {
        this.fuzzyLabel = fuzzyLabel;
    }
}
