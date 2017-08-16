package com.eleme.etrace.util;

import org.elasticsearch.action.search.SearchAction;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.ElasticsearchClient;

public class SearchRequestBuilderProxy extends SearchRequestBuilder {

	public SearchRequestBuilderProxy(ElasticsearchClient client, SearchAction action) {
		super(client, action);
		// TODO Auto-generated constructor stub
	}

}
