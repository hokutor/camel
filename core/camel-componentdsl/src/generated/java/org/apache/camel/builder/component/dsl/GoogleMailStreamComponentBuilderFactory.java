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
import org.apache.camel.component.google.mail.stream.GoogleMailStreamComponent;

/**
 * Poll for incoming messages in Google Mail.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface GoogleMailStreamComponentBuilderFactory {

    /**
     * Google Mail Stream (camel-google-mail)
     * Poll for incoming messages in Google Mail.
     * 
     * Category: cloud,api,mail
     * Since: 2.22
     * Maven coordinates: org.apache.camel:camel-google-mail
     */
    static GoogleMailStreamComponentBuilder googleMailStream() {
        return new GoogleMailStreamComponentBuilderImpl();
    }

    /**
     * Builder for the Google Mail Stream component.
     */
    interface GoogleMailStreamComponentBuilder
            extends
                ComponentBuilder<GoogleMailStreamComponent> {
        /**
         * Google mail application name. Example would be camel-google-mail/1.0.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default GoogleMailStreamComponentBuilder applicationName(
                java.lang.String applicationName) {
            doSetProperty("applicationName", applicationName);
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
        default GoogleMailStreamComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Client ID of the mail application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default GoogleMailStreamComponentBuilder clientId(
                java.lang.String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Comma separated list of labels to take into account.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default GoogleMailStreamComponentBuilder labels(java.lang.String labels) {
            doSetProperty("labels", labels);
            return this;
        }
        /**
         * Mark the message as read once it has been consumed.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleMailStreamComponentBuilder markAsRead(boolean markAsRead) {
            doSetProperty("markAsRead", markAsRead);
            return this;
        }
        /**
         * Max results to be returned.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 10
         * Group: consumer
         */
        default GoogleMailStreamComponentBuilder maxResults(long maxResults) {
            doSetProperty("maxResults", maxResults);
            return this;
        }
        /**
         * The query to execute on gmail box.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: is:unread
         * Group: consumer
         */
        default GoogleMailStreamComponentBuilder query(java.lang.String query) {
            doSetProperty("query", query);
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
        default GoogleMailStreamComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * The client Factory.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.mail.GoogleMailClientFactory</code> type.
         * 
         * Group: advanced
         */
        default GoogleMailStreamComponentBuilder clientFactory(
                org.apache.camel.component.google.mail.GoogleMailClientFactory clientFactory) {
            doSetProperty("clientFactory", clientFactory);
            return this;
        }
        /**
         * The configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration</code> type.
         * 
         * Group: advanced
         */
        default GoogleMailStreamComponentBuilder configuration(
                org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GoogleMailStreamComponentBuilder accessToken(
                java.lang.String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Client secret of the mail application.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GoogleMailStreamComponentBuilder clientSecret(
                java.lang.String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GoogleMailStreamComponentBuilder refreshToken(
                java.lang.String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
    }

    class GoogleMailStreamComponentBuilderImpl
            extends
                AbstractComponentBuilder<GoogleMailStreamComponent>
            implements
                GoogleMailStreamComponentBuilder {
        @Override
        protected GoogleMailStreamComponent buildConcreteComponent() {
            return new GoogleMailStreamComponent();
        }
        private org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration getOrCreateConfiguration(
                org.apache.camel.component.google.mail.stream.GoogleMailStreamComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "applicationName": getOrCreateConfiguration((GoogleMailStreamComponent) component).setApplicationName((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((GoogleMailStreamComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "clientId": getOrCreateConfiguration((GoogleMailStreamComponent) component).setClientId((java.lang.String) value); return true;
            case "labels": getOrCreateConfiguration((GoogleMailStreamComponent) component).setLabels((java.lang.String) value); return true;
            case "markAsRead": getOrCreateConfiguration((GoogleMailStreamComponent) component).setMarkAsRead((boolean) value); return true;
            case "maxResults": getOrCreateConfiguration((GoogleMailStreamComponent) component).setMaxResults((long) value); return true;
            case "query": getOrCreateConfiguration((GoogleMailStreamComponent) component).setQuery((java.lang.String) value); return true;
            case "autowiredEnabled": ((GoogleMailStreamComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "clientFactory": ((GoogleMailStreamComponent) component).setClientFactory((org.apache.camel.component.google.mail.GoogleMailClientFactory) value); return true;
            case "configuration": ((GoogleMailStreamComponent) component).setConfiguration((org.apache.camel.component.google.mail.stream.GoogleMailStreamConfiguration) value); return true;
            case "accessToken": getOrCreateConfiguration((GoogleMailStreamComponent) component).setAccessToken((java.lang.String) value); return true;
            case "clientSecret": getOrCreateConfiguration((GoogleMailStreamComponent) component).setClientSecret((java.lang.String) value); return true;
            case "refreshToken": getOrCreateConfiguration((GoogleMailStreamComponent) component).setRefreshToken((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}