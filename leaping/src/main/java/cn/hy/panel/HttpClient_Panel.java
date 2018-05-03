package cn.hy.panel;

import java.awt.Color;




import javax.swing.JPanel;

import cn.hy.httpclient_compoments.HttpClient_Single_Get_Send_Console_Panel;
import cn.hy.httpclient_compoments.HttpClient_Single_Get_Send_Panel;


/**
 * 
 * @author hy
 * 这一栏是httpclient请求页面底板
 */
public class HttpClient_Panel {
	public static JPanel httpClient_Panel(int x,int y){
		JPanel httpClient_panel=new JPanel();
		httpClient_panel.setLayout(null); 

		httpClient_panel.setBounds(0,(int)(y*0.035),x,(int)(y*0.965));
		
		httpClient_panel.setBackground(Color.blue);
		            
		JPanel hssp=new HttpClient_Single_Get_Send_Panel().httpClient_Single_Get_Send_Panel(x, y);
		httpClient_panel.add(hssp);

		JPanel hsgscp=new HttpClient_Single_Get_Send_Console_Panel().httpClient_Single_Get_Send_Console_Panel(x, y);
		httpClient_panel.add(hsgscp);
		
		return httpClient_panel;
	}
}
