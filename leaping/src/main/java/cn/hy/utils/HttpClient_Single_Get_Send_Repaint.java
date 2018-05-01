package cn.hy.utils;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cn.hy.httpclient_compoments.HttpClient_Single_Get_Send_Clear_Button;
import cn.hy.httpclient_compoments.HttpClient_Single_Get_Send_JTextField;
import cn.hy.httpclient_compoments.HttpClient_Single_Get_Send_Url_Button;
import cn.hy.httpclient_compoments.HttpClient_Single_Get_Send_Url_JLabel;


/**
 * 
 * @author hy
 * 重绘getPanel页面
 */
public class HttpClient_Single_Get_Send_Repaint {
	public static void httpClient_Single_Get_Send_Repaint(int x,int y,JPanel hssp,String m){
		hssp.removeAll();
		JLabel hssp_JLable_urlname = new HttpClient_Single_Get_Send_Url_JLabel().httpClient_Single_Get_Send_Url_JLabel(x, y);
		hssp.add(hssp_JLable_urlname);
		
		JTextField hsgsp_get_url_JTextField=new HttpClient_Single_Get_Send_JTextField().httpClient_Single_Get_Send_JTextField(m);
		hssp.add(hsgsp_get_url_JTextField);
		
		JButton hsgsub=new HttpClient_Single_Get_Send_Url_Button().httpClient_Single_Get_Send_Url_Button(x,y,hsgsp_get_url_JTextField,hssp);
		hssp.add(hsgsub);

		JButton clearb=new HttpClient_Single_Get_Send_Clear_Button().httpClient_Single_Get_Send_Url_Button(x, y, hssp);
		hssp.add(clearb);
	}
}
