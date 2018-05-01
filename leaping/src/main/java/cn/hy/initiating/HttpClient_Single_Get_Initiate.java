package cn.hy.initiating;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
/**
 * 
 * @author 
 * 这个类是发送单个get请求的
 */
public class HttpClient_Single_Get_Initiate {
	private Map map;
	public Map httpClient_Single_Get_Initiate(String url) throws Exception{
		CloseableHttpClient httpclient = HttpClients.createDefault();//获取httpclient对象
		HttpGet httpGet = new HttpGet(url);//创建一个get请求
		CloseableHttpResponse response = httpclient.execute(httpGet);//发起请求	
//		    System.out.println(response.getStatusLine());//获取返回头信息
//			for (Header it: response.getAllHeaders()) {
//				System.out.println(it.toString());
//			}
			System.out.println("-------------------------------------------------------------------------分割线-------------------------------------------------------------------------");
			HeaderIterator head= response.headerIterator();
			map =new HashMap<String, String>(); 
			while(head.hasNext()){
				String str[]=(head.next().toString()).split(":");
				System.out.println("第一个："+str[0]+","+"第二个："+str[1]);
				map.put(str[0],str[1]);
			}
			map.put("请求状态:",response.getStatusLine().toString());
		return map;
	}
}
