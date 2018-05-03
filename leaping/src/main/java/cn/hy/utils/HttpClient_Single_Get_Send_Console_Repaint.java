package cn.hy.utils;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cn.hy.httpclient_compoments.HttpClient_Single_Get_Send_Console_Button;
import cn.hy.httpclient_compoments.HttpClient_Single_Get_Send_Console_JLabel;
import cn.hy.httpclient_compoments.HttpClient_Single_Get_Send_Console_JTextField;

public class HttpClient_Single_Get_Send_Console_Repaint {
	public static void httpClient_Single_Get_Send_Console_Repaint(int x,int y,JPanel hsgscp,String url){
		hsgscp.removeAll();
		
		
		JLabel consoleJLable=new HttpClient_Single_Get_Send_Console_JLabel().httpClient_Single_Get_Send_Console_JLabel(x, y);
		hsgscp.add(consoleJLable);
		
		
		JTextField hsgsc=new HttpClient_Single_Get_Send_Console_JTextField().httpClient_Single_Get_Send_Console_JTextField();
		hsgsc.setText(url);
		hsgscp.add(hsgsc);
		
		JButton console_button=new HttpClient_Single_Get_Send_Console_Button().httpClient_Single_Get_Send_Console_Button(x, y,hsgscp,hsgsc);
		hsgscp.add(console_button);
	}
}
