/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kafka;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class KafkaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        KafkaEndpoint target = (KafkaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": target.getConfiguration().setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "allowmanualcommit":
        case "allowManualCommit": target.getConfiguration().setAllowManualCommit(property(camelContext, boolean.class, value)); return true;
        case "autocommitenable":
        case "autoCommitEnable": target.getConfiguration().setAutoCommitEnable(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "autocommitintervalms":
        case "autoCommitIntervalMs": target.getConfiguration().setAutoCommitIntervalMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "autocommitonstop":
        case "autoCommitOnStop": target.getConfiguration().setAutoCommitOnStop(property(camelContext, java.lang.String.class, value)); return true;
        case "autooffsetreset":
        case "autoOffsetReset": target.getConfiguration().setAutoOffsetReset(property(camelContext, java.lang.String.class, value)); return true;
        case "breakonfirsterror":
        case "breakOnFirstError": target.getConfiguration().setBreakOnFirstError(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "brokers": target.getConfiguration().setBrokers(property(camelContext, java.lang.String.class, value)); return true;
        case "buffermemorysize":
        case "bufferMemorySize": target.getConfiguration().setBufferMemorySize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "checkcrcs":
        case "checkCrcs": target.getConfiguration().setCheckCrcs(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "clientid":
        case "clientId": target.getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "compressioncodec":
        case "compressionCodec": target.getConfiguration().setCompressionCodec(property(camelContext, java.lang.String.class, value)); return true;
        case "connectionmaxidlems":
        case "connectionMaxIdleMs": target.getConfiguration().setConnectionMaxIdleMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "consumerrequesttimeoutms":
        case "consumerRequestTimeoutMs": target.getConfiguration().setConsumerRequestTimeoutMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "consumerstreams":
        case "consumerStreams": target.getConfiguration().setConsumerStreams(property(camelContext, int.class, value)); return true;
        case "consumerscount":
        case "consumersCount": target.getConfiguration().setConsumersCount(property(camelContext, int.class, value)); return true;
        case "enableidempotence":
        case "enableIdempotence": target.getConfiguration().setEnableIdempotence(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fetchmaxbytes":
        case "fetchMaxBytes": target.getConfiguration().setFetchMaxBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "fetchminbytes":
        case "fetchMinBytes": target.getConfiguration().setFetchMinBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "fetchwaitmaxms":
        case "fetchWaitMaxMs": target.getConfiguration().setFetchWaitMaxMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "groupid":
        case "groupId": target.getConfiguration().setGroupId(property(camelContext, java.lang.String.class, value)); return true;
        case "headerdeserializer":
        case "headerDeserializer": target.getConfiguration().setHeaderDeserializer(property(camelContext, org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.getConfiguration().setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "headerserializer":
        case "headerSerializer": target.getConfiguration().setHeaderSerializer(property(camelContext, org.apache.camel.component.kafka.serde.KafkaHeaderSerializer.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": target.getConfiguration().setHeartbeatIntervalMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "interceptorclasses":
        case "interceptorClasses": target.getConfiguration().setInterceptorClasses(property(camelContext, java.lang.String.class, value)); return true;
        case "kerberosbeforereloginmintime":
        case "kerberosBeforeReloginMinTime": target.getConfiguration().setKerberosBeforeReloginMinTime(property(camelContext, java.lang.Integer.class, value)); return true;
        case "kerberosinitcmd":
        case "kerberosInitCmd": target.getConfiguration().setKerberosInitCmd(property(camelContext, java.lang.String.class, value)); return true;
        case "kerberosprincipaltolocalrules":
        case "kerberosPrincipalToLocalRules": target.getConfiguration().setKerberosPrincipalToLocalRules(property(camelContext, java.lang.String.class, value)); return true;
        case "kerberosrenewjitter":
        case "kerberosRenewJitter": target.getConfiguration().setKerberosRenewJitter(property(camelContext, java.lang.Double.class, value)); return true;
        case "kerberosrenewwindowfactor":
        case "kerberosRenewWindowFactor": target.getConfiguration().setKerberosRenewWindowFactor(property(camelContext, java.lang.Double.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "keydeserializer":
        case "keyDeserializer": target.getConfiguration().setKeyDeserializer(property(camelContext, java.lang.String.class, value)); return true;
        case "keyserializer":
        case "keySerializer": target.getConfiguration().setKeySerializer(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lingerms":
        case "lingerMs": target.getConfiguration().setLingerMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxblockms":
        case "maxBlockMs": target.getConfiguration().setMaxBlockMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxinflightrequest":
        case "maxInFlightRequest": target.getConfiguration().setMaxInFlightRequest(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": target.getConfiguration().setMaxPartitionFetchBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxpollintervalms":
        case "maxPollIntervalMs": target.getConfiguration().setMaxPollIntervalMs(property(camelContext, java.lang.Long.class, value)); return true;
        case "maxpollrecords":
        case "maxPollRecords": target.getConfiguration().setMaxPollRecords(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxrequestsize":
        case "maxRequestSize": target.getConfiguration().setMaxRequestSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metadatamaxagems":
        case "metadataMaxAgeMs": target.getConfiguration().setMetadataMaxAgeMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metricreporters":
        case "metricReporters": target.getConfiguration().setMetricReporters(property(camelContext, java.lang.String.class, value)); return true;
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": target.getConfiguration().setMetricsSampleWindowMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "noofmetricssample":
        case "noOfMetricsSample": target.getConfiguration().setNoOfMetricsSample(property(camelContext, java.lang.Integer.class, value)); return true;
        case "offsetrepository":
        case "offsetRepository": target.getConfiguration().setOffsetRepository(property(camelContext, org.apache.camel.spi.StateRepository.class, value)); return true;
        case "partitionassignor":
        case "partitionAssignor": target.getConfiguration().setPartitionAssignor(property(camelContext, java.lang.String.class, value)); return true;
        case "partitionkey":
        case "partitionKey": target.getConfiguration().setPartitionKey(property(camelContext, java.lang.Integer.class, value)); return true;
        case "partitioner": target.getConfiguration().setPartitioner(property(camelContext, java.lang.String.class, value)); return true;
        case "polltimeoutms":
        case "pollTimeoutMs": target.getConfiguration().setPollTimeoutMs(property(camelContext, java.lang.Long.class, value)); return true;
        case "producerbatchsize":
        case "producerBatchSize": target.getConfiguration().setProducerBatchSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "queuebufferingmaxmessages":
        case "queueBufferingMaxMessages": target.getConfiguration().setQueueBufferingMaxMessages(property(camelContext, java.lang.Integer.class, value)); return true;
        case "receivebufferbytes":
        case "receiveBufferBytes": target.getConfiguration().setReceiveBufferBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": target.getConfiguration().setReconnectBackoffMaxMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "reconnectbackoffms":
        case "reconnectBackoffMs": target.getConfiguration().setReconnectBackoffMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "recordmetadata":
        case "recordMetadata": target.getConfiguration().setRecordMetadata(property(camelContext, boolean.class, value)); return true;
        case "requestrequiredacks":
        case "requestRequiredAcks": target.getConfiguration().setRequestRequiredAcks(property(camelContext, java.lang.String.class, value)); return true;
        case "requesttimeoutms":
        case "requestTimeoutMs": target.getConfiguration().setRequestTimeoutMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "retries": target.getConfiguration().setRetries(property(camelContext, java.lang.Integer.class, value)); return true;
        case "retrybackoffms":
        case "retryBackoffMs": target.getConfiguration().setRetryBackoffMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sasljaasconfig":
        case "saslJaasConfig": target.getConfiguration().setSaslJaasConfig(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberosservicename":
        case "saslKerberosServiceName": target.getConfiguration().setSaslKerberosServiceName(property(camelContext, java.lang.String.class, value)); return true;
        case "saslmechanism":
        case "saslMechanism": target.getConfiguration().setSaslMechanism(property(camelContext, java.lang.String.class, value)); return true;
        case "schemaregistryurl":
        case "schemaRegistryURL": target.getConfiguration().setSchemaRegistryURL(property(camelContext, java.lang.String.class, value)); return true;
        case "securityprotocol":
        case "securityProtocol": target.getConfiguration().setSecurityProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "seekto":
        case "seekTo": target.getConfiguration().setSeekTo(property(camelContext, java.lang.String.class, value)); return true;
        case "sendbufferbytes":
        case "sendBufferBytes": target.getConfiguration().setSendBufferBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sessiontimeoutms":
        case "sessionTimeoutMs": target.getConfiguration().setSessionTimeoutMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "shutdowntimeout":
        case "shutdownTimeout": target.getConfiguration().setShutdownTimeout(property(camelContext, int.class, value)); return true;
        case "specificavroreader":
        case "specificAvroReader": target.getConfiguration().setSpecificAvroReader(property(camelContext, boolean.class, value)); return true;
        case "sslciphersuites":
        case "sslCipherSuites": target.getConfiguration().setSslCipherSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslenabledprotocols":
        case "sslEnabledProtocols": target.getConfiguration().setSslEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "sslendpointalgorithm":
        case "sslEndpointAlgorithm": target.getConfiguration().setSslEndpointAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeypassword":
        case "sslKeyPassword": target.getConfiguration().setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": target.getConfiguration().setSslKeymanagerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystorelocation":
        case "sslKeystoreLocation": target.getConfiguration().setSslKeystoreLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystorepassword":
        case "sslKeystorePassword": target.getConfiguration().setSslKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystoretype":
        case "sslKeystoreType": target.getConfiguration().setSslKeystoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprotocol":
        case "sslProtocol": target.getConfiguration().setSslProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprovider":
        case "sslProvider": target.getConfiguration().setSslProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": target.getConfiguration().setSslTrustmanagerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststorelocation":
        case "sslTruststoreLocation": target.getConfiguration().setSslTruststoreLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststorepassword":
        case "sslTruststorePassword": target.getConfiguration().setSslTruststorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststoretype":
        case "sslTruststoreType": target.getConfiguration().setSslTruststoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "topicispattern":
        case "topicIsPattern": target.getConfiguration().setTopicIsPattern(property(camelContext, boolean.class, value)); return true;
        case "valuedeserializer":
        case "valueDeserializer": target.getConfiguration().setValueDeserializer(property(camelContext, java.lang.String.class, value)); return true;
        case "valueserializer":
        case "valueSerializer": target.getConfiguration().setValueSerializer(property(camelContext, java.lang.String.class, value)); return true;
        case "workerpool":
        case "workerPool": target.getConfiguration().setWorkerPool(property(camelContext, java.util.concurrent.ExecutorService.class, value)); return true;
        case "workerpoolcoresize":
        case "workerPoolCoreSize": target.getConfiguration().setWorkerPoolCoreSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "workerpoolmaxsize":
        case "workerPoolMaxSize": target.getConfiguration().setWorkerPoolMaxSize(property(camelContext, java.lang.Integer.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.util.Map.class;
        case "allowmanualcommit":
        case "allowManualCommit": return boolean.class;
        case "autocommitenable":
        case "autoCommitEnable": return java.lang.Boolean.class;
        case "autocommitintervalms":
        case "autoCommitIntervalMs": return java.lang.Integer.class;
        case "autocommitonstop":
        case "autoCommitOnStop": return java.lang.String.class;
        case "autooffsetreset":
        case "autoOffsetReset": return java.lang.String.class;
        case "breakonfirsterror":
        case "breakOnFirstError": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "brokers": return java.lang.String.class;
        case "buffermemorysize":
        case "bufferMemorySize": return java.lang.Integer.class;
        case "checkcrcs":
        case "checkCrcs": return java.lang.Boolean.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "compressioncodec":
        case "compressionCodec": return java.lang.String.class;
        case "connectionmaxidlems":
        case "connectionMaxIdleMs": return java.lang.Integer.class;
        case "consumerrequesttimeoutms":
        case "consumerRequestTimeoutMs": return java.lang.Integer.class;
        case "consumerstreams":
        case "consumerStreams": return int.class;
        case "consumerscount":
        case "consumersCount": return int.class;
        case "enableidempotence":
        case "enableIdempotence": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "fetchmaxbytes":
        case "fetchMaxBytes": return java.lang.Integer.class;
        case "fetchminbytes":
        case "fetchMinBytes": return java.lang.Integer.class;
        case "fetchwaitmaxms":
        case "fetchWaitMaxMs": return java.lang.Integer.class;
        case "groupid":
        case "groupId": return java.lang.String.class;
        case "headerdeserializer":
        case "headerDeserializer": return org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "headerserializer":
        case "headerSerializer": return org.apache.camel.component.kafka.serde.KafkaHeaderSerializer.class;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return java.lang.Integer.class;
        case "interceptorclasses":
        case "interceptorClasses": return java.lang.String.class;
        case "kerberosbeforereloginmintime":
        case "kerberosBeforeReloginMinTime": return java.lang.Integer.class;
        case "kerberosinitcmd":
        case "kerberosInitCmd": return java.lang.String.class;
        case "kerberosprincipaltolocalrules":
        case "kerberosPrincipalToLocalRules": return java.lang.String.class;
        case "kerberosrenewjitter":
        case "kerberosRenewJitter": return java.lang.Double.class;
        case "kerberosrenewwindowfactor":
        case "kerberosRenewWindowFactor": return java.lang.Double.class;
        case "key": return java.lang.String.class;
        case "keydeserializer":
        case "keyDeserializer": return java.lang.String.class;
        case "keyserializer":
        case "keySerializer": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "lingerms":
        case "lingerMs": return java.lang.Integer.class;
        case "maxblockms":
        case "maxBlockMs": return java.lang.Integer.class;
        case "maxinflightrequest":
        case "maxInFlightRequest": return java.lang.Integer.class;
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": return java.lang.Integer.class;
        case "maxpollintervalms":
        case "maxPollIntervalMs": return java.lang.Long.class;
        case "maxpollrecords":
        case "maxPollRecords": return java.lang.Integer.class;
        case "maxrequestsize":
        case "maxRequestSize": return java.lang.Integer.class;
        case "metadatamaxagems":
        case "metadataMaxAgeMs": return java.lang.Integer.class;
        case "metricreporters":
        case "metricReporters": return java.lang.String.class;
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": return java.lang.Integer.class;
        case "noofmetricssample":
        case "noOfMetricsSample": return java.lang.Integer.class;
        case "offsetrepository":
        case "offsetRepository": return org.apache.camel.spi.StateRepository.class;
        case "partitionassignor":
        case "partitionAssignor": return java.lang.String.class;
        case "partitionkey":
        case "partitionKey": return java.lang.Integer.class;
        case "partitioner": return java.lang.String.class;
        case "polltimeoutms":
        case "pollTimeoutMs": return java.lang.Long.class;
        case "producerbatchsize":
        case "producerBatchSize": return java.lang.Integer.class;
        case "queuebufferingmaxmessages":
        case "queueBufferingMaxMessages": return java.lang.Integer.class;
        case "receivebufferbytes":
        case "receiveBufferBytes": return java.lang.Integer.class;
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": return java.lang.Integer.class;
        case "reconnectbackoffms":
        case "reconnectBackoffMs": return java.lang.Integer.class;
        case "recordmetadata":
        case "recordMetadata": return boolean.class;
        case "requestrequiredacks":
        case "requestRequiredAcks": return java.lang.String.class;
        case "requesttimeoutms":
        case "requestTimeoutMs": return java.lang.Integer.class;
        case "retries": return java.lang.Integer.class;
        case "retrybackoffms":
        case "retryBackoffMs": return java.lang.Integer.class;
        case "sasljaasconfig":
        case "saslJaasConfig": return java.lang.String.class;
        case "saslkerberosservicename":
        case "saslKerberosServiceName": return java.lang.String.class;
        case "saslmechanism":
        case "saslMechanism": return java.lang.String.class;
        case "schemaregistryurl":
        case "schemaRegistryURL": return java.lang.String.class;
        case "securityprotocol":
        case "securityProtocol": return java.lang.String.class;
        case "seekto":
        case "seekTo": return java.lang.String.class;
        case "sendbufferbytes":
        case "sendBufferBytes": return java.lang.Integer.class;
        case "sessiontimeoutms":
        case "sessionTimeoutMs": return java.lang.Integer.class;
        case "shutdowntimeout":
        case "shutdownTimeout": return int.class;
        case "specificavroreader":
        case "specificAvroReader": return boolean.class;
        case "sslciphersuites":
        case "sslCipherSuites": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "sslenabledprotocols":
        case "sslEnabledProtocols": return java.lang.String.class;
        case "sslendpointalgorithm":
        case "sslEndpointAlgorithm": return java.lang.String.class;
        case "sslkeypassword":
        case "sslKeyPassword": return java.lang.String.class;
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": return java.lang.String.class;
        case "sslkeystorelocation":
        case "sslKeystoreLocation": return java.lang.String.class;
        case "sslkeystorepassword":
        case "sslKeystorePassword": return java.lang.String.class;
        case "sslkeystoretype":
        case "sslKeystoreType": return java.lang.String.class;
        case "sslprotocol":
        case "sslProtocol": return java.lang.String.class;
        case "sslprovider":
        case "sslProvider": return java.lang.String.class;
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": return java.lang.String.class;
        case "ssltruststorelocation":
        case "sslTruststoreLocation": return java.lang.String.class;
        case "ssltruststorepassword":
        case "sslTruststorePassword": return java.lang.String.class;
        case "ssltruststoretype":
        case "sslTruststoreType": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "topicispattern":
        case "topicIsPattern": return boolean.class;
        case "valuedeserializer":
        case "valueDeserializer": return java.lang.String.class;
        case "valueserializer":
        case "valueSerializer": return java.lang.String.class;
        case "workerpool":
        case "workerPool": return java.util.concurrent.ExecutorService.class;
        case "workerpoolcoresize":
        case "workerPoolCoreSize": return java.lang.Integer.class;
        case "workerpoolmaxsize":
        case "workerPoolMaxSize": return java.lang.Integer.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        KafkaEndpoint target = (KafkaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return target.getConfiguration().getAdditionalProperties();
        case "allowmanualcommit":
        case "allowManualCommit": return target.getConfiguration().isAllowManualCommit();
        case "autocommitenable":
        case "autoCommitEnable": return target.getConfiguration().getAutoCommitEnable();
        case "autocommitintervalms":
        case "autoCommitIntervalMs": return target.getConfiguration().getAutoCommitIntervalMs();
        case "autocommitonstop":
        case "autoCommitOnStop": return target.getConfiguration().getAutoCommitOnStop();
        case "autooffsetreset":
        case "autoOffsetReset": return target.getConfiguration().getAutoOffsetReset();
        case "breakonfirsterror":
        case "breakOnFirstError": return target.getConfiguration().isBreakOnFirstError();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "brokers": return target.getConfiguration().getBrokers();
        case "buffermemorysize":
        case "bufferMemorySize": return target.getConfiguration().getBufferMemorySize();
        case "checkcrcs":
        case "checkCrcs": return target.getConfiguration().getCheckCrcs();
        case "clientid":
        case "clientId": return target.getConfiguration().getClientId();
        case "compressioncodec":
        case "compressionCodec": return target.getConfiguration().getCompressionCodec();
        case "connectionmaxidlems":
        case "connectionMaxIdleMs": return target.getConfiguration().getConnectionMaxIdleMs();
        case "consumerrequesttimeoutms":
        case "consumerRequestTimeoutMs": return target.getConfiguration().getConsumerRequestTimeoutMs();
        case "consumerstreams":
        case "consumerStreams": return target.getConfiguration().getConsumerStreams();
        case "consumerscount":
        case "consumersCount": return target.getConfiguration().getConsumersCount();
        case "enableidempotence":
        case "enableIdempotence": return target.getConfiguration().isEnableIdempotence();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "fetchmaxbytes":
        case "fetchMaxBytes": return target.getConfiguration().getFetchMaxBytes();
        case "fetchminbytes":
        case "fetchMinBytes": return target.getConfiguration().getFetchMinBytes();
        case "fetchwaitmaxms":
        case "fetchWaitMaxMs": return target.getConfiguration().getFetchWaitMaxMs();
        case "groupid":
        case "groupId": return target.getConfiguration().getGroupId();
        case "headerdeserializer":
        case "headerDeserializer": return target.getConfiguration().getHeaderDeserializer();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getConfiguration().getHeaderFilterStrategy();
        case "headerserializer":
        case "headerSerializer": return target.getConfiguration().getHeaderSerializer();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return target.getConfiguration().getHeartbeatIntervalMs();
        case "interceptorclasses":
        case "interceptorClasses": return target.getConfiguration().getInterceptorClasses();
        case "kerberosbeforereloginmintime":
        case "kerberosBeforeReloginMinTime": return target.getConfiguration().getKerberosBeforeReloginMinTime();
        case "kerberosinitcmd":
        case "kerberosInitCmd": return target.getConfiguration().getKerberosInitCmd();
        case "kerberosprincipaltolocalrules":
        case "kerberosPrincipalToLocalRules": return target.getConfiguration().getKerberosPrincipalToLocalRules();
        case "kerberosrenewjitter":
        case "kerberosRenewJitter": return target.getConfiguration().getKerberosRenewJitter();
        case "kerberosrenewwindowfactor":
        case "kerberosRenewWindowFactor": return target.getConfiguration().getKerberosRenewWindowFactor();
        case "key": return target.getConfiguration().getKey();
        case "keydeserializer":
        case "keyDeserializer": return target.getConfiguration().getKeyDeserializer();
        case "keyserializer":
        case "keySerializer": return target.getConfiguration().getKeySerializer();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "lingerms":
        case "lingerMs": return target.getConfiguration().getLingerMs();
        case "maxblockms":
        case "maxBlockMs": return target.getConfiguration().getMaxBlockMs();
        case "maxinflightrequest":
        case "maxInFlightRequest": return target.getConfiguration().getMaxInFlightRequest();
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": return target.getConfiguration().getMaxPartitionFetchBytes();
        case "maxpollintervalms":
        case "maxPollIntervalMs": return target.getConfiguration().getMaxPollIntervalMs();
        case "maxpollrecords":
        case "maxPollRecords": return target.getConfiguration().getMaxPollRecords();
        case "maxrequestsize":
        case "maxRequestSize": return target.getConfiguration().getMaxRequestSize();
        case "metadatamaxagems":
        case "metadataMaxAgeMs": return target.getConfiguration().getMetadataMaxAgeMs();
        case "metricreporters":
        case "metricReporters": return target.getConfiguration().getMetricReporters();
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": return target.getConfiguration().getMetricsSampleWindowMs();
        case "noofmetricssample":
        case "noOfMetricsSample": return target.getConfiguration().getNoOfMetricsSample();
        case "offsetrepository":
        case "offsetRepository": return target.getConfiguration().getOffsetRepository();
        case "partitionassignor":
        case "partitionAssignor": return target.getConfiguration().getPartitionAssignor();
        case "partitionkey":
        case "partitionKey": return target.getConfiguration().getPartitionKey();
        case "partitioner": return target.getConfiguration().getPartitioner();
        case "polltimeoutms":
        case "pollTimeoutMs": return target.getConfiguration().getPollTimeoutMs();
        case "producerbatchsize":
        case "producerBatchSize": return target.getConfiguration().getProducerBatchSize();
        case "queuebufferingmaxmessages":
        case "queueBufferingMaxMessages": return target.getConfiguration().getQueueBufferingMaxMessages();
        case "receivebufferbytes":
        case "receiveBufferBytes": return target.getConfiguration().getReceiveBufferBytes();
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": return target.getConfiguration().getReconnectBackoffMaxMs();
        case "reconnectbackoffms":
        case "reconnectBackoffMs": return target.getConfiguration().getReconnectBackoffMs();
        case "recordmetadata":
        case "recordMetadata": return target.getConfiguration().isRecordMetadata();
        case "requestrequiredacks":
        case "requestRequiredAcks": return target.getConfiguration().getRequestRequiredAcks();
        case "requesttimeoutms":
        case "requestTimeoutMs": return target.getConfiguration().getRequestTimeoutMs();
        case "retries": return target.getConfiguration().getRetries();
        case "retrybackoffms":
        case "retryBackoffMs": return target.getConfiguration().getRetryBackoffMs();
        case "sasljaasconfig":
        case "saslJaasConfig": return target.getConfiguration().getSaslJaasConfig();
        case "saslkerberosservicename":
        case "saslKerberosServiceName": return target.getConfiguration().getSaslKerberosServiceName();
        case "saslmechanism":
        case "saslMechanism": return target.getConfiguration().getSaslMechanism();
        case "schemaregistryurl":
        case "schemaRegistryURL": return target.getConfiguration().getSchemaRegistryURL();
        case "securityprotocol":
        case "securityProtocol": return target.getConfiguration().getSecurityProtocol();
        case "seekto":
        case "seekTo": return target.getConfiguration().getSeekTo();
        case "sendbufferbytes":
        case "sendBufferBytes": return target.getConfiguration().getSendBufferBytes();
        case "sessiontimeoutms":
        case "sessionTimeoutMs": return target.getConfiguration().getSessionTimeoutMs();
        case "shutdowntimeout":
        case "shutdownTimeout": return target.getConfiguration().getShutdownTimeout();
        case "specificavroreader":
        case "specificAvroReader": return target.getConfiguration().isSpecificAvroReader();
        case "sslciphersuites":
        case "sslCipherSuites": return target.getConfiguration().getSslCipherSuites();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "sslenabledprotocols":
        case "sslEnabledProtocols": return target.getConfiguration().getSslEnabledProtocols();
        case "sslendpointalgorithm":
        case "sslEndpointAlgorithm": return target.getConfiguration().getSslEndpointAlgorithm();
        case "sslkeypassword":
        case "sslKeyPassword": return target.getConfiguration().getSslKeyPassword();
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": return target.getConfiguration().getSslKeymanagerAlgorithm();
        case "sslkeystorelocation":
        case "sslKeystoreLocation": return target.getConfiguration().getSslKeystoreLocation();
        case "sslkeystorepassword":
        case "sslKeystorePassword": return target.getConfiguration().getSslKeystorePassword();
        case "sslkeystoretype":
        case "sslKeystoreType": return target.getConfiguration().getSslKeystoreType();
        case "sslprotocol":
        case "sslProtocol": return target.getConfiguration().getSslProtocol();
        case "sslprovider":
        case "sslProvider": return target.getConfiguration().getSslProvider();
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": return target.getConfiguration().getSslTrustmanagerAlgorithm();
        case "ssltruststorelocation":
        case "sslTruststoreLocation": return target.getConfiguration().getSslTruststoreLocation();
        case "ssltruststorepassword":
        case "sslTruststorePassword": return target.getConfiguration().getSslTruststorePassword();
        case "ssltruststoretype":
        case "sslTruststoreType": return target.getConfiguration().getSslTruststoreType();
        case "synchronous": return target.isSynchronous();
        case "topicispattern":
        case "topicIsPattern": return target.getConfiguration().isTopicIsPattern();
        case "valuedeserializer":
        case "valueDeserializer": return target.getConfiguration().getValueDeserializer();
        case "valueserializer":
        case "valueSerializer": return target.getConfiguration().getValueSerializer();
        case "workerpool":
        case "workerPool": return target.getConfiguration().getWorkerPool();
        case "workerpoolcoresize":
        case "workerPoolCoreSize": return target.getConfiguration().getWorkerPoolCoreSize();
        case "workerpoolmaxsize":
        case "workerPoolMaxSize": return target.getConfiguration().getWorkerPoolMaxSize();
        default: return null;
        }
    }
}

