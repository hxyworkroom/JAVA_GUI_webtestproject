package cn.hy.httpclient_compoments;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cn.hy.utils.HttpClient_Single_Get_Send_Repaint;

/**
 * 
 * @author hy
 * @mail:hzzwmy@sina.com
 * 这是httpClient单次进行语句发送的页面
 * 主要进行get提交测试
 * 返回值主要是头信息，和具体页面信息
 */
public class HttpClient_Single_Get_Send_Panel {
	public JPanel httpClient_Single_Get_Send_Panel(int x,int y){
		JPanel hssp=new JPanel();
		hssp.setLayout(null); 
		hssp.setBounds(5,5,(int)(x*0.3),(int)(y*0.25));
//		hssp.setBounds(5,5,800,800);
		hssp.setBackground(Color.white);
		//url字符
		JLabel hssp_JLable_urlname = new HttpClient_Single_Get_Send_Url_JLabel().httpClient_Single_Get_Send_Url_JLabel(x, y);
		hssp.add(hssp_JLable_urlname);
		//输入框
		JTextField hsgsp_get_url_JTextField=new HttpClient_Single_Get_Send_JTextField().httpClient_Single_Get_Send_JTextField("");
		hssp.add(hsgsp_get_url_JTextField);
		//发送按钮
		JButton hsgsub=new HttpClient_Single_Get_Send_Url_Button().httpClient_Single_Get_Send_Url_Button(x,y,hsgsp_get_url_JTextField,hssp);
		hssp.add(hsgsub);
		//刷新按钮
		JButton clearb =new HttpClient_Single_Get_Send_Clear_Button().httpClient_Single_Get_Send_Url_Button(x, y,hssp);

		hssp.add(clearb);

		return hssp;
	}
}
