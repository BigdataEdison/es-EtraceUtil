package com.eleme.etrace.client;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.netty.NettyTransport;

import com.eleme.etrace.util.ClientProxy;
/**
 * 通过代理调用ES集群服务器
 * @author blueskysky
 *
 */
public class ESJavaClient {
	
	public static final String CLUSTER_NAME = "alta1-comm-elasticsearch-2-3-3"; //实例名称
    private static final String IP = "10.103.108.87";//本地测试10.200.5.146:9300
    private static final int PORT = 9300;  //端口
    
  //创建私有对象  
    private static Client client;  
    
    private static ClientProxy clientproxy;
    //1.设置集群名称：默认是elasticsearch，并设置client.transport.sniff为true，使客户端嗅探整个集群状态，把集群中的其他机器IP加入到客户端中  
    /* 
    //对ES1.6有效 
    private static Settings settings = ImmutableSettings 
            .settingsBuilder() 
            .put("cluster.name",CLUSTER_NAME) 
            .put("client.transport.sniff", true) 
            .build(); 
    */  
    
    //对ES2.0有效  
    private static Settings settings = Settings  
            .settingsBuilder()  
            .put("cluster.name",CLUSTER_NAME)  
            .put("client.transport.sniff", true)
            .put(NettyTransport.PING_SCHEDULE, "100s") 
            .build();  
    
    //反射机制创建单例的TransportClient对象  ES1.6版本  
    
//    static {  
//        try {  
//            Class<?> clazz = Class.forName(TransportClient.class.getName());  
//            Constructor<?> constructor = clazz.getDeclaredConstructor(Settings.class);  
//            constructor.setAccessible(true);  
//            client = (TransportClient) constructor.newInstance(settings);  
//            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(IP), PORT));  
//        } catch (Exception e) {  
//            e.printStackTrace();  
//        }  
//    }  
  
    //ES2.0版本  
    static {   
        try {  
            client = TransportClient.builder().settings(settings).build()  
            		.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(IP), PORT));
            clientproxy = new ClientProxy(client);
            
        } catch (UnknownHostException e) {  
            e.printStackTrace();  
        }  
    }  
  
    /**
     * 取得原始的client
     * @return
     */
    public static synchronized Client getTransportClient(){  
        return client;  
    }  
    
    /**
     * 取得代理的client
     * @return
     */
    public static ClientProxy getClientProxy(){
    	    return clientproxy;
    }
    
    public static void main(String[] args) {
    		System.out.println(client);;
//    		AnalyzeResponse response = client.admin().indices()
//    				.prepareAnalyze("明天北京上海共产党火车")
//    				.setAnalyzer("ik").execute().actionGet();
//        	List<AnalyzeToken> tokens = response.getTokens();
	}
}
