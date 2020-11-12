/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty;

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
public class NettyComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.netty.NettyConfiguration getOrCreateConfiguration(NettyComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.netty.NettyConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        NettyComponent target = (NettyComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowdefaultcodec":
        case "allowDefaultCodec": getOrCreateConfiguration(target).setAllowDefaultCodec(property(camelContext, boolean.class, value)); return true;
        case "allowserializedheaders":
        case "allowSerializedHeaders": getOrCreateConfiguration(target).setAllowSerializedHeaders(property(camelContext, boolean.class, value)); return true;
        case "autoappenddelimiter":
        case "autoAppendDelimiter": getOrCreateConfiguration(target).setAutoAppendDelimiter(property(camelContext, boolean.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "backlog": getOrCreateConfiguration(target).setBacklog(property(camelContext, int.class, value)); return true;
        case "bosscount":
        case "bossCount": getOrCreateConfiguration(target).setBossCount(property(camelContext, int.class, value)); return true;
        case "bossgroup":
        case "bossGroup": getOrCreateConfiguration(target).setBossGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "broadcast": getOrCreateConfiguration(target).setBroadcast(property(camelContext, boolean.class, value)); return true;
        case "channelgroup":
        case "channelGroup": getOrCreateConfiguration(target).setChannelGroup(property(camelContext, io.netty.channel.group.ChannelGroup.class, value)); return true;
        case "clientinitializerfactory":
        case "clientInitializerFactory": getOrCreateConfiguration(target).setClientInitializerFactory(property(camelContext, org.apache.camel.component.netty.ClientInitializerFactory.class, value)); return true;
        case "clientmode":
        case "clientMode": getOrCreateConfiguration(target).setClientMode(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.netty.NettyConfiguration.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": getOrCreateConfiguration(target).setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "correlationmanager":
        case "correlationManager": getOrCreateConfiguration(target).setCorrelationManager(property(camelContext, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class, value)); return true;
        case "decodermaxlinelength":
        case "decoderMaxLineLength": getOrCreateConfiguration(target).setDecoderMaxLineLength(property(camelContext, int.class, value)); return true;
        case "decoders": getOrCreateConfiguration(target).setDecoders(property(camelContext, java.util.List.class, value)); return true;
        case "delimiter": getOrCreateConfiguration(target).setDelimiter(property(camelContext, org.apache.camel.component.netty.TextLineDelimiter.class, value)); return true;
        case "disconnect": getOrCreateConfiguration(target).setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "disconnectonnoreply":
        case "disconnectOnNoReply": getOrCreateConfiguration(target).setDisconnectOnNoReply(property(camelContext, boolean.class, value)); return true;
        case "enabledprotocols":
        case "enabledProtocols": getOrCreateConfiguration(target).setEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "encoders": getOrCreateConfiguration(target).setEncoders(property(camelContext, java.util.List.class, value)); return true;
        case "encoding": getOrCreateConfiguration(target).setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "executorservice":
        case "executorService": target.setExecutorService(property(camelContext, io.netty.util.concurrent.EventExecutorGroup.class, value)); return true;
        case "keepalive":
        case "keepAlive": getOrCreateConfiguration(target).setKeepAlive(property(camelContext, boolean.class, value)); return true;
        case "keystorefile":
        case "keyStoreFile": getOrCreateConfiguration(target).setKeyStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "keystoreformat":
        case "keyStoreFormat": getOrCreateConfiguration(target).setKeyStoreFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "keystoreresource":
        case "keyStoreResource": getOrCreateConfiguration(target).setKeyStoreResource(property(camelContext, java.lang.String.class, value)); return true;
        case "lazychannelcreation":
        case "lazyChannelCreation": getOrCreateConfiguration(target).setLazyChannelCreation(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maximumpoolsize":
        case "maximumPoolSize": target.setMaximumPoolSize(property(camelContext, int.class, value)); return true;
        case "nativetransport":
        case "nativeTransport": getOrCreateConfiguration(target).setNativeTransport(property(camelContext, boolean.class, value)); return true;
        case "needclientauth":
        case "needClientAuth": getOrCreateConfiguration(target).setNeedClientAuth(property(camelContext, boolean.class, value)); return true;
        case "nettyserverbootstrapfactory":
        case "nettyServerBootstrapFactory": getOrCreateConfiguration(target).setNettyServerBootstrapFactory(property(camelContext, org.apache.camel.component.netty.NettyServerBootstrapFactory.class, value)); return true;
        case "networkinterface":
        case "networkInterface": getOrCreateConfiguration(target).setNetworkInterface(property(camelContext, java.lang.String.class, value)); return true;
        case "noreplyloglevel":
        case "noReplyLogLevel": getOrCreateConfiguration(target).setNoReplyLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "options": getOrCreateConfiguration(target).setOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "passphrase": getOrCreateConfiguration(target).setPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "producerpoolenabled":
        case "producerPoolEnabled": getOrCreateConfiguration(target).setProducerPoolEnabled(property(camelContext, boolean.class, value)); return true;
        case "producerpoolmaxactive":
        case "producerPoolMaxActive": getOrCreateConfiguration(target).setProducerPoolMaxActive(property(camelContext, int.class, value)); return true;
        case "producerpoolmaxidle":
        case "producerPoolMaxIdle": getOrCreateConfiguration(target).setProducerPoolMaxIdle(property(camelContext, int.class, value)); return true;
        case "producerpoolminevictableidle":
        case "producerPoolMinEvictableIdle": getOrCreateConfiguration(target).setProducerPoolMinEvictableIdle(property(camelContext, long.class, value)); return true;
        case "producerpoolminidle":
        case "producerPoolMinIdle": getOrCreateConfiguration(target).setProducerPoolMinIdle(property(camelContext, int.class, value)); return true;
        case "receivebuffersize":
        case "receiveBufferSize": getOrCreateConfiguration(target).setReceiveBufferSize(property(camelContext, int.class, value)); return true;
        case "receivebuffersizepredictor":
        case "receiveBufferSizePredictor": getOrCreateConfiguration(target).setReceiveBufferSizePredictor(property(camelContext, int.class, value)); return true;
        case "reconnect": getOrCreateConfiguration(target).setReconnect(property(camelContext, boolean.class, value)); return true;
        case "reconnectinterval":
        case "reconnectInterval": getOrCreateConfiguration(target).setReconnectInterval(property(camelContext, int.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": getOrCreateConfiguration(target).setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "reuseaddress":
        case "reuseAddress": getOrCreateConfiguration(target).setReuseAddress(property(camelContext, boolean.class, value)); return true;
        case "reusechannel":
        case "reuseChannel": getOrCreateConfiguration(target).setReuseChannel(property(camelContext, boolean.class, value)); return true;
        case "securityprovider":
        case "securityProvider": getOrCreateConfiguration(target).setSecurityProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "sendbuffersize":
        case "sendBufferSize": getOrCreateConfiguration(target).setSendBufferSize(property(camelContext, int.class, value)); return true;
        case "serverclosedchannelexceptioncaughtloglevel":
        case "serverClosedChannelExceptionCaughtLogLevel": getOrCreateConfiguration(target).setServerClosedChannelExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverexceptioncaughtloglevel":
        case "serverExceptionCaughtLogLevel": getOrCreateConfiguration(target).setServerExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverinitializerfactory":
        case "serverInitializerFactory": getOrCreateConfiguration(target).setServerInitializerFactory(property(camelContext, org.apache.camel.component.netty.ServerInitializerFactory.class, value)); return true;
        case "ssl": getOrCreateConfiguration(target).setSsl(property(camelContext, boolean.class, value)); return true;
        case "sslclientcertheaders":
        case "sslClientCertHeaders": getOrCreateConfiguration(target).setSslClientCertHeaders(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslhandler":
        case "sslHandler": getOrCreateConfiguration(target).setSslHandler(property(camelContext, io.netty.handler.ssl.SslHandler.class, value)); return true;
        case "sync": getOrCreateConfiguration(target).setSync(property(camelContext, boolean.class, value)); return true;
        case "tcpnodelay":
        case "tcpNoDelay": getOrCreateConfiguration(target).setTcpNoDelay(property(camelContext, boolean.class, value)); return true;
        case "textline": getOrCreateConfiguration(target).setTextline(property(camelContext, boolean.class, value)); return true;
        case "transferexchange":
        case "transferExchange": getOrCreateConfiguration(target).setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "truststorefile":
        case "trustStoreFile": getOrCreateConfiguration(target).setTrustStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "truststoreresource":
        case "trustStoreResource": getOrCreateConfiguration(target).setTrustStoreResource(property(camelContext, java.lang.String.class, value)); return true;
        case "udpbytearraycodec":
        case "udpByteArrayCodec": getOrCreateConfiguration(target).setUdpByteArrayCodec(property(camelContext, boolean.class, value)); return true;
        case "udpconnectionlesssending":
        case "udpConnectionlessSending": getOrCreateConfiguration(target).setUdpConnectionlessSending(property(camelContext, boolean.class, value)); return true;
        case "usebytebuf":
        case "useByteBuf": getOrCreateConfiguration(target).setUseByteBuf(property(camelContext, boolean.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "usingexecutorservice":
        case "usingExecutorService": getOrCreateConfiguration(target).setUsingExecutorService(property(camelContext, boolean.class, value)); return true;
        case "workercount":
        case "workerCount": getOrCreateConfiguration(target).setWorkerCount(property(camelContext, int.class, value)); return true;
        case "workergroup":
        case "workerGroup": getOrCreateConfiguration(target).setWorkerGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowdefaultcodec":
        case "allowDefaultCodec": return boolean.class;
        case "allowserializedheaders":
        case "allowSerializedHeaders": return boolean.class;
        case "autoappenddelimiter":
        case "autoAppendDelimiter": return boolean.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "backlog": return int.class;
        case "bosscount":
        case "bossCount": return int.class;
        case "bossgroup":
        case "bossGroup": return io.netty.channel.EventLoopGroup.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "broadcast": return boolean.class;
        case "channelgroup":
        case "channelGroup": return io.netty.channel.group.ChannelGroup.class;
        case "clientinitializerfactory":
        case "clientInitializerFactory": return org.apache.camel.component.netty.ClientInitializerFactory.class;
        case "clientmode":
        case "clientMode": return boolean.class;
        case "configuration": return org.apache.camel.component.netty.NettyConfiguration.class;
        case "connecttimeout":
        case "connectTimeout": return int.class;
        case "correlationmanager":
        case "correlationManager": return org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class;
        case "decodermaxlinelength":
        case "decoderMaxLineLength": return int.class;
        case "decoders": return java.util.List.class;
        case "delimiter": return org.apache.camel.component.netty.TextLineDelimiter.class;
        case "disconnect": return boolean.class;
        case "disconnectonnoreply":
        case "disconnectOnNoReply": return boolean.class;
        case "enabledprotocols":
        case "enabledProtocols": return java.lang.String.class;
        case "encoders": return java.util.List.class;
        case "encoding": return java.lang.String.class;
        case "executorservice":
        case "executorService": return io.netty.util.concurrent.EventExecutorGroup.class;
        case "keepalive":
        case "keepAlive": return boolean.class;
        case "keystorefile":
        case "keyStoreFile": return java.io.File.class;
        case "keystoreformat":
        case "keyStoreFormat": return java.lang.String.class;
        case "keystoreresource":
        case "keyStoreResource": return java.lang.String.class;
        case "lazychannelcreation":
        case "lazyChannelCreation": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maximumpoolsize":
        case "maximumPoolSize": return int.class;
        case "nativetransport":
        case "nativeTransport": return boolean.class;
        case "needclientauth":
        case "needClientAuth": return boolean.class;
        case "nettyserverbootstrapfactory":
        case "nettyServerBootstrapFactory": return org.apache.camel.component.netty.NettyServerBootstrapFactory.class;
        case "networkinterface":
        case "networkInterface": return java.lang.String.class;
        case "noreplyloglevel":
        case "noReplyLogLevel": return org.apache.camel.LoggingLevel.class;
        case "options": return java.util.Map.class;
        case "passphrase": return java.lang.String.class;
        case "producerpoolenabled":
        case "producerPoolEnabled": return boolean.class;
        case "producerpoolmaxactive":
        case "producerPoolMaxActive": return int.class;
        case "producerpoolmaxidle":
        case "producerPoolMaxIdle": return int.class;
        case "producerpoolminevictableidle":
        case "producerPoolMinEvictableIdle": return long.class;
        case "producerpoolminidle":
        case "producerPoolMinIdle": return int.class;
        case "receivebuffersize":
        case "receiveBufferSize": return int.class;
        case "receivebuffersizepredictor":
        case "receiveBufferSizePredictor": return int.class;
        case "reconnect": return boolean.class;
        case "reconnectinterval":
        case "reconnectInterval": return int.class;
        case "requesttimeout":
        case "requestTimeout": return long.class;
        case "reuseaddress":
        case "reuseAddress": return boolean.class;
        case "reusechannel":
        case "reuseChannel": return boolean.class;
        case "securityprovider":
        case "securityProvider": return java.lang.String.class;
        case "sendbuffersize":
        case "sendBufferSize": return int.class;
        case "serverclosedchannelexceptioncaughtloglevel":
        case "serverClosedChannelExceptionCaughtLogLevel": return org.apache.camel.LoggingLevel.class;
        case "serverexceptioncaughtloglevel":
        case "serverExceptionCaughtLogLevel": return org.apache.camel.LoggingLevel.class;
        case "serverinitializerfactory":
        case "serverInitializerFactory": return org.apache.camel.component.netty.ServerInitializerFactory.class;
        case "ssl": return boolean.class;
        case "sslclientcertheaders":
        case "sslClientCertHeaders": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "sslhandler":
        case "sslHandler": return io.netty.handler.ssl.SslHandler.class;
        case "sync": return boolean.class;
        case "tcpnodelay":
        case "tcpNoDelay": return boolean.class;
        case "textline": return boolean.class;
        case "transferexchange":
        case "transferExchange": return boolean.class;
        case "truststorefile":
        case "trustStoreFile": return java.io.File.class;
        case "truststoreresource":
        case "trustStoreResource": return java.lang.String.class;
        case "udpbytearraycodec":
        case "udpByteArrayCodec": return boolean.class;
        case "udpconnectionlesssending":
        case "udpConnectionlessSending": return boolean.class;
        case "usebytebuf":
        case "useByteBuf": return boolean.class;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return boolean.class;
        case "usingexecutorservice":
        case "usingExecutorService": return boolean.class;
        case "workercount":
        case "workerCount": return int.class;
        case "workergroup":
        case "workerGroup": return io.netty.channel.EventLoopGroup.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        NettyComponent target = (NettyComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowdefaultcodec":
        case "allowDefaultCodec": return getOrCreateConfiguration(target).isAllowDefaultCodec();
        case "allowserializedheaders":
        case "allowSerializedHeaders": return getOrCreateConfiguration(target).isAllowSerializedHeaders();
        case "autoappenddelimiter":
        case "autoAppendDelimiter": return getOrCreateConfiguration(target).isAutoAppendDelimiter();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "backlog": return getOrCreateConfiguration(target).getBacklog();
        case "bosscount":
        case "bossCount": return getOrCreateConfiguration(target).getBossCount();
        case "bossgroup":
        case "bossGroup": return getOrCreateConfiguration(target).getBossGroup();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "broadcast": return getOrCreateConfiguration(target).isBroadcast();
        case "channelgroup":
        case "channelGroup": return getOrCreateConfiguration(target).getChannelGroup();
        case "clientinitializerfactory":
        case "clientInitializerFactory": return getOrCreateConfiguration(target).getClientInitializerFactory();
        case "clientmode":
        case "clientMode": return getOrCreateConfiguration(target).isClientMode();
        case "configuration": return target.getConfiguration();
        case "connecttimeout":
        case "connectTimeout": return getOrCreateConfiguration(target).getConnectTimeout();
        case "correlationmanager":
        case "correlationManager": return getOrCreateConfiguration(target).getCorrelationManager();
        case "decodermaxlinelength":
        case "decoderMaxLineLength": return getOrCreateConfiguration(target).getDecoderMaxLineLength();
        case "decoders": return getOrCreateConfiguration(target).getDecoders();
        case "delimiter": return getOrCreateConfiguration(target).getDelimiter();
        case "disconnect": return getOrCreateConfiguration(target).isDisconnect();
        case "disconnectonnoreply":
        case "disconnectOnNoReply": return getOrCreateConfiguration(target).isDisconnectOnNoReply();
        case "enabledprotocols":
        case "enabledProtocols": return getOrCreateConfiguration(target).getEnabledProtocols();
        case "encoders": return getOrCreateConfiguration(target).getEncoders();
        case "encoding": return getOrCreateConfiguration(target).getEncoding();
        case "executorservice":
        case "executorService": return target.getExecutorService();
        case "keepalive":
        case "keepAlive": return getOrCreateConfiguration(target).isKeepAlive();
        case "keystorefile":
        case "keyStoreFile": return getOrCreateConfiguration(target).getKeyStoreFile();
        case "keystoreformat":
        case "keyStoreFormat": return getOrCreateConfiguration(target).getKeyStoreFormat();
        case "keystoreresource":
        case "keyStoreResource": return getOrCreateConfiguration(target).getKeyStoreResource();
        case "lazychannelcreation":
        case "lazyChannelCreation": return getOrCreateConfiguration(target).isLazyChannelCreation();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maximumpoolsize":
        case "maximumPoolSize": return target.getMaximumPoolSize();
        case "nativetransport":
        case "nativeTransport": return getOrCreateConfiguration(target).isNativeTransport();
        case "needclientauth":
        case "needClientAuth": return getOrCreateConfiguration(target).isNeedClientAuth();
        case "nettyserverbootstrapfactory":
        case "nettyServerBootstrapFactory": return getOrCreateConfiguration(target).getNettyServerBootstrapFactory();
        case "networkinterface":
        case "networkInterface": return getOrCreateConfiguration(target).getNetworkInterface();
        case "noreplyloglevel":
        case "noReplyLogLevel": return getOrCreateConfiguration(target).getNoReplyLogLevel();
        case "options": return getOrCreateConfiguration(target).getOptions();
        case "passphrase": return getOrCreateConfiguration(target).getPassphrase();
        case "producerpoolenabled":
        case "producerPoolEnabled": return getOrCreateConfiguration(target).isProducerPoolEnabled();
        case "producerpoolmaxactive":
        case "producerPoolMaxActive": return getOrCreateConfiguration(target).getProducerPoolMaxActive();
        case "producerpoolmaxidle":
        case "producerPoolMaxIdle": return getOrCreateConfiguration(target).getProducerPoolMaxIdle();
        case "producerpoolminevictableidle":
        case "producerPoolMinEvictableIdle": return getOrCreateConfiguration(target).getProducerPoolMinEvictableIdle();
        case "producerpoolminidle":
        case "producerPoolMinIdle": return getOrCreateConfiguration(target).getProducerPoolMinIdle();
        case "receivebuffersize":
        case "receiveBufferSize": return getOrCreateConfiguration(target).getReceiveBufferSize();
        case "receivebuffersizepredictor":
        case "receiveBufferSizePredictor": return getOrCreateConfiguration(target).getReceiveBufferSizePredictor();
        case "reconnect": return getOrCreateConfiguration(target).isReconnect();
        case "reconnectinterval":
        case "reconnectInterval": return getOrCreateConfiguration(target).getReconnectInterval();
        case "requesttimeout":
        case "requestTimeout": return getOrCreateConfiguration(target).getRequestTimeout();
        case "reuseaddress":
        case "reuseAddress": return getOrCreateConfiguration(target).isReuseAddress();
        case "reusechannel":
        case "reuseChannel": return getOrCreateConfiguration(target).isReuseChannel();
        case "securityprovider":
        case "securityProvider": return getOrCreateConfiguration(target).getSecurityProvider();
        case "sendbuffersize":
        case "sendBufferSize": return getOrCreateConfiguration(target).getSendBufferSize();
        case "serverclosedchannelexceptioncaughtloglevel":
        case "serverClosedChannelExceptionCaughtLogLevel": return getOrCreateConfiguration(target).getServerClosedChannelExceptionCaughtLogLevel();
        case "serverexceptioncaughtloglevel":
        case "serverExceptionCaughtLogLevel": return getOrCreateConfiguration(target).getServerExceptionCaughtLogLevel();
        case "serverinitializerfactory":
        case "serverInitializerFactory": return getOrCreateConfiguration(target).getServerInitializerFactory();
        case "ssl": return getOrCreateConfiguration(target).isSsl();
        case "sslclientcertheaders":
        case "sslClientCertHeaders": return getOrCreateConfiguration(target).isSslClientCertHeaders();
        case "sslcontextparameters":
        case "sslContextParameters": return getOrCreateConfiguration(target).getSslContextParameters();
        case "sslhandler":
        case "sslHandler": return getOrCreateConfiguration(target).getSslHandler();
        case "sync": return getOrCreateConfiguration(target).isSync();
        case "tcpnodelay":
        case "tcpNoDelay": return getOrCreateConfiguration(target).isTcpNoDelay();
        case "textline": return getOrCreateConfiguration(target).isTextline();
        case "transferexchange":
        case "transferExchange": return getOrCreateConfiguration(target).isTransferExchange();
        case "truststorefile":
        case "trustStoreFile": return getOrCreateConfiguration(target).getTrustStoreFile();
        case "truststoreresource":
        case "trustStoreResource": return getOrCreateConfiguration(target).getTrustStoreResource();
        case "udpbytearraycodec":
        case "udpByteArrayCodec": return getOrCreateConfiguration(target).isUdpByteArrayCodec();
        case "udpconnectionlesssending":
        case "udpConnectionlessSending": return getOrCreateConfiguration(target).isUdpConnectionlessSending();
        case "usebytebuf":
        case "useByteBuf": return getOrCreateConfiguration(target).isUseByteBuf();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "usingexecutorservice":
        case "usingExecutorService": return getOrCreateConfiguration(target).isUsingExecutorService();
        case "workercount":
        case "workerCount": return getOrCreateConfiguration(target).getWorkerCount();
        case "workergroup":
        case "workerGroup": return getOrCreateConfiguration(target).getWorkerGroup();
        default: return null;
        }
    }
}

