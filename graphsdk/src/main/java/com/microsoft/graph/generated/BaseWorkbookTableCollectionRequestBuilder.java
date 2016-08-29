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
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Collection Request Builder.
 */
public class BaseWorkbookTableCollectionRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookTableCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookWorksheet
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookTableCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookTableCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookTableCollectionRequest buildRequest(final List<Option> requestOptions) {
        return new WorkbookTableCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookTableRequestBuilder byId(final String id) {
        return new WorkbookTableRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IWorkbookTableAddRequestBuilder getAdd(final String address, final Boolean hasHeaders) {
        return new WorkbookTableAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, address, hasHeaders);
    }

    public IWorkbookTableItemAtRequestBuilder getItemAt(final Integer index) {
        return new WorkbookTableItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }

    public IWorkbookTableCountRequestBuilder getCount() {
        return new WorkbookTableCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }
}