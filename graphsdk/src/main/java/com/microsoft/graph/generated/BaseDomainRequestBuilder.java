// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Domain Request Builder.
 */
public class BaseDomainRequestBuilder extends BaseRequestBuilder implements IBaseDomainRequestBuilder {

    /**
     * The request builder for the Domain
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDomainRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IDomainRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IDomainRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new DomainRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDomainDnsRecordCollectionRequestBuilder getServiceConfigurationRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("serviceConfigurationRecords"), getClient(), null);
    }

    public IDomainDnsRecordRequestBuilder getServiceConfigurationRecords(final String id) {
        return new DomainDnsRecordRequestBuilder(getRequestUrlWithAdditionalSegment("serviceConfigurationRecords") + "/" + id, getClient(), null);
    }
    public IDomainDnsRecordCollectionRequestBuilder getVerificationDnsRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("verificationDnsRecords"), getClient(), null);
    }

    public IDomainDnsRecordRequestBuilder getVerificationDnsRecords(final String id) {
        return new DomainDnsRecordRequestBuilder(getRequestUrlWithAdditionalSegment("verificationDnsRecords") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder getDomainNameReferences() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("domainNameReferences"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder getDomainNameReferences(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("domainNameReferences") + "/" + id, getClient(), null);
    }

    public IDomainVerifyRequestBuilder getVerify() {
        return new DomainVerifyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.verify"), getClient(), null);
    }
}
