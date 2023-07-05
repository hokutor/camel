package org.apache.camel.component.huaweicloud.eg;

import java.util.Collections;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.eg.v1.EgClient;
import com.huaweicloud.sdk.eg.v1.model.CatalogTargetInfo;
import com.huaweicloud.sdk.eg.v1.model.ChannelInfo;
import com.huaweicloud.sdk.eg.v1.model.CustomizeSourceInfo;
import com.huaweicloud.sdk.eg.v1.model.CustomizeSourceInfoEventTypes;
import com.huaweicloud.sdk.eg.v1.model.ListChannelsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListChannelsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventSourcesRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventSourcesResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.ListSubscriptionsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListSubscriptionsResponse;

public class EgMockClient extends EgClient {
    public EgMockClient(HcClient hcClient) {
        super(hcClient);
    }

    @Override
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
        ListSubscriptionsResponse response = new ListSubscriptionsResponse();
        response.setTotal(0);
        response.setSize(0);
        response.setItems(Collections.emptyList());
        response.setHttpStatusCode(200);
        return response;
    }

    @Override
    public ListChannelsResponse listChannels(ListChannelsRequest request) {
        ListChannelsResponse response = new ListChannelsResponse();
        response.setTotal(1);
        response.setSize(1);

        ChannelInfo info = new ChannelInfo();
        info.setId("32713eca-5d05-4308-9494-6614d6914afc");
        info.setName("default");
        info.setDescription("default event channel");
        info.setCreatedTime("2022-09-19T01:54:35Z");
        info.setUpdatedTime("2022-09-19T01:54:35Z");
        info.setProviderType(ChannelInfo.ProviderTypeEnum.OFFICIAL);
        response.addItemsItem(info);
        response.setHttpStatusCode(200);
        return response;
    }

    @Override
    public ListEventSourcesResponse listEventSources(ListEventSourcesRequest request) {
        ListEventSourcesResponse response = new ListEventSourcesResponse();
        response.setTotal(1);
        response.setSize(1);

        CustomizeSourceInfo info = new CustomizeSourceInfo();
        info.setId("32713eca-5d05-4308-9494-6614d6914afc");
        info.setName("default");
        info.setLabel("default_label");
        info.setDescription("default event sources");
        info.setCreatedTime("2022-09-19T01:54:35Z");
        info.setUpdatedTime("2022-09-19T01:54:35Z");
        info.setProviderType(CustomizeSourceInfo.ProviderTypeEnum.OFFICIAL);
        info.setChannelId("abc13eca-5d05-4308-9494-6614d6914afc");
        info.setChannelName("default channel name");
        info.setType("SERVICE");
        info.setStatus(CustomizeSourceInfo.StatusEnum.RUNNING);

        CustomizeSourceInfoEventTypes eventType = new CustomizeSourceInfoEventTypes();
        eventType.setName("CAE:CloudTrace:ApiCall");
        eventType.setDescription("Operation triggered by invoking the APIGateway");
        info.addEventTypesItem(eventType);

        response.addItemsItem(info);
        response.setHttpStatusCode(200);
        return response;
    }

    @Override
    public ListEventTargetResponse listEventTarget(ListEventTargetRequest request) {
        ListEventTargetResponse response = new ListEventTargetResponse();
        response.setTotal(1);
        response.setSize(1);

        CatalogTargetInfo info = new CatalogTargetInfo();
        info.setId("32713eca-5d05-4308-9494-6614d6914afc");
        info.setName("default");
        info.setLabel("default_label");
        info.setDescription("default event target");
        info.setCreatedTime("2022-09-19T01:54:35Z");
        info.setUpdatedTime("2022-09-19T01:54:35Z");
        info.setProviderType(CatalogTargetInfo.ProviderTypeEnum.OFFICIAL);

        response.addItemsItem(info);
        response.setHttpStatusCode(200);
        return response;
    }

}
