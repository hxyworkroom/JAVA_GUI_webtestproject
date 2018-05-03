package cn.hy.initiating;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class HttpClient_Single_Get_Html {
	public String httpClient_Single_Get_Html(String url) throws Exception{
		HttpGet httpGet = new HttpGet(url);//
		//创建访问对象
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();
		//socket超时 //connect超时
		CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(requestConfig).build();
		//创建httpclient对象，并添加时间限制
				
		CloseableHttpResponse response = httpClient.execute(httpGet);
		 //发起请求
		 
		String htmls=EntityUtils.toString(response.getEntity(), "utf-8");
		return htmls;
	} 
}
