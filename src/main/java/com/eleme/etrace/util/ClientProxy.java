package com.eleme.etrace.util;

import org.elasticsearch.action.Action;
import org.elasticsearch.action.ActionFuture;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.ActionRequest;
import org.elasticsearch.action.ActionRequestBuilder;
import org.elasticsearch.action.ActionResponse;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.count.CountRequest;
import org.elasticsearch.action.count.CountRequestBuilder;
import org.elasticsearch.action.count.CountResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteRequestBuilder;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.exists.ExistsRequest;
import org.elasticsearch.action.exists.ExistsRequestBuilder;
import org.elasticsearch.action.exists.ExistsResponse;
import org.elasticsearch.action.explain.ExplainRequest;
import org.elasticsearch.action.explain.ExplainRequestBuilder;
import org.elasticsearch.action.explain.ExplainResponse;
import org.elasticsearch.action.fieldstats.FieldStatsRequest;
import org.elasticsearch.action.fieldstats.FieldStatsRequestBuilder;
import org.elasticsearch.action.fieldstats.FieldStatsResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetRequestBuilder;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.get.MultiGetRequest;
import org.elasticsearch.action.get.MultiGetRequestBuilder;
import org.elasticsearch.action.get.MultiGetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.indexedscripts.delete.DeleteIndexedScriptRequest;
import org.elasticsearch.action.indexedscripts.delete.DeleteIndexedScriptRequestBuilder;
import org.elasticsearch.action.indexedscripts.delete.DeleteIndexedScriptResponse;
import org.elasticsearch.action.indexedscripts.get.GetIndexedScriptRequest;
import org.elasticsearch.action.indexedscripts.get.GetIndexedScriptRequestBuilder;
import org.elasticsearch.action.indexedscripts.get.GetIndexedScriptResponse;
import org.elasticsearch.action.indexedscripts.put.PutIndexedScriptRequest;
import org.elasticsearch.action.indexedscripts.put.PutIndexedScriptRequestBuilder;
import org.elasticsearch.action.indexedscripts.put.PutIndexedScriptResponse;
import org.elasticsearch.action.percolate.MultiPercolateRequest;
import org.elasticsearch.action.percolate.MultiPercolateRequestBuilder;
import org.elasticsearch.action.percolate.MultiPercolateResponse;
import org.elasticsearch.action.percolate.PercolateRequest;
import org.elasticsearch.action.percolate.PercolateRequestBuilder;
import org.elasticsearch.action.percolate.PercolateResponse;
import org.elasticsearch.action.search.ClearScrollRequest;
import org.elasticsearch.action.search.ClearScrollRequestBuilder;
import org.elasticsearch.action.search.ClearScrollResponse;
import org.elasticsearch.action.search.MultiSearchRequest;
import org.elasticsearch.action.search.MultiSearchRequestBuilder;
import org.elasticsearch.action.search.MultiSearchResponse;
import org.elasticsearch.action.search.SearchAction;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchScrollRequest;
import org.elasticsearch.action.search.SearchScrollRequestBuilder;
import org.elasticsearch.action.suggest.SuggestRequest;
import org.elasticsearch.action.suggest.SuggestRequestBuilder;
import org.elasticsearch.action.suggest.SuggestResponse;
import org.elasticsearch.action.termvectors.MultiTermVectorsRequest;
import org.elasticsearch.action.termvectors.MultiTermVectorsRequestBuilder;
import org.elasticsearch.action.termvectors.MultiTermVectorsResponse;
import org.elasticsearch.action.termvectors.TermVectorsRequest;
import org.elasticsearch.action.termvectors.TermVectorsRequestBuilder;
import org.elasticsearch.action.termvectors.TermVectorsResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateRequestBuilder;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.AdminClient;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.support.Headers;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.threadpool.ThreadPool;

import me.ele.arch.etrace.agent.Trace;
import me.ele.arch.etrace.common.modal.Transaction;
import me.ele.arch.etrace.common.modal.metric.Timer;
/**
 * 重写es的client
 * @author blueskysky
 *
 */
public class ClientProxy implements Client{
	private Client proxyClient ;
	private String appid;
	/**
	 * 改造函数
	 * @param client
	 */
	public  ClientProxy(Client client) {
		this.proxyClient = client;
	}
	/**
	 * client，appid的参数
	 * @param client
	 * @param appid
	 */
	public ClientProxy(Client client, String appid ){
		this.proxyClient = client;
		this.appid = appid;
	}

	public <Request extends ActionRequest, Response extends ActionResponse, RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder>> ActionFuture<Response> execute(
			Action<Request, Response, RequestBuilder> action, Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public <Request extends ActionRequest, Response extends ActionResponse, RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder>> void execute(
			Action<Request, Response, RequestBuilder> action, Request request, ActionListener<Response> listener) {
		// TODO Auto-generated method stub
		
	}

	public <Request extends ActionRequest, Response extends ActionResponse, RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder>> RequestBuilder prepareExecute(
			Action<Request, Response, RequestBuilder> action) {
		// TODO Auto-generated method stub
		return null;
	}

	public ThreadPool threadPool() {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public AdminClient admin() {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<IndexResponse> index(IndexRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void index(IndexRequest request, ActionListener<IndexResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public IndexRequestBuilder prepareIndex() {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<UpdateResponse> update(UpdateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(UpdateRequest request, ActionListener<UpdateResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public UpdateRequestBuilder prepareUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

	public UpdateRequestBuilder prepareUpdate(String index, String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public IndexRequestBuilder prepareIndex(String index, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	public IndexRequestBuilder prepareIndex(String index, String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<DeleteResponse> delete(DeleteRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(DeleteRequest request, ActionListener<DeleteResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public DeleteRequestBuilder prepareDelete() {
		// TODO Auto-generated method stub
		return null;
	}

	public DeleteRequestBuilder prepareDelete(String index, String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<BulkResponse> bulk(BulkRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void bulk(BulkRequest request, ActionListener<BulkResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public BulkRequestBuilder prepareBulk() {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<GetResponse> get(GetRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void get(GetRequest request, ActionListener<GetResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public GetRequestBuilder prepareGet() {
		// TODO Auto-generated method stub
		return null;
	}

	public GetRequestBuilder prepareGet(String index, String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public PutIndexedScriptRequestBuilder preparePutIndexedScript() {
		// TODO Auto-generated method stub
		return null;
	}

	public PutIndexedScriptRequestBuilder preparePutIndexedScript(String scriptLang, String id, String source) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteIndexedScript(DeleteIndexedScriptRequest request,
			ActionListener<DeleteIndexedScriptResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public ActionFuture<DeleteIndexedScriptResponse> deleteIndexedScript(DeleteIndexedScriptRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeleteIndexedScriptRequestBuilder prepareDeleteIndexedScript() {
		// TODO Auto-generated method stub
		return null;
	}

	public DeleteIndexedScriptRequestBuilder prepareDeleteIndexedScript(String scriptLang, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void putIndexedScript(PutIndexedScriptRequest request, ActionListener<PutIndexedScriptResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public ActionFuture<PutIndexedScriptResponse> putIndexedScript(PutIndexedScriptRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetIndexedScriptRequestBuilder prepareGetIndexedScript() {
		// TODO Auto-generated method stub
		return null;
	}

	public GetIndexedScriptRequestBuilder prepareGetIndexedScript(String scriptLang, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void getIndexedScript(GetIndexedScriptRequest request, ActionListener<GetIndexedScriptResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public ActionFuture<GetIndexedScriptResponse> getIndexedScript(GetIndexedScriptRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<MultiGetResponse> multiGet(MultiGetRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void multiGet(MultiGetRequest request, ActionListener<MultiGetResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public MultiGetRequestBuilder prepareMultiGet() {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<CountResponse> count(CountRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void count(CountRequest request, ActionListener<CountResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public CountRequestBuilder prepareCount(String... indices) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<ExistsResponse> exists(ExistsRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void exists(ExistsRequest request, ActionListener<ExistsResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public ExistsRequestBuilder prepareExists(String... indices) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<SuggestResponse> suggest(SuggestRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void suggest(SuggestRequest request, ActionListener<SuggestResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public SuggestRequestBuilder prepareSuggest(String... indices) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<SearchResponse> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void search(SearchRequest request, ActionListener<SearchResponse> listener) {
		// TODO Auto-generated method stub
		
	}
    /**
     * 搜索调用
     * 添加了Etrace的打点
     */
	public SearchRequestBuilder prepareSearch(String... indices) {
		SearchRequestBuilder srb = null ;
		Transaction t = Trace.newTransaction("ES", "search");
		try{
			/**
			 * timer计时器
			 */
			Timer timer = Trace.newTimer("ES_query");
		    srb = new SearchRequestBuilder(this.proxyClient, SearchAction.INSTANCE).setIndices(indices);
			timer.end();
			/**
			 * 添加标签
			 */
			t.addTag("es_clusster", "");
			t.addTag("es_user", "");
		    t.addTag("es_index", indices[0]);
			t.addTag("es_client", "");
			
			t.setStatus("success");
		}catch(Exception e){
			Trace.logError(e);
			t.setStatus(e);
		}finally {
			/**
			 * 事务提交
			 */
			t.complete();
		}
		return srb;
	}

	public ActionFuture<SearchResponse> searchScroll(SearchScrollRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void searchScroll(SearchScrollRequest request, ActionListener<SearchResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public SearchScrollRequestBuilder prepareSearchScroll(String scrollId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<MultiSearchResponse> multiSearch(MultiSearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void multiSearch(MultiSearchRequest request, ActionListener<MultiSearchResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public MultiSearchRequestBuilder prepareMultiSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<TermVectorsResponse> termVectors(TermVectorsRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void termVectors(TermVectorsRequest request, ActionListener<TermVectorsResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public TermVectorsRequestBuilder prepareTermVectors() {
		// TODO Auto-generated method stub
		return null;
	}

	public TermVectorsRequestBuilder prepareTermVectors(String index, String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<TermVectorsResponse> termVector(TermVectorsRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void termVector(TermVectorsRequest request, ActionListener<TermVectorsResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public TermVectorsRequestBuilder prepareTermVector() {
		// TODO Auto-generated method stub
		return null;
	}

	public TermVectorsRequestBuilder prepareTermVector(String index, String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<MultiTermVectorsResponse> multiTermVectors(MultiTermVectorsRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void multiTermVectors(MultiTermVectorsRequest request, ActionListener<MultiTermVectorsResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public MultiTermVectorsRequestBuilder prepareMultiTermVectors() {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<PercolateResponse> percolate(PercolateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void percolate(PercolateRequest request, ActionListener<PercolateResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public PercolateRequestBuilder preparePercolate() {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<MultiPercolateResponse> multiPercolate(MultiPercolateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void multiPercolate(MultiPercolateRequest request, ActionListener<MultiPercolateResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public MultiPercolateRequestBuilder prepareMultiPercolate() {
		// TODO Auto-generated method stub
		return null;
	}

	public ExplainRequestBuilder prepareExplain(String index, String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<ExplainResponse> explain(ExplainRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void explain(ExplainRequest request, ActionListener<ExplainResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public ClearScrollRequestBuilder prepareClearScroll() {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<ClearScrollResponse> clearScroll(ClearScrollRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void clearScroll(ClearScrollRequest request, ActionListener<ClearScrollResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public FieldStatsRequestBuilder prepareFieldStats() {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionFuture<FieldStatsResponse> fieldStats(FieldStatsRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void fieldStats(FieldStatsRequest request, ActionListener<FieldStatsResponse> listener) {
		// TODO Auto-generated method stub
		
	}

	public Settings settings() {
		// TODO Auto-generated method stub
		return null;
	}

	public Headers headers() {
		// TODO Auto-generated method stub
		return null;
	}

}
