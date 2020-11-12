/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.wordpress;

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
public class WordpressEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WordpressEndpoint target = (WordpressEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": target.getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "criteria": target.getConfiguration().setCriteria(property(camelContext, java.util.Map.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "force": target.getConfiguration().setForce(property(camelContext, boolean.class, value)); return true;
        case "id": target.getConfiguration().setId(property(camelContext, java.lang.Integer.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "searchcriteria":
        case "searchCriteria": target.getConfiguration().setSearchCriteria(property(camelContext, org.apache.camel.component.wordpress.api.model.SearchCriteria.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "url": target.getConfiguration().setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "user": target.getConfiguration().setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "criteria": return java.util.Map.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "force": return boolean.class;
        case "id": return java.lang.Integer.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "password": return java.lang.String.class;
        case "searchcriteria":
        case "searchCriteria": return org.apache.camel.component.wordpress.api.model.SearchCriteria.class;
        case "synchronous": return boolean.class;
        case "url": return java.lang.String.class;
        case "user": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WordpressEndpoint target = (WordpressEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": return target.getConfiguration().getApiVersion();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "criteria": return target.getConfiguration().getCriteria();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "force": return target.getConfiguration().isForce();
        case "id": return target.getConfiguration().getId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return target.getConfiguration().getPassword();
        case "searchcriteria":
        case "searchCriteria": return target.getConfiguration().getSearchCriteria();
        case "synchronous": return target.isSynchronous();
        case "url": return target.getConfiguration().getUrl();
        case "user": return target.getConfiguration().getUser();
        default: return null;
        }
    }
}

