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

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.spi.Metadata;
import org.apache.camel.support.DefaultComponent;
import org.apache.camel.util.ObjectHelper;

@org.apache.camel.spi.annotations.Component("hwcloud-eg")
public class EventGridComponent extends DefaultComponent {

    @Metadata
    private EventGridConfiguration configuration = new EventGridConfiguration();

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        if (remaining == null || remaining.trim().length() == 0) {
            throw new IllegalArgumentException("Operation must be specified.");
        }

        if (ObjectHelper.isEmpty(this.configuration))
            configuration = new EventGridConfiguration();
        configuration.setOperation(remaining);

        Endpoint endpoint = new EventGridEndpoint(uri, this, configuration);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
