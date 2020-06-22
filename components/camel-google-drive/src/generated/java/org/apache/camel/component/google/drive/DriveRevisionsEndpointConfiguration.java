
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.drive.Drive$Revisions
 */
@UriParams
@Configurer
public final class DriveRevisionsEndpointConfiguration extends GoogleDriveConfiguration {

    @UriParam
    private com.google.api.services.drive.model.Revision content;

    @UriParam
    private String fileId;

    @UriParam
    private String revisionId;

    public com.google.api.services.drive.model.Revision getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.Revision content) {
        this.content = content;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }
}
