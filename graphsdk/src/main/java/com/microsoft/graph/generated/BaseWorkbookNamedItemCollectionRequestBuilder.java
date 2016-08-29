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
 * The class for the Base Workbook Named Item Collection Request Builder.
 */
public class BaseWorkbookNamedItemCollectionRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookNamedItemCollectionRequestBuilder {

    /**
     * The request builder for this collection of Workbook
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookNamedItemCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookNamedItemCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookNamedItemCollectionRequest buildRequest(final List<Option> requestOptions) {
        return new WorkbookNamedItemCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookNamedItemRequestBuilder byId(final String id) {
        return new WorkbookNamedItemRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}