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

package org.apache.camel.test.infra.kafka.services;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.utility.DockerImageName;

public class ContainerLocalSingletonKafkaService extends ContainerLocalKafkaService
        implements ExtensionContext.Store.CloseableResource {

    public ContainerLocalSingletonKafkaService(KafkaContainer container) {
        super(container);
    }

    public ContainerLocalSingletonKafkaService() {
        super();
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        extensionContext.getRoot().getStore(ExtensionContext.Namespace.GLOBAL).getOrComputeIfAbsent("kafka", s -> {
            super.initialize();
            return this;
        });
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) {
        // no op
    }

    @Override
    public void close() {
        super.shutdown();
    }

    public static ContainerLocalSingletonKafkaService kafka3Container() {
        KafkaContainer container
                = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.0.1")).withEmbeddedZookeeper();
        return new ContainerLocalSingletonKafkaService(container);
    }
}